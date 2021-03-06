
package com.solvd.footballclub.model;

import com.solvd.footballclub.interfaces.MidelFielderSkills;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Midfielder extends Player implements MidelFielderSkills {

    public static final Logger log = LogManager.getLogger(Player.class);
    private int pacePoints;
    private int longPassPoints;
    private int dribblingPoints;

    public Midfielder(String name, int phoneNumber, int id, String fieldPosition, int height, int weight, String fieldPosition2, int pacePoints, int longPassPoints, int dribblingPoints) {
        super(name, phoneNumber, id, fieldPosition, height, weight, fieldPosition2);
        this.pacePoints = pacePoints;
        this.longPassPoints = longPassPoints;
        this.dribblingPoints = dribblingPoints;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Midfielder that = (Midfielder) o;
        return pacePoints == that.pacePoints && longPassPoints == that.longPassPoints && dribblingPoints == that.dribblingPoints;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + pacePoints + longPassPoints + dribblingPoints;
    }


    @Override
    public void possessionPass() {
        log.info("the midelfielders are passing the ball with the possession tactic");
    }

    @Override
    public void longPass() {
        log.info("the midelfielders are passing the ball with the long technique");
    }

    @Override
    public void shortPass() {
        log.info("the midelfielders are passing with the short technique");
    }

    @Override
    public void defensivePosition() {
        log.info("the midelfielders are defensive mode");
    }

    public int getPacePoints() {
        return pacePoints;
    }

    public void setPacePoints(int pacePoints) {
        this.pacePoints = pacePoints;
    }

    public int getLongPassPoints() {
        return longPassPoints;
    }

    public void setLongPassPoints(int longPassPoints) {
        this.longPassPoints = longPassPoints;
    }

    public int getDribblingPoints() {
        return dribblingPoints;
    }

    public void setDribblingPoints(int dribblingPoints) {
        this.dribblingPoints = dribblingPoints;
    }
}

