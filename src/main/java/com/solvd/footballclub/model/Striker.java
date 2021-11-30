package com.solvd.footballclub.model;

import com.solvd.footballclub.interfaces.Attack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Striker extends Player implements Attack {

    public static final Logger log = LogManager.getLogger(Player.class);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Striker striker = (Striker) o;
        return pacePoints == striker.pacePoints && shootPoints == striker.shootPoints && dribblingPoints == striker.dribblingPoints;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + shootPoints + dribblingPoints;
    }

    @Override
    public String listen() {
        return "running for score a goal";
    }

    @Override
    public String talk() {
        return "the striker is talking to his teammates";
    }

    public String hitTheBall() {
        return "the striker hits the ball";
    }


    @Override
    public void freeKick() {
        log.info("The team have a great oportunity to score with this specialist");
    }

    @Override
    public void shoot() {
        log.info("The defenders respect this striker when he take the shoot");
    }

    @Override
    public void headBall() {
       log.info("The striker hits the ball with his head");
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
