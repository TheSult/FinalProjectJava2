package org.example.champexamen_app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        QuestionBank myBank = new QuestionBank();
        myBank.readMCQ("src\\main\\resources\\mcq.txt");
        myBank.readTFQ("src\\main\\resources\\tfq.txt");

        int[] indexes = {11, 0, 5};
        LinkedList<Question> exam = myBank.selectRandQuestions(indexes);
        Exam myExam = new Exam(exam);
        myExam.printAllQuestions();


        Label hello = new Label("Hello World");
        Scene scene = new Scene( hello ,320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}