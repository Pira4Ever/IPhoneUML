package edu.octavio.iphone;

import edu.octavio.iphone.apps.InternetNavigator;
import edu.octavio.iphone.apps.MusicPlayer;
import edu.octavio.iphone.apps.Phone;

public class Client {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        InternetNavigator internetNavigator = iPhone.openInternetNavigator();
        System.out.printf("Current app: %s\n", iPhone.getCurrentApp());
        internetNavigator.openNewTab();
        internetNavigator.showPage("https://www.dio.me/");
        internetNavigator.updatePage();
        System.out.printf("Current url: %s\n", internetNavigator.getCurrentUrl());
        iPhone.closeApp();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Phone phone = iPhone.openPhone();
        System.out.printf("Current app: %s\n", iPhone.getCurrentApp());
        phone.call("+55 (11)99999-9999");
        phone.answer();
        phone.checkVoiceMail();
        iPhone.closeApp();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        MusicPlayer musicPlayer = iPhone.openMusicPlayer();
        System.out.printf("Current app: %s\n", iPhone.getCurrentApp());
        musicPlayer.setCurrentMusic("Queen - Bohemian Rhapsody");
        musicPlayer.play();
        System.out.printf("Current music: %s", musicPlayer.getCurrentMusic());
        musicPlayer.pause();
        iPhone.closeApp();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
