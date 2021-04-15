package videoClass;

import javafx.scene.control.Label;
import javafx.scene.media.Media;

public class VideoItems extends Label {
    private Media video;

    public VideoItems(String VideoPath, Media Video ){
        this.video = video;
        super.setText("Video name: " + getVideoName(VideoPath));
    }

    private String getVideoName(String videoPath) {
        String [] partsPath  = videoPath.split("/");
        return partsPath[partsPath.length - 1];
    }
    public Media getVideo() {
        return video;
    }
}
