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
