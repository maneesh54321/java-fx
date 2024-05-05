package com.ms.javafx.action;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ButtonEventHandler implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent actionEvent) {
		System.out.println("You clicked the button");
	}
}
