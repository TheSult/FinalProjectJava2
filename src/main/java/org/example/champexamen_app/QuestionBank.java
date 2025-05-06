package org.example.champexamen_app;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class QuestionBank {

    private LinkedList<Question> questions;

    public QuestionBank() {
        this.questions = new LinkedList<>();

    }

    public QuestionBank(LinkedList<Question> questions) {
        this.questions = new LinkedList<>();
        this.questions.addAll(questions);
    }

    public LinkedList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(LinkedList<Question> questions) {
        this.questions = new LinkedList<>();
        this.questions.addAll(questions);
    }

    public void printQuestion() {
        for (Question q : this.getQuestions()) {
            System.out.println(q);
        }
    }

    public void readMCQ(String fName) {

        try {
            File fileObj = new File(fName);
            Scanner myScanner = new Scanner(fileObj);

            while (myScanner.hasNext()) {
                String line = myScanner.nextLine();
                String[] items = line.split("\\.");
                String questionText = items[1];
                System.out.println(questionText);
                LinkedList<String> options = new LinkedList<>();
                String firstThreeLetters;
                do {
                    line = myScanner.nextLine().trim();
                    firstThreeLetters = line.substring(0, 3);
                    if (!firstThreeLetters.equals("ANS")) { // it is an option
                        String optionText = line.substring(2);
                        options.add(optionText);

                    }
                } while (!firstThreeLetters.equals("ANS"));
                // now the line variable contains the answer
                String correctAnswer = line.substring(4).trim();

                MCQuestion question = new MCQuestion(questionText, correctAnswer, QuestionType.MCQ, options);

                questions.add(question);
                System.out.println(line);
            }

        } catch (java.io.FileNotFoundException ex) {
            System.out.println("Error: File not found. " + fName);
        }
    }

    public void readTFQ(String fName) {

        try {
            File fileObj = new File(fName);
            Scanner myScanner = new Scanner(fileObj);

            while (myScanner.hasNext()) {
                String line = myScanner.nextLine();
                String[] items = line.split("\\.");
                String questionText = items[1];
                //System.out.println(questionText);
                line = myScanner.nextLine().trim();
                // now the line variable contains the answer
                String correctAnswer = line.substring(4).trim();

                TFQuestion question = new TFQuestion(questionText, correctAnswer, QuestionType.TFQ);

                questions.add(question);
                System.out.println(line);
            }

        } catch (java.io.FileNotFoundException ex) {
            System.out.println("Error: File not found. " + fName);
        }
    }

    public LinkedList<Question> selectRandQuestions(int[] indices) {
        LinkedList<Question> examQuestions = new LinkedList<>();
        int currentIndex = 0;
        try {
            for (int i : indices) {
                currentIndex = i;
                Question question = this.getQuestions().get(i); // may fail
                examQuestions.add(question);
            }
            return examQuestions;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Number of questions is " + this.getQuestions().size() +
                    " , Index " + currentIndex);
        }
        return examQuestions;
    }
}
