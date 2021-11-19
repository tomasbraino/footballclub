package com.solvd.footballclub.model;

import com.solvd.footballclub.interfaces.Defense;

import java.util.Objects;

public class Defender extends Player implements Defense {

    private int defensePoints;
    private int tacklePoints;
    private int headHitPoints;

    public Defender(String name, int phoneNumber, int id, String fieldPosition, int height, int
            weight, String fieldPosition2, int defensePoints, int tacklePoints, int headHitPoints) {

        super(name, phoneNumber, id, fieldPosition, height, weight, fieldPosition2);
        this.defensePoints = defensePoints;
        this.tacklePoints = tacklePoints;
        this.headHitPoints = headHitPoints;
    }


    @Override
    public String toString() {
        return super.toString() + "Defense points: " + defensePoints +
                "tacklePoints=" + tacklePoints +
                "headHitPoints=" + headHitPoints;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + defensePoints + tacklePoints;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Defender) {

            Defender other = (Defender) obj;

            if (this.defensePoints == ((Defender) obj).defensePoints) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public void tackle() {
        System.out.println("the defender is tackling the striker");
    }

    @Override
    public void holdTheStriker() {
        System.out.println("the defender is holding the striker");
    }

    @Override
    public void tacticalDefense() {
        System.out.println("the defender has the tactical defense mode");
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    public int getTacklePoints() {
        return tacklePoints;
    }

    public void setTacklePoints(int tacklePoints) {
        this.tacklePoints = tacklePoints;
    }

    public int getHeadHitPoints() {
        return headHitPoints;
    }

    public void setHeadHitPoints(int headHitPoints) {
        this.headHitPoints = headHitPoints;
    }
}

