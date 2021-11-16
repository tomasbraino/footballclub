package com.solvd.footballclub.model;

import java.util.Objects;

public class Manager extends Person {

    //atributes

    private int experience;
    private String footballTactic;

    //methods

    public Manager(String name, int phoneNumber, int id, int experience, String footballTactic) {
        super(name, phoneNumber, id);
        this.experience = experience;
        this.footballTactic = footballTactic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return experience == manager.experience;
    }

    @Override
    public int hashCode() {
        return hashCode() + experience;
    }

    @Override
    public String listen() {
        return "The manager is listening to the press conference";
    }

    @Override
    public String talk() {
        return "Explaining the strategy to their players";
    }

    public String trainPlayers() {
        return "General training for his players";
    }

    @Override
    public String toString() {
        return super.toString() + "Experience: " + getExperience() + "\n" +
                "tactic: " + getFootballTactic();
    }


    //getters & setters
    public int getExperience() {
        return experience;
    }

    public String getFootballTactic() {
        return footballTactic;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setFootballTactic(String footballTactic) {
        this.footballTactic = footballTactic;
    }
}//end class
