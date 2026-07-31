package nz.ac.auckland.se206.controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import nz.ac.auckland.se206.App;
import javafx.event.ActionEvent;

public class MusicPlayerController {
  @FXML private Button firstButton;
  @FXML private Button secondButton;
  @FXML private Button switchButton;

  @FXML
  private void handleFirstButtonClick() {
    // Handle first button click event, play sound1


  }

  @FXML
  private void handleSecondButtonClick() {
    // Handle second button click event
  }

  @FXML
  private void switchToCounter(ActionEvent event) {
    Button button = (Button) event.getSource();
    Scene sceneButtonIsIn = button.getScene();

    try {
      sceneButtonIsIn.setRoot(App.loadFXML("counter"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @FXML
  private void initialize() {
    // Initialization code for the music player scene
    System.out.println("*** Initializing Music Controller *** " + this);
  }
}
