package com.example.hellofx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
    @Override
    public void start(Stage stage) {
        String initialMessage = "Welcome, Benjamin Chuswe!";
        Label message = new Label(initialMessage);

        Button startButton = new Button("Start");
        startButton.setOnAction(event ->
                message.setText("Great! You clicked Start.")
        );

        Button resetButton = new Button("Reset");
        resetButton.setOnAction(event ->
                message.setText(initialMessage)
        );

        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(message, startButton, resetButton);

        Scene scene = new Scene(layout, 500, 300);
        stage.setTitle("My First JavaFX Application - 202504791");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}