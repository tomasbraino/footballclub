package myclasses;

public class Sector {

    private String name;
    private Integer id;
    private Integer amountPlaces;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
