package br.com.gullivertraveler.implementation;

import java.time.LocalDateTime;

import br.com.gullivertraveler.Guest;

public class TestGuest {
  
    public static void main(String[] args) { 
        Guest guest = new Guest();
        
        guest.setRegistrationNumber(334);
        guest.setDataRecord(LocalDateTime.now());
        guest.setTimeStay(5);
        guest.setCheckIn(LocalDateTime.of(2023, 3, 23, 14, 30));
        guest.setCheckOut(LocalDateTime.of(2023, 3, 28, 10, 0));
        
        System.out.println("Número de registro: " + guest.getRegistrationNumber());
        System.out.println("Data de registro: " + guest.getDataRecord());
        System.out.println("Tempo de estadia: " + guest.getTimeStay() + " dias");
        System.out.println("Check-in: " + guest.getCheckIn());
        System.out.println("Check-out: " + guest.getCheckOut());
    }
}
