package interfaces;

public interface Hotspot {

    default void createHotspot(int amount) throws InterruptedException {
        validRandomSignUp();
        openHotspots();
        for (int i = 0; i < amount; i++) {
            addHotspot();
        }
        logout();

    }

    void logout() throws InterruptedException;

    void validRandomSignUp() throws InterruptedException;

    void openHotspots();

    default void addHotspot() throws InterruptedException {
        String hotspotTitle = "test";
        String hotspotDescription = "test";
        String hotspotTag = "test";
        Thread.sleep(20000);
        pressCreateHotspotButton();
        enterHotspotTitle(hotspotTitle);
        enterDescription(hotspotDescription);
        enterTag(hotspotTag);
        pressSaveHotspot();
    }

    void pressSaveHotspot();

    void enterTag(String hotspotTag);

    void enterHotspotTitle(String hotspotTitle);

    void enterDescription(String hotspotDescription);

    void pressCreateHotspotButton() throws InterruptedException;


}
