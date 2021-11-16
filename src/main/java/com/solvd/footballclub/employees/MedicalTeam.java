package com.solvd.footballclub.employees;

public class MedicalTeam {

    private String teamMember;
    private String specialist;

    public MedicalTeam(String teamMember, String specialist) {
        this.teamMember = teamMember;
        this.specialist = specialist;
    }

    public String getTeamMember() {
        return teamMember;
    }

    public void setTeamMember(String teamMember) {
        this.teamMember = teamMember;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
}
