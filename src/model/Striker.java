package model;

public class Striker extends Player implements Attack {

    private int pacePoints;
    private int shootPoints;
    private int dribblingPoints;

    public Striker(String name, int phoneNumber, int id, String fieldPosition, int height, int weight,
                   String fieldPosition2, int pace, int shoot, int dribbling) {

        super(name, phoneNumber, id, fieldPosition, height, weight, fieldPosition2);

        this.pacePoints = pace;
        this.shootPoints = shoot;
        this.dribblingPoints = dribbling;

    }

    @Override
    public String toString() {
        return super.toString() + "pace points: " + getPacePoints() + "\n" +
                "shoot points: " + getShootPoints() + "\n" +
                "dribbling points: " + getDribblingPoints() + "\n";
    }

    @Override
    String listen() {
        return "running for score a goal";
    }

    @Override
    String talk() {
        return "the striker is talking to his teammates";
    }

    public String hitTheBall() {
        return "the striker hits the ball";
    }


    @Override
    public void freeKick() {
        System.out.println("The team have a great oportunity to score with this specialist");
    }

    @Override
    public void shoot() {
        System.out.println("The defenders respect this striker when he take the shoot");
    }

    @Override
    public void headBall() {
        System.out.println("The striker hits the ball with his head");
    }

    public void setPacePoints(int pacePoints) {
        this.pacePoints = pacePoints;
    }

    public void setShootPoints(int shootPoints) {
        this.shootPoints = shootPoints;
    }

    public void setDribblingPoints(int dribblingPoints) {
        this.dribblingPoints = dribblingPoints;
    }

    public int getPacePoints() {
        return pacePoints;
    }

    public int getDribblingPoints() {
        return dribblingPoints;
    }

    public int getShootPoints() {
        return shootPoints;
    }
}
