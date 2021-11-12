package model;

public class Sector {

    private String name;
    private int id;
    private int amountPlaces;

    public Sector(String name, Integer id, Integer amountPlaces) {
        this.name = name;
        this.id = id;
        this.amountPlaces = amountPlaces;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
