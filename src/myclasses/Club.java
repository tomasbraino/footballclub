package myclasses;

import java.util.Date;

public class Club {

    //atributes
    private String name;
    private String adress;
    private Integer age;
    private String actualDiv;

    //methods
    public Club(String name, String adress, Integer age, String actualDiv) {

        this.name = name;
        this.adress = adress;
        this.age = age;
        this.actualDiv = actualDiv;

        /*FirstTeam firstTeam = new FirstTeam(11, "team tactics", 80);
        Stadium stadium = new Stadium("Old trafford", 80000);
        TalentRecruiter talentRecruiter = new TalentRecruiter("England");*/
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
