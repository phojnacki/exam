package beans;

import java.util.List;

public interface ExamQuestionsService {

    List<ExamQuestion> getExamQuestions();

    List<ExamQuestion> getWithoutAnswer(List<ExamQuestion> examQuestions);
}
