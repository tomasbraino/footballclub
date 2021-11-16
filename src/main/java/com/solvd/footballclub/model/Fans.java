package com.solvd.footballclub.model;

public class Fans extends Person {

    private int fanId;
    private String stadiumSector;

    //methods
    public Fans(String name, int phoneNumber, int id, int fanId, String stadiumSector) {
        super(name, phoneNumber, id);
        this.fanId = fanId;
        this.stadiumSector = stadiumSector;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "fan id: " + getFanId() + "\n" +
                "Stadium sector: " + getStadiumSector();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String listen() {
        return "listening the stadium voice";
    }

    @Override
    public String talk() {
        return "Fans talking with their pairs";
    }

    public String sing() {
        return "Singing famous song";
    }

    //getters and setters
    public Integer getFanId() {
        return fanId;
    }

    public void setFanId(int fanId) {
        this.fanId = fanId;
    }

    public String getStadiumSector() {
        return stadiumSector;
    }

    public void setStadiumSector(String stadiumSector) {
        this.stadiumSector = stadiumSector;
    }



}
