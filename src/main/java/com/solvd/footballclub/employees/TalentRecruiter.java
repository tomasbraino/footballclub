package com.solvd.footballclub.employees;

import com.solvd.footballclub.exceptions.PlayerTransfer;
import com.solvd.footballclub.model.Person;
import com.solvd.footballclub.util.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class TalentRecruiter extends Person {

    public static final Logger log = LogManager.getLogger(TalentRecruiter.class);

    private String countryResearch;

    public TalentRecruiter(String name, int phoneNumber, int id, String countryResearch) {
        super(name, phoneNumber, id);
        this.countryResearch = countryResearch;
    }

    @Override
    public int hashCode() {
        return countryResearch.hashCode();
    }//Correct my hashCode() needs to be custom

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String listen() {
        return "listening to the requirements of the manager";
    }

    @Override
    public String talk() {
        return "Talking about young talents with the CEO of the club";
    }

    @Override
    public String toString() {
        return super.toString() + "country assignment: " + getCountryResearch();
    }

    public String getCountryResearch() {
        return countryResearch;
    }

    public void setCountryResearch(String countryResearch) {
        this.countryResearch = countryResearch;
    }

    //5th exception
    public static void talentTravel()throws PlayerTransfer{

        TalentRecruiter rec = new TalentRecruiter("joe",21333,222,"england");

        String country = rec.getCountryResearch();

        if (country != "england"){
            throw new PlayerTransfer("You are on the wrong place");
        }else{
            log.info("keep on the bussiness right there");
        }

    }


}
