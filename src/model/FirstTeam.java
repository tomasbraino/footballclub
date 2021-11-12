package model;

import java.util.Objects;

public class FirstTeam {
    private int numPlayer;
    private String teamSheet;
    private int avgPlayer;

    public FirstTeam(int numPlayer, String teamSheet, int avgPlayer) {
        this.numPlayer = numPlayer;
        this.teamSheet = teamSheet;
        this.avgPlayer = avgPlayer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FirstTeam firstTeam = (FirstTeam) o;
        return avgPlayer == firstTeam.avgPlayer;
    }

    @Override
    public int hashCode() {
        return hashCode() + avgPlayer;
    }

    public int getNumPlayer() {
        return numPlayer;
    }

    public void setNumPlayer(int numPlayer) {
        this.numPlayer = numPlayer;
    }

    public String getTeamSheet() {
        return teamSheet;
    }

    public void setTeamSheet(String teamSheet) {
        this.teamSheet = teamSheet;
    }

    public int getAvgPlayer() {
        return avgPlayer;
    }

    public void setAvgPlayer(int avgPlayer) {
        this.avgPlayer = avgPlayer;
    }

    public String defense() {
        return "The team is defending";
    }

    public String attack() {
        return "The team is attacking";
    }

}
