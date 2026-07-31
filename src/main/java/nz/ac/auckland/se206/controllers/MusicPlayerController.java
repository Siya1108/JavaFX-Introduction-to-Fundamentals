package nz.ac.auckland.se206.controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import nz.ac.auckland.se206.App;
import javafx.event.ActionEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MusicPlayerController {
  @FXML private Button firstButton;
  @FXML private Button secondButton;
  @FXML private Button switchButton;

  private MediaPlayer mediaPlayer;

  @FXML
  private void playFirstSong() {
    playSong("sound1.mp3");
  }

  @FXML
  private void playSecondSong() {
    playSong("sound2.mp3");
  }

    private void playSong(String songFileName) {
        if (mediaPlayer != null) {
        mediaPlayer.stop();
        }
    
        Media media = new Media(getClass().getResource("/sounds/" + songFileName).toExternalForm());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }

  @FXML
  private void switchToCounter(ActionEvent event) {

    if (mediaPlayer != null) {
      mediaPlayer.stop();
      mediaPlayer.dispose();
    }

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
