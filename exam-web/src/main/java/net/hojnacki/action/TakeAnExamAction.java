package net.hojnacki.action;

import beans.ExamQuestion;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.SessionAware;

import javax.naming.NamingException;
import java.util.List;
import java.util.Map;

@Results({
        @Result(name = "success", location = "takeAnExam.jsp"),
        @Result(name = "error", location = "noAnswersYet.jsp")})
@Action("takeAnExam")
public class TakeAnExamAction implements SessionAware {

    public List<ExamQuestion> examQuestionsStudent;

    public String execute() throws NamingException {
        if (examQuestionsStudent != null) {
            return "success";
        }
        return "error";
    }

    @Override
    public void setSession(Map<String, Object> sessionAttrs) {
        examQuestionsStudent = (List<ExamQuestion>) sessionAttrs.get("examQuestions");
    }

}
