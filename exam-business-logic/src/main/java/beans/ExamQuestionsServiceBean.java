package beans;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless(mappedName = "ExamQuestionsService")
@Remote(ExamQuestionsService.class)
public class ExamQuestionsServiceBean implements ExamQuestionsService {

    @Override
    public List<ExamQuestion> getExamQuestions() {
        ExamQuestion examQuestion1 = new ExamQuestion();
        examQuestion1.setQuestion("What is the current version of Struts framework?");
        examQuestion1.setAnswer("2.3.20");
        ExamQuestion examQuestion2 = new ExamQuestion();
        examQuestion2.setQuestion("How many principles are in S.O.L.I.D.?");
        examQuestion2.setAnswer("5");
        ExamQuestion examQuestion3 = new ExamQuestion();
        examQuestion3.setQuestion("Software design pattern in which an object, called the subject, maintains a list of its dependents and notifies them automatically of any state changes");
        examQuestion3.setAnswer("Observer");

        List result = new ArrayList();
        result.add(examQuestion1);
        result.add(examQuestion2);
        result.add(examQuestion3);

        return result;
    }

    @Override
    public List<ExamQuestion> getWithoutAnswer(List<ExamQuestion> examQuestions) {
        List<ExamQuestion> result = new ArrayList();
        for (ExamQuestion examQuestion : examQuestions) {
            ExamQuestion questionWithoutAnswer = new ExamQuestion();
            questionWithoutAnswer.setQuestion(examQuestion.getQuestion());
            result.add(questionWithoutAnswer);
        }
        return result;
    }

}
