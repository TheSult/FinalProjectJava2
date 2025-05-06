package org.example.champexamen_app;

public class TFQuestion extends Question{

    public TFQuestion() {
        super();
    }

    public TFQuestion(String questionText, String correctAnswer, QuestionType questionType) {
        super(questionText, correctAnswer, questionType);
    }

    @Override
    public String toString() {
        return "\nTFQuestion{" + this.getQuestionText()+
                "\nANS: " + this.getCorrectAnswer()+
                '}';
    }
}
