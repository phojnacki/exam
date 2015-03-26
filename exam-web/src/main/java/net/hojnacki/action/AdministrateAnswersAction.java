package net.hojnacki.action;

import beans.ExamQuestion;
import beans.ExamQuestionsService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.SessionAware;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;
import java.util.Map;

@Results({
        @Result(name = "success", location = "administrateAnswers.jsp"),
        @Result(name = "error", location = "error.jsp")})
@Action("administrateAnswers")
public class AdministrateAnswersAction implements SessionAware {

    public List<ExamQuestion> examQuestions;

    public String execute() {
        if (examQuestions != null) {
            return "success";
        }

        ExamQuestionsService examQuestionsService = null;
        try {
            InitialContext ic = new InitialContext();
            examQuestionsService = (ExamQuestionsService) ic.lookup("java:global/examBusinessLogic.ear/exam-business-logic-1.0-SNAPSHOT/ExamQuestionsServiceBean");
        } catch (NamingException e) {
            return "error";
        }
        examQuestions = examQuestionsService.getExamQuestions();
        return "success";
    }


    @Override
    public void setSession(Map<String, Object> sessionAttrs) {
        examQuestions = (List<ExamQuestion>) sessionAttrs.get("examQuestions");
    }
}
