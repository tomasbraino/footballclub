package myclasses;

import java.util.Date;

public class Club {

    //atributes
    private String name;
    private String adress;
    private Integer age;
    private String actualDiv;
    private int pointsExp;

    //methods
    public Club(String name, String adress, Integer age, String actualDiv, int pointsExp) {

        this.name = name;
        this.adress = adress;
        this.age = age;
        this.actualDiv = actualDiv;
        this.pointsExp = pointsExp;

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Club) {
            Club club = (Club) obj;

            if (this.pointsExp == club.pointsExp) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return super.toString();
    }

    //getters

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public Integer getAge() {
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

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setActualDiv(String actualDiv) {
        this.actualDiv = actualDiv;
    }
}
