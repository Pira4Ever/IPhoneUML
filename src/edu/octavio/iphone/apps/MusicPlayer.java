package edu.octavio.iphone.apps;

public class MusicPlayer extends App {
    private String currentMusic;
    @Override
    void openApp() {
        System.out.println("Opening Music Player app");
    }

    @Override
    public void closeApp() {
        System.out.println("Closing Music Player app");
    }

    @Override
    public String toString() {
        return "Music Player";
    }

    public void play() {
        System.out.printf("Playing %s\n", currentMusic);
    }

    public void pause() {
        System.out.println("Paused");
    }

    public void setCurrentMusic(String music) {
        currentMusic = music;
    }

    public String getCurrentMusic() {
        return currentMusic;
    }

    public MusicPlayer() {
        openApp();
    }

}
