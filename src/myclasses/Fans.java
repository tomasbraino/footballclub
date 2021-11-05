package myclasses;

public class Fans extends Person {

    private Integer fanId;
    private String stadiumSector;

    //methods
    public Fans(String name, Integer phoneNumber, Integer id, Integer fanId, String stadiumSector) {
        super(name, phoneNumber, id);
        this.fanId = fanId;
        this.stadiumSector = stadiumSector;
    }

    @Override
    public String toString() {
        return "Name: " + "\n" + getName() + "\n" + "phone number: " + "\n" + getPhoneNumber() +
                "\n" + "id: " + getId()+ "\n" +"fan id: "+ getFanId() + "\n" +
                "Stadium sector: " + getStadiumSector();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String run() {
        return "Running to get tickets for the next match";
    }

    @Override
    public String talk() {
        return "Talk after the game with other fans";
    }

    public String sing() {
        return "Singing famous song";
    }

    //getters and setters
    public Integer getFanId() {
        return fanId;
    }

    public void setFanId(Integer fanId) {
        this.fanId = fanId;
    }

    public String getStadiumSector() {
        return stadiumSector;
    }

    public void setStadiumSector(String stadiumSector) {
        this.stadiumSector = stadiumSector;
    }
}
