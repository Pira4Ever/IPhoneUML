package edu.octavio.iphone;

import edu.octavio.iphone.apps.App;
import edu.octavio.iphone.apps.InternetNavigator;
import edu.octavio.iphone.apps.MusicPlayer;
import edu.octavio.iphone.apps.Phone;

public class IPhone {
    private App currentApp;

    InternetNavigator openInternetNavigator() {
        InternetNavigator internetNavigator = new InternetNavigator();
        currentApp = internetNavigator;
        return internetNavigator;
    }

    Phone openPhone() {
        Phone phone = new Phone();
        currentApp = phone;
        return phone;
    }

    MusicPlayer openMusicPlayer() {
        MusicPlayer musicPlayer = new MusicPlayer();
        currentApp = musicPlayer;
        return musicPlayer;
    }

    void closeApp() {
        currentApp.closeApp();
        currentApp = null;
    }

    App getCurrentApp() {
        return currentApp;
    }
}
