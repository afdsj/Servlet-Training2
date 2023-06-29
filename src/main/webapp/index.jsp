<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>후참잘</title>
</head>
<body>
    <h3> 비회원 정보 </h3>
    <form action="order" method="post">
        <label> 이름 : </label> <input type="text" name="name">
        <br/>
        <label> 비밀번호 : </label> <input type="password" name="password">
        <br/>
        <label> 전화번호 : </label> <input type="text" name="call">
        <br/>
        <label> 주소 : </label> <input type="text" name="add">
        <br/>
        <input type="submit" value="확인">
    </form>
</body>
</html>