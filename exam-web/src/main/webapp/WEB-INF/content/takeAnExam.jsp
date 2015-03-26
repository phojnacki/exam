<%@ taglib prefix="s" uri="/struts-tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Take an exam</title>
    <link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div id="wrapper">
    <s:form action="finishExam" method="POST">
        <fieldset>
            <legend>Taking an exam</legend>
            <s:iterator value="examQuestionsStudent" status="stat">
                <s:textfield name="examQuestionsStudent[%{#stat.index}].answer" label="%{question}" value="%{answer}"/>
                <s:hidden name="examQuestionsStudent[%{#stat.index}].question" value="%{question}"/>
            </s:iterator>
            <s:submit value="Done"/>
        </fieldset>
    </s:form>
</div>

</body>
</html>