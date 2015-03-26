<%@ taglib prefix="s" uri="/struts-tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Administrate answers</title>
    <link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet" type="text/css"/>
</head>

<body>

<div id="wrapper">
    <s:form action="saveAnswers" method="POST">
        <fieldset>
            <legend>Administrate answers</legend>
            <s:iterator value="examQuestions" status="stat">
                <s:textfield name="examQuestions[%{#stat.index}].answer" label="%{question}" value="%{answer}"/>
                <s:hidden name="examQuestions[%{#stat.index}].question" value="%{question}"/>
            </s:iterator>
            <s:submit value="Save"/>
        </fieldset>
    </s:form>
</div>
</body>
</html>