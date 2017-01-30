package model;

public class PainClinic {

    private String name;
    private String specialization;
    private String phoneNumber;
    private String email;
    private byte scheduleStartTime;
    private byte scheduleEndTime;

    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
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

    public byte getScheduleStartTime() {
        return scheduleStartTime;
    }

    public void setScheduleStartTime(byte scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
    }

    public byte getScheduleEndTime() {
        return scheduleEndTime;
    }

    public void setScheduleEndTime(byte scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
