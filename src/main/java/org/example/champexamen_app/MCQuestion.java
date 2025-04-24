package org.example.champexamen_app;

import java.util.LinkedList;

public class MCQuestion extends Question{

    private LinkedList<String> options;



    // No-argument Constructor
    public MCQuestion() {
        super();
        options = new LinkedList<>();
    }



    // All-argument Constructor
    public MCQuestion(String questionText, String correctAnswer, QuestionType questionType, LinkedList<String> optionsParam) {
        super(questionText, correctAnswer, questionType);
        options = new LinkedList<>();
        options.addAll(optionsParam);
    }


}
