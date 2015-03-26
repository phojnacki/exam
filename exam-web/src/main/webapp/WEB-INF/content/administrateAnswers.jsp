<%@ taglib prefix="s" uri="/struts-tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Administrate answers</title>

</head>
<body>

<h1>Administrate answers</h1>
<s:form action="saveAnswers" method="POST">
    <s:iterator value="examQuestions" status="stat">
        <s:textfield name="examQuestions[%{#stat.index}].answer" label="%{question}" value="%{answer}"/>
        <s:hidden name="examQuestions[%{#stat.index}].question" value="%{question}"/>
    </s:iterator>
    <s:submit value="Save"/>
</s:form>

</body>
</html>