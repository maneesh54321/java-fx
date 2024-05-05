package com.ms.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleScenesApp extends Application {

	private Scene scene1, scene2;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Label label1 = new Label("Welcome to first scene!");
		Button button1 = new Button("Goto scene2");
		button1.setOnAction(e -> stage.setScene(scene2));

		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, button1);

		scene1 = new Scene(layout1, 200, 200);

		// button 2
		Button button2 = new Button("This scene suxx, go back to scene1");
		button2.setOnAction(e -> stage.setScene(scene1));

		StackPane layout2 = new StackPane();
		layout2.getChildren().add(button2);
		scene2 = new Scene(layout2, 600, 300);

		stage.setScene(scene1);
		stage.setTitle("Title here");
		stage.show();
	}
}
