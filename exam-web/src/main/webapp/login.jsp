<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
Login into app:<br/>
<form method="POST" action="j_security_check">
    User:<input type="text" name="j_username"/><br/>
    Password:<input type="password" name="j_password"/><br/>
    <input type="submit" name="j_user" value="Login"/>
</form>


</body>
</html>