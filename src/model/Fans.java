package model;

public class Fans extends Person {

    private int fanId;
    private String stadiumSector;

    //methods
    public Fans(String name, int phoneNumber, int id, int fanId, String stadiumSector) {
        super(name, phoneNumber, id);
        this.fanId = fanId;
        this.stadiumSector = stadiumSector;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "fan id: " + getFanId() + "\n" +
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
    String listen() {
        return "listening to the stadium songs";
    }

    @Override
    String talk() {
        return "talking with the other fans about the match";
    }

    public String sing() {
        return "Singing famous song";
    }

    //getters and setters
    public Integer getFanId() {
        return fanId;
    }

    public void setFanId(int fanId) {
        this.fanId = fanId;
    }

    public String getStadiumSector() {
        return stadiumSector;
    }

    public void setStadiumSector(String stadiumSector) {
        this.stadiumSector = stadiumSector;
    }
}
