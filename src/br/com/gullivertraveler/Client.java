package br.com.gullivertraveler;

public class Client {
    private String cpf;
    private String name;
    private String gender;
    private String address;
    private String email;

    public Client() {
        super();
    }
    public Client(String cpf, String name, String gender, String address, String email) {
        super();
        this.cpf =  cpf;
        this.gender = gender;
        this.address = address;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
