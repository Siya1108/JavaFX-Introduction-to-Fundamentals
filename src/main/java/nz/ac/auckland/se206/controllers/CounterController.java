package nz.ac.auckland.se206.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import nz.ac.auckland.se206.App;

public class CounterController {
  private int count = 0;

  private void updateLabel() {
    numberLabel.setText(Integer.toString(count));
  }

  @FXML private Button incrementButton;
  @FXML private Button decrementButton;
  @FXML private Button resetButton;
  @FXML private Button switchButton;
  @FXML private Label numberLabel;

  @FXML
  private void increment() {
    count++;
    updateLabel();
  }

  @FXML
  private void decrement() {
    count--;
    updateLabel();
  }

  @FXML
  private void reset() {
    count = 0;
    updateLabel();
  }

  @FXML
  private void switchToMusicPlayer(ActionEvent event) {
    Button button = (Button) event.getSource();
    Scene sceneButtonIsIn = button.getScene();

    try {
      sceneButtonIsIn.setRoot(App.loadFXML("musicplayer"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @FXML
  private void initialize() {
    // Initialization code for the counter scene
    System.out.println("*** Initializing Counter *** " + this);
  }
}
