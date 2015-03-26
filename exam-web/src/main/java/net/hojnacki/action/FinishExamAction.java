package net.hojnacki.action;

import beans.ExamQuestion;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.SessionAware;

import java.util.List;
import java.util.Map;

@Results({
        @Result(name = "success", location = "/", type = "redirect"),
        @Result(name = "input", location = "takeAnExam.jsp")})
@Action("finishExam")
public class FinishExamAction extends ActionSupport implements SessionAware {

    public List<ExamQuestion> examQuestionsStudent;

    private List<ExamQuestion> examQuestionsCorectAnswers;

    public List<ExamQuestion> getExamQuestionsStudent() {
        return examQuestionsStudent;
    }

    public void setExamQuestionsStudent(List<ExamQuestion> examQuestionsStudent) {
        this.examQuestionsStudent = examQuestionsStudent;
    }

    public String execute() {
        return "success";
    }

    @Override
    public void validate() {
        for (int i = 0; i < examQuestionsStudent.size(); i++) {
            String studentAnswer = examQuestionsStudent.get(i).getAnswer();
            String correctAnswer = examQuestionsCorectAnswers.get(i).getAnswer();
            String fieldName = "examQuestionsStudent[" + i + "].answer";
            if (StringUtils.isEmpty(studentAnswer) || !studentAnswer.equals(correctAnswer)) {
                addFieldError(fieldName, "The correct answer is " + correctAnswer);
            }
        }
    }

    @Override
    public void setSession(Map<String, Object> sessionAttrs) {
        examQuestionsCorectAnswers = (List<ExamQuestion>) sessionAttrs.get("examQuestions");

    }
}
