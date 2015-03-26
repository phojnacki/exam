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
        @Result(name = "success", location = "takeAnExam.jsp"),
        @Result(name = "error", location = "noAnswersYet.jsp")})
@Action("takeAnExam")
public class TakeAnExamAction implements SessionAware {

    public List<ExamQuestion> examQuestionsStudent;

    private List<ExamQuestion> examQuestionsWithAnswers;

    public String execute() throws Exception {
        if (examQuestionsWithAnswers != null) {
            examQuestionsStudent = createWithoutAnswers(examQuestionsWithAnswers);
            if (examQuestionsStudent != null) {
                return "success";
            }
        }
        return "error";
    }

    private List<ExamQuestion> createWithoutAnswers(List<ExamQuestion> examQuestionsWithAnswers) throws NamingException {
        InitialContext ic = new InitialContext();
        ExamQuestionsService examQuestionsService = (ExamQuestionsService) ic.lookup("java:global/examBusinessLogicEar/examBusinessLogic/ExamQuestionsServiceBean");
        return examQuestionsService.getWithoutAnswer(examQuestionsWithAnswers);
    }

    @Override
    public void setSession(Map<String, Object> sessionAttrs) {
        examQuestionsWithAnswers = (List<ExamQuestion>) sessionAttrs.get("examQuestions");
    }

}
