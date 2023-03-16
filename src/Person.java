public class Person {
    private String name;
    private String sureName;

    private int quantityTickets;

    public Person(String name, String sureName, int quantityTickets) {
        this.name = name;
        this.sureName = sureName;
        this.quantityTickets = quantityTickets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public int getQuantityTickets() {
        return quantityTickets;
    }

    public void setQuantityTickets(int quantityTickets) {
        this.quantityTickets = quantityTickets;
    }
}