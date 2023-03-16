package br.com.gullivertraveler;

public class Service {
    private String kindOfService;
    private int amount;

    public Service () {
        super();
    }

    public Service(String kindOfService, int amount) {
        super();
        this.kindOfService = kindOfService;
        this.amount = amount;
    }
    public String getKindOfService() {
        return kindOfService;
    }

    public void setKindOfService(String kindOfService) {
        this.kindOfService = kindOfService;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
