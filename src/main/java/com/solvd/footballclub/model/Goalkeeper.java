
package com.solvd.footballclub.model;

import com.solvd.footballclub.interfaces.GoalkeeperI;

import java.util.Objects;

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
    public String listen() {
        return "the goalkeeper runs to catch the ball";
    }

    @Override
    public String talk() {
        return "the goalkeeper is talking to his defenders";
    }

    @Override
    public String toString() {
        return super.toString() + "jump points: " + getJumpPoints() + "\n" +
                "positioning points: " + getPositioning() + "\n" +
                "footwork points: " + getFootworkPoints() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goalkeeper that = (Goalkeeper) o;
        return positioning == that.positioning && footworkPoints == that.footworkPoints;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + positioning + footworkPoints;
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

