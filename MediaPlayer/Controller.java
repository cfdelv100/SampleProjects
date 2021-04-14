package MediaPlayer;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaView;
import javafx.scene.media.MediaPlayer;
import javafx.stage.FileChooser;
import javafx.stage.Window;
import videoClass.VideoItems;

public class Controller {
    public MediaView mediaPlayer;
    public MediaView mediaView;
    public ListView<VideoItems> videoLibrary;
    public Button btnPlay;
    private Window primaryStage;

    public void loadVideo(ActionEvent actionEvent) {
       // System.out.println("Load Video");
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Load Video File");
        String videoPath = fileChooser.showOpenDialog(primaryStage).toURI().toString();
        Media video = new Media(videoPath);
        playVideo(video);
        addToLibrary(videoPath, video);
    }

    private void addToLibrary(String videoPath, Media video) {
        videoLibrary.getItems().add(new VideoItems(videoPath,video));

    }

    private void playVideo(Media video){
        MediaPlayer mediaPlayer = new MediaPlayer(video);
        mediaPlayer.setAutoPlay(false);
        mediaView.setMediaPlayer(mediaPlayer);
    }

    public void toggleVideoPlay(MouseEvent mouseEvent) {
        //System.out.println("Button clicked");
        if(mouseEvent.getButton().equals(MouseButton.PRIMARY)){
            if(mediaView.getMediaPlayer().getStatus().equals(MediaPlayer.Status.PLAYING))
                mediaView.getMediaPlayer().pause();
            else
                mediaView.getMediaPlayer().play();
        }

    }

    public void onVideoSelected(MouseEvent mouseEvent) {
        VideoItems selectedItem = videoLibrary.getSelectionModel().getSelectedItem();
        if(selectedItem!= null)
            playVideo(selectedItem.getVideo());

    }


}
