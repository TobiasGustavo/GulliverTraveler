package br.com.gullivertraveler;

public class Accommodation {
    private String guest;
    private String email;

    public Accommodation () {
        super();
    }

    public Accommodation(String guest, String email) {
        super();
        this.guest = guest;
        this.email = email;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
