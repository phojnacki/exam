package net.hojnacki.action;

import beans.ExamQuestion;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;

import java.util.List;
import java.util.Map;

@Result(name = "success", location = "index.jsp")
@Action("saveAnswers")
public class SaveAnswersAction implements SessionAware {

    private List<ExamQuestion> examQuestions;

    Map<String, Object> sessionAttrs;

    public List<ExamQuestion> getExamQuestions() {
        return examQuestions;
    }

    public void setExamQuestions(List<ExamQuestion> examQuestions) {
        this.examQuestions = examQuestions;
    }

    public String execute() {
        sessionAttrs.put("examQuestions", examQuestions);
        return "success";
    }

    @Override
    public void setSession(Map<String, Object> sessionAttrs) {
        this.sessionAttrs = sessionAttrs;
    }
}
