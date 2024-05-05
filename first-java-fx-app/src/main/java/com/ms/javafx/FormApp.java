package com.ms.javafx;

import com.ms.javafx.window.ConfirmBox;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FormApp extends Application {

	private Stage primaryStage;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		primaryStage = stage;
		GridPane layout = new GridPane();
		layout.setPadding(new Insets(10, 10, 10, 10));
		layout.setVgap(8);
		layout.setHgap(10);

		Label usernameLabel = new Label("Username");
		TextField usernameField = new TextField("maneesh");
		GridPane.setConstraints(usernameLabel, 0, 0);
		GridPane.setConstraints(usernameField, 1, 0);


		Label passwordLabel = new Label("Password");
		TextField passwordField = new TextField();
		passwordField.setPromptText("keep quiet");
		GridPane.setConstraints(passwordLabel, 0, 1);
		GridPane.setConstraints(passwordField, 1, 1);

		Button loginButton = new Button("Login");
		loginButton.setOnAction(e ->
				System.out.printf("username: %s, password: %s\n", usernameField.getText(), passwordField.getText()));
		GridPane.setConstraints(loginButton, 1, 2);

		layout.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField, loginButton);


		Scene scene = new Scene(layout, 300, 200);
		stage.setScene(scene);
		stage.setOnCloseRequest(e -> {
			e.consume();
			closeProgram();
		});
		stage.setTitle("Login form");
		stage.show();
	}

	private void closeProgram() {
		boolean answer = ConfirmBox.display("Confirmation", "Do you really want to close the window?");
		if(answer) {
			primaryStage.close();
		}
	}
}
