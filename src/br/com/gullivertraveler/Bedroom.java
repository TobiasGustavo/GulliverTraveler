package br.com.gullivertraveler;

public class Bedroom extends Accommodation {
    private String typeOfRoom;
    private int maximumOccupation;
    private int floor;


    public Bedroom() {
        super();
    }

    public Bedroom(String typeOfRoom, int maximumOccupation, int floor) {
        super();
        this.typeOfRoom = typeOfRoom;
        this.maximumOccupation = maximumOccupation;
        this.floor = floor;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public int getMaximumOccupation() {
        return maximumOccupation;
    }

    public void setMaximumOccupation(int maximumOccupation) {
        this.maximumOccupation = maximumOccupation;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
