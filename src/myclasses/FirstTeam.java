package myclasses;

public class FirstTeam {
    private Integer numPlayer;
    private String teamSheet;
    private Integer avgPlayer;

    public FirstTeam(Integer numPlayer, String teamSheet, Integer avgPlayer) {
        this.numPlayer = numPlayer;
        this.teamSheet = teamSheet;
        this.avgPlayer = avgPlayer;
    }

    public Integer getNumPlayer() {
        return numPlayer;
    }

    public void setNumPlayer(Integer numPlayer) {
        this.numPlayer = numPlayer;
    }

    public String getTeamSheet() {
        return teamSheet;
    }

    public void setTeamSheet(String teamSheet) {
        this.teamSheet = teamSheet;
    }

    public Integer getAvgPlayer() {
        return avgPlayer;
    }

    public void setAvgPlayer(Integer avgPlayer) {
        this.avgPlayer = avgPlayer;
    }

    public String defense() {
        return "The team is defending";
    }

    public String attack() {
        return "The team is attacking";
    }

}
