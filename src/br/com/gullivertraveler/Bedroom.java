package br.com.gullivertraveler;

public class Bedroom {
    private String roomType;
    private int maxOccupancy;
    private int floor;

    public Bedroom() {
        super();
    }

    public Bedroom(String roomType, int maxOccupancy, int floor) {
        super();
        this.roomType = roomType;
        this.maxOccupancy = maxOccupancy;
        this.floor = floor;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

}
