package com.ms.javafx;

import com.ms.javafx.window.ConfirmBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AlertDemo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		stage.setTitle("Alert Demo");

		Button button = new Button("Show alert");
//		button.setOnAction(e -> AlertBox.display("Alert!!!", "This is the alert you built!!"));
		button.setOnAction(e -> {
			boolean result = ConfirmBox.display("Alert!!!", "This is the alert you built!!");
			System.out.println(result);
		});
		StackPane layout = new StackPane();
		layout.getChildren().add(button);

		Scene scene = new Scene(layout, 300, 500);
		stage.setScene(scene);
		stage.show();
	}
}
