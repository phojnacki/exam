<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 25.03.15
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to exam starter</title>
</head>
<body>
<h1>Welcome to exam starter</h1><br/><br/>

<h3><a href="<s:url action="administrateAnswers"/>">Administrate answers</a></h3><br/>

<h3><a href="<s:url action="takeAnExam"/>">Take an exam</a></h3>
</body>
</html>