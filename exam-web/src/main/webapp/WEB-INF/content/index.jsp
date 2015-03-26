<%@ taglib prefix="s" uri="/struts-tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to exam starter</title>
    <link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div id="wrapper">
    <s:form method="POST">
        <fieldset>
            <legend>Welcome to exam starter</legend>
            <s:submit action="administrateAnswers" value="Administrate answers"/>
            <s:submit action="takeAnExam" value="Take an exam"/>
        </fieldset>
    </s:form>
</div>

</body>
</html>