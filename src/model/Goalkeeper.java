
package model;

public class Goalkeeper extends Player implements GoalkeeperI {
    private int jumpPoints;
    private int positioning;
    private int footworkPoints;

    public Goalkeeper(String name, int phoneNumber, int id, String fieldPosition, int height, int weight,
                      String fieldPosition2) {

        super(name, phoneNumber, id, fieldPosition, height, weight, fieldPosition2);
        this.jumpPoints = jumpPoints;
        this.footworkPoints = footworkPoints;
        this.positioning = positioning;
    }

    @Override
    String listen() {
        return "the goalkeeper runs to catch the ball";
    }

    @Override
    String talk() {
        return "the goalkeeper is talking to his defenders";
    }

    @Override
    public String toString() {
        return super.toString() + "jump points: " + getJumpPoints() + "\n" +
                "positioning points: " + getPositioning() + "\n" +
                "footwork points: " + getFootworkPoints() + "\n";
    }

    @Override
    public void stretchSaving() {

    }

    @Override
    public void positioning() {

    }

    @Override
    public void handleTheBall() {

    }

    public int getJumpPoints() {
        return jumpPoints;
    }

    public void setJumpPoints(int jumpPoints) {
        this.jumpPoints = jumpPoints;
    }

    public int getPositioning() {
        return positioning;
    }

    public void setPositioning(int positioning) {
        this.positioning = positioning;
    }

    public int getFootworkPoints() {
        return footworkPoints;
    }

    public void setFootworkPoints(int footworkPoints) {
        this.footworkPoints = footworkPoints;
    }
}

