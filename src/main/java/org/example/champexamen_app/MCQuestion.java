package org.example.champexamen_app;

import java.util.LinkedList;

public class MCQuestion extends Question {

    LinkedList<String>options;


    public MCQuestion() {
        super();
        options = new LinkedList<>();
    }

    public MCQuestion(LinkedList<String>optionsParam) {
        super();
        options = new LinkedList<>();
        this.options.addAll(optionsParam);
    }

    public MCQuestion(String questionText, String correctAnswer, QuestionType questionType,LinkedList<String>optionsParam) {
        super(questionText,correctAnswer,questionType);
        options = new LinkedList<>();
        options.addAll(optionsParam);
    }



    public LinkedList<String>getOptions() {
        return options;
    }

    public void setOptions(LinkedList<String>optionsParam) {
        this.options = new LinkedList<>();
        this.options.addAll(optionsParam);
    }


    @Override
    public String toString() {
        return "MCQuestion{" + this.getQuestionText()+"\n" + "Options=" + options + "\nANS " + this.getCorrectAnswer();
    }
}