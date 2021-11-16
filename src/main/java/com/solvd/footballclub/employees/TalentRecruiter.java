package com.solvd.footballclub.employees;

import com.solvd.footballclub.exceptions.PlayerTransfer;
import com.solvd.footballclub.model.Person;

import java.util.Objects;

public class TalentRecruiter extends Person {

    private String countryResearch;

    public TalentRecruiter(String name, int phoneNumber, int id, String countryResearch) {
        super(name, phoneNumber, id);
        this.countryResearch = countryResearch;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(countryResearch);
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

    public static void talentTravel()throws PlayerTransfer{

    }


}
