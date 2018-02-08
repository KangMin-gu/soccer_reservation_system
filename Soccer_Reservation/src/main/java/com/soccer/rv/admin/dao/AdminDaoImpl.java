package com.soccer.rv.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.soccer.rv.users.dto.UsersDto;

@Repository
public class AdminDaoImpl implements AdminDao{
	
	@Autowired
	private SqlSession session;

	@Override
	public UsersDto getData(String id) {
		
		return session.selectOne("admin.getData",id);
	}

	@Override
	public void update(UsersDto dto) {
		session.update("admin.update",dto);
		
	}

	@Override
	public void delete(String id) {
		session.delete("admin.delete",id);
		
	}

	@Override
	public List<UsersDto> getList() {
		List<UsersDto> list = session.selectList("admin.getList");
		return list;
	}

}
