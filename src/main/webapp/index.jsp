<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>후참잘</title>
</head>
<body>
    <h3> 비회원 정보 </h3>
    <form action="/user/order" method="post">
        <table>
            <tr>
                <th>
                    이름 <label>&emsp;&emsp;</label>
                </th>
                <td>
                    <input type="text" name="name">
                </td>
            </tr>
            <tr>
                <th>
                    비밀번호 <label>&nbsp;</label>
                </th>
                <td>
                    <input type="password" name="password">
                </td>
            </tr>
            <tr>
                <th>
                    전화번호 <label>&nbsp;</label>
                </th>
                <td>
                    <input type="text" name="call">
                </td>
            </tr>
            <tr>
                <th>
                    주소 <label>&emsp;&emsp;</label>
                </th>
                <td>
                    <input type="text" name="add">
                </td>
            </tr>
            <tr>
                <td colspan="4">
                    <button type="submit">확인</button>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>