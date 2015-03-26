<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>No answers yet</title>
    <link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div id="wrapper">
    <s:form action="redirectToIndex" method="POST">
        <fieldset>
            <legend>No answers configured</legend>
            <s:submit value="Back"/>
        </fieldset>
    </s:form>
</div>
</body>
</html>