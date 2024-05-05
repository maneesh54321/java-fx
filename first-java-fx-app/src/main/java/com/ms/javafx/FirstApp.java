package com.ms.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FirstApp extends Application {

	private Button button;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Title of the window");

		button = new Button("Click me!");

		button.setOnAction(event -> System.out.println("You clicked the button!!!"));

		StackPane layout = new StackPane();
		layout.getChildren().add(button);

		Scene scene = new Scene(layout, 300, 250);

		stage.setScene(scene);

		stage.show();
	}
}