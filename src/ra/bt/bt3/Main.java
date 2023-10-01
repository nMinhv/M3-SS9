package ra.bt.bt3;

public class Main {
    public static void main(String[] args) {
        Playable audioPlay = new AudioPlay();
        Playable videoPlay = new VideoPlay();
        audioPlay.play();
        videoPlay.play();
    }
}
