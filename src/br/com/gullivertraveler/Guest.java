package br.com.gullivertraveler;

import java.time.LocalDateTime;

public class Guest {

    private int registrationNumber;
    private LocalDateTime dataRecord;
    private int timeStay;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;

    public Guest() {
        super();
    }
    
    public Guest(int registrationNumber, LocalDateTime dataRecord, int timeStay, LocalDateTime checkIn, LocalDateTime checkOut) {
        super();
        this.registrationNumber = registrationNumber;
        this.dataRecord = dataRecord;
        this.timeStay = timeStay;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    
    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public LocalDateTime getDataRecord() {
        return dataRecord;
    }

    public void setDataRecord(LocalDateTime dataRecord) {
        this.dataRecord = dataRecord;
    }

    public int getTimeStay() {
        return timeStay;
    }

    public void setTimeStay(int timeStay) {
        this.timeStay = timeStay;
    }
    
    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }
}
