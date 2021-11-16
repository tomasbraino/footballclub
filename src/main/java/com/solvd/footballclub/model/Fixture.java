package com.solvd.footballclub.model;

import java.awt.*;


public class Fixture {
    private int matchDay;
    private String nameReferee;
    private String nameOtherTeam;
    private Image image;

    //methods
    public Fixture(int matchDay, String nameReferee, String nameOtherTeam) {
        this.matchDay = matchDay;
        this.nameReferee = nameReferee;
        this.nameOtherTeam = nameOtherTeam;
    }


    public int getMatchDay() {
        return matchDay;
    }

    public void setMatchDay(int matchDay) {
        this.matchDay = matchDay;
    }

    public String getNameReferee() {
        return nameReferee;
    }

    public void setNameReferee(String nameReferee) {
        this.nameReferee = nameReferee;
    }

    public String getNameOtherTeam() {
        return nameOtherTeam;
    }

    public void setNameOtherTeam(String nameOtherTeam) {
        this.nameOtherTeam = nameOtherTeam;
    }
}
