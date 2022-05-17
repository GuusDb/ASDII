package gui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

import domein.DomeinController;
import javafx.application.Platform;
import javafx.event.ActionEvent;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class TellerPaneController extends BorderPane {

	@FXML
	private Label labTeller;

	private DomeinController dc;

	public TellerPaneController(DomeinController dc) {
		this.dc = dc;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("TellerPane.fxml"));
		loader.setRoot(this);
		loader.setController(this);
		try {
			loader.load();
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
		dc.addObserver((sub, old, newV) -> Platform.runLater(() -> labTeller.setText(newV.toString())));

	}

	// Event Listener on Button.onAction
	@FXML
	public void resume(ActionEvent event) {
		dc.resume();
	}

	// Event Listener on Button.onAction
	@FXML
	public void suspend(ActionEvent event) {
		dc.suspend();
	}

	// Event Listener on Button.onAction
	@FXML
	public void stop(ActionEvent event) {
		dc.stop();
	}
	
	@FXML
	public void restart(ActionEvent event) {
		dc.restart();
		dc.addObserver((sub, old, newV) -> Platform.runLater(() -> labTeller.setText(newV.toString())));
	}
}
