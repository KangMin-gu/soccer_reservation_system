<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>users/signupform.do</title>
</head>
<body>
<h3>회원가입폼입니다.</h3>
<form action="signup.do" method="post">
	<label for="id">아이디</label>
	<input type="text" name="id" id="id" /><br/>
	<label for="pwd">비밀번호</label>
	<input type="password" name="pwd" id="pwd"/><br/>
	<label for="pwd2">비밀번호 확인</label>
	<input type="password" name="pwd2" id="pwd2" /><br/>
	<label for="findQuestion">비밀번호 찾기 질문 선택</label>
	<select name="findQuestion" id="findQuestion">
		<option value="나의 초등학교 이름은?">나의 초등학교 이름은?</option>
		<option value="나의 중학교 이름은?">나의 중학교 이름은?</option>
		<option value="나의 고등학교 이름은?">나의 고등학교 이름은?</option>
		<option value="나의 대학교 이름은?">나의 대학교 이름은?</option>
	</select><br/>
	<label for="findAnswer">비밀번호 찾기 질문 답변</label>
	<input type="text" name="findAnswer" id="findAnswer" /><br/>
	<label for="name">이름</label>
	<input type="text" name="name" id="name" /><br/>
	<label for="email">이메일</label>
	<input type="text" name="email" id="email" /><br/>
	<label for="phone">전화번호</label>
	<input type="text" name="phone" id="phone" /><br/>
	<label for="addr">주소</label>
	<input type="text" name="addr" id="addr" /><br/>
	<button type="submit">가입하기</button>
</form>
</body>
</html>