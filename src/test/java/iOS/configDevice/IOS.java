package iOS.configDevice;

public class IOS {
    private final String platformName = "iOS";
    private final String fullReset = "false";
    private final String noReset = "true";
    private String deviceName;
    private String platformVersion;
    private String udid;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getPlatformName() {
        return platformName;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    public String getUdid() {
        return udid;
    }

    public void setUdid(String udid) {
        this.udid = udid;
    }

    public String getFullReset() {
        return fullReset;
    }

    public String getNoReset() {
        return noReset;
    }


}
