package org.openjfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
       //Creating a text object
        Text text = new Text(10.0, 25.0, "This is a\nparagraph.");
        //Wrapping the text
        text.setWrappingWidth(40);
        //Setting the alignment
        text.setTextAlignment(TextAlignment.CENTER);
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