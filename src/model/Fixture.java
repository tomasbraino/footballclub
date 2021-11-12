package model;

import java.util.Date;

public class Fixture {
    private Date matchDay;
    private String nameReferee;
    private String nameOtherTeam;

    //methods
    public Fixture(Date matchDay, String nameReferee, String nameOtherTeam) {
        this.matchDay = matchDay;
        this.nameReferee = nameReferee;
        this.nameOtherTeam = nameOtherTeam;
    }

    public Date getMatchDay() {
        return matchDay;
    }

    public void setMatchDay(Date matchDay) {
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
