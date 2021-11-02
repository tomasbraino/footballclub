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

}
