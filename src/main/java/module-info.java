module org.example.champexamen_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.champexamen_app to javafx.fxml;
    exports org.example.champexamen_app;
}