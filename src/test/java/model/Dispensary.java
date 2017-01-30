package model;

public class Dispensary {
    private String name;
    private String phoneNumber;
    private String email;
    private int scheduleStartTime;
    private int scheduleEndTime;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getScheduleStartTime() {
        return scheduleStartTime;
    }

    public void setScheduleStartTime(int scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
    }

    public int getScheduleEndTime() {
        return scheduleEndTime;
    }

    public void setScheduleEndTime(int scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
