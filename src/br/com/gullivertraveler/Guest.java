package br.com.gullivertraveler;

import java.time.LocalDate;
import java.time.LocalTime;

public class Guest {

    private int registrationNumber;
    private LocalDate dataRecord;
    private LocalTime timeStay;

    public Guest() {
        super();
    }
    public Guest(int registrationNumber, LocalDate dataRecord, LocalTime timeStay) {
        super();
        this.registrationNumber = registrationNumber;
        this.dataRecord = dataRecord;
        this.timeStay = timeStay;
    }
    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public LocalDate getDataRecord() {
        return dataRecord;
    }

    public void setDataRecord(LocalDate dataRecord) {
        this.dataRecord = dataRecord;
    }

    public LocalTime getTimeStay() {
        return timeStay;
    }

    public void setTimeStay(LocalTime timeStay) {
        this.timeStay = timeStay;
    }


}
