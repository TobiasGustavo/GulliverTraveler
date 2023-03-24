package br.com.gullivertraveler;

public class Accommodation {
    private Guest guest;
    private String email;
    private String address;
    private String phone;
 
    public Accommodation() {
        super();
    }

    public Accommodation(Guest guest, String email, String address, String phone) {
        super();
        this.guest = guest;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
