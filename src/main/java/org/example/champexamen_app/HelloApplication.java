package org.example.champexamen_app;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
        LinkedList<Question> exam = myBank.selectRandomQuestion(indexes);
        Exam myExam = new Exam(exam);
        myExam.printAllQuestions();

        VBox root = new VBox();
        MenuBar menuBarMain = buildMenuBar();
        Label labelGrade = new Label("Grade: ");
        HBox hBoxGrade = new HBox(labelGrade);
        hBoxGrade.setAlignment(Pos.CENTER);
        root.getChildren().add(menuBarMain);
        root.getChildren().add(hBoxGrade);



        Scene scene = new Scene( root ,320, 240);
        stage.setTitle("ChampExamen (R) application (C) ");
        stage.setScene(scene);
        stage.show();
    }

    private MenuBar buildMenuBar() {
        Menu menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");
        Menu menuQuiz = new Menu("Quiz");
        Menu menuExtras = new Menu("Extras");
        Menu menuHelp = new Menu("Help");
        MenuBar menuBar = new MenuBar(menuFile, menuEdit, menuQuiz, menuExtras, menuHelp);
        return menuBar;
    }


    public static void main(String[] args) {
        launch();
    }
}