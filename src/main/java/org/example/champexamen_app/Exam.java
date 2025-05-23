package org.example.champexamen_app;

import java.util.HashMap;
import java.util.LinkedList;

public class Exam {

    HashMap<Integer, Question> questions;
    HashMap<Integer, String> submittedAnswers;

    public Exam() {
        this.questions = new HashMap<>();
        this.submittedAnswers = new HashMap<>();
    }

    public Exam(HashMap<Integer, Question> questions, HashMap<Integer, String> submittedAnswers) {
        this.questions = new HashMap<>();
        this.questions.putAll(questions);
        this.submittedAnswers = new HashMap<>();
        this.submittedAnswers.putAll(submittedAnswers);
    }

    public void clearQuestions(){
        this.questions.clear();
        this.submittedAnswers.clear();
    }

    public Question getQuestion(int i) {
        return this.questions.get(i);
    }

    public String getSubmittedAnswer(int i) {
        return this.submittedAnswers.get(i);
    }

    public void printAllQuestions(){
        for(int key : questions.keySet()){
            System.out.println(this.questions.get(key));
        }

    }

    public HashMap<Integer, Question> getQuestions() {
        return questions;
    }

    public void setQuestions(HashMap<Integer, Question> questions) {
        this.questions = new HashMap<>();
        this.questions.putAll(questions);
    }

    public HashMap<Integer, String> getSubmittedAnswers() {
        return submittedAnswers;
    }

    public void setSubmittedAnswers(HashMap<Integer, String> submittedAnswers) {
        this.submittedAnswers = new HashMap<>();
        this.submittedAnswers.putAll(submittedAnswers);
    }

    public Exam(LinkedList<Question> questionList){
        this.questions = new HashMap<>();
        this.submittedAnswers = new HashMap<>();
        int i = 1;
        for (Question questions : questionList) {
            this.questions.put(i, questions);
            this.submittedAnswers.put(i, ""); // important initialize tbe submittedAnswers hashmap
            i++;
        }


    }
}