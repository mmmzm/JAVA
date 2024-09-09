import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MP3Player {
    public static void main(String[] args) {
        String mp3FilePath = "D:\\JAP_20249311\\01_JAVA\\WORKSPACE\\J23\\src\\file_example_MP3_1MG.mp3";

        try {
            // MP3 파일을 읽을 FileInputStream 생성
            FileInputStream fis = new FileInputStream(mp3FilePath);
            BufferedInputStream bis = new BufferedInputStream(fis);

            // MP3 파일을 재생할 Player 생성
            Player player = new Player(bis);

            // MP3 재생
            player.play();
        } catch (FileNotFoundException | JavaLayerException e) {
            e.printStackTrace();
        }
    }
}
