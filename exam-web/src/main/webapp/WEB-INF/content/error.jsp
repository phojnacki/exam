<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
    <link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div id="wrapper">
    <s:form action="redirectToIndex" method="POST">
        <fieldset>
            <legend>Error occured</legend>
            <s:submit value="Back"/>
        </fieldset>
    </s:form>
    Exception Name: <s:property value="exception"/><br/>
    Exception Details: <s:property value="exceptionStack"/>
</div>
</body>
</html>