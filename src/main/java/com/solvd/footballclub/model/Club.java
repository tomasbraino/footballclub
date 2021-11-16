package com.solvd.footballclub.model;

import java.util.Objects;

public class Club {

    //atributes
    private String name;
    private String adress;
    private int age;
    private String actualDiv;
    private int pointsExp;

    //methods
    public Club(String name, String adress, int age, String actualDiv, int pointsExp) {

        this.name = name;
        this.adress = adress;
        this.age = age;
        this.actualDiv = actualDiv;
        this.pointsExp = pointsExp;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Club) {
            Club other = (Club) obj;
            if (this.pointsExp == ((Club) obj).pointsExp) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean equalsDivision(Object obj) {
        if (obj instanceof Club) {
            Club other = (Club) obj;
            if (this.actualDiv == ((Club) obj).actualDiv) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }



    @Override
    public int hashCode() {
        return Objects.hash(actualDiv, pointsExp);
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Adress: " + getAdress() +
                "\n" + "Age: " + getAge() + "\n" + "Actual div: " + getActualDiv() +
                "\n" + "Points in the tournament: " + getPointsExp();
    }

    //getters

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getAge() {
        return age;
    }

    public String getActualDiv() {
        return actualDiv;
    }

    public int getPointsExp() {
        return pointsExp;
    }

    public void setPointsExp(int pointsExp) {
        this.pointsExp = pointsExp;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setActualDiv(String actualDiv) {
        this.actualDiv = actualDiv;
    }
}
