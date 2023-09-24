package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Creating a text object
        Text text = new Text(10.0, 25.0, "AAA AAA AAA");
        //Wrapping the text
        text.setWrappingWidth(40);
        //Setting the alignment
        text.setTextAlignment(TextAlignment.RIGHT);
        //Setting the stage
        Group root = new Group(text);
        Scene scene = new Scene(root, 595, 150, Color.BEIGE);
        stage.setTitle("Text Alignment");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}