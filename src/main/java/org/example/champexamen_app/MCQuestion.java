package org.example.champexamen_app;

import java.util.LinkedList;

public class MCQuestion extends Question{

    private LinkedList<String> options;



    // No-argument Constructor
    public MCQuestion() {
        super();
        options = new LinkedList<>();
    }

    public MCQuestion(LinkedList<String> optionsParam) {
        super();
        this.options = new LinkedList<>();
        this.options.addAll(optionsParam);
    }

    // All-argument Constructor
    public MCQuestion(String questionText, String correctAnswer,
                      QuestionType questionType, LinkedList<String> optionsParam) {
        super(questionText, correctAnswer, questionType);
        this.options = new LinkedList<>();
        this.options.addAll(optionsParam);
    }

    public LinkedList<String> getOptions() {
        return options;
    }

    public void setOptions(LinkedList<String> optionsParam) {
        this.options = new LinkedList<>();
    }

    public String toString() {
        return "MCQuestion{" + this.getQuestionText()+"\n" +
                "options=" + options + "\nANS: " + this.getCorrectAnswer()+
                '}';
    }
}
