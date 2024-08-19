package edu.octavio.iphone.apps;

public class Phone extends App {
    @Override
    void openApp() {
        System.out.println("Opening Phone app");
    }

    @Override
    public void closeApp() {
        System.out.println("Closing Phone app");
    }

    @Override
    public String toString() {
        return "Phone";
    }

    public void call(String number) {
        System.out.printf("Calling %s\n", number);
    }

    public void answer() {
        System.out.println("Answering the phone");
    }

    public void checkVoiceMail() {
        System.out.println("Checking voice mail");
    }

    public Phone() {
        openApp();
    }
}
