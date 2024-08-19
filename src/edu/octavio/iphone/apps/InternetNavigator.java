package edu.octavio.iphone.apps;

public class InternetNavigator extends App {
    private String currentUrl;
    @Override
    void openApp() {
        System.out.println("Opening Internet Navigator app");
    }

    @Override
    public void closeApp() {
        System.out.println("Closing Internet Navigator app");
    }

    @Override
    public String toString() {
        return "Internet Navigator";
    }

    public void showPage(String url) {
        currentUrl = url;
        System.out.printf("Showing %s page\n", url);
    }

    public void openNewTab() {
        System.out.println("Opening new tab");
    }

    public void updatePage() {
        System.out.printf("Updating %s page\n", currentUrl);
    }

    public String getCurrentUrl() {
        return currentUrl;
    }

    public InternetNavigator() {
        openApp();
    }
}
