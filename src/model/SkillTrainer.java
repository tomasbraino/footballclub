package model;

public class SkillTrainer extends Person implements Training {

    private String specialist;
    private int yearExp;

    public SkillTrainer(String name, int phoneNumber, int id, String specialist, int yearExp) {
        super(name, phoneNumber, id);
        this.specialist = specialist;
        this.yearExp = yearExp;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Specialist on: " + getSpecialist() + "\n" +
                "years of experience: " + getYearExp();
    }

    @Override
    public String listen() {
        return "running with the team";
    }

    @Override
    public String talk() {
        return "talk about goalkeeper routine";
    }

    @Override
    public void physicalSession() {
        System.out.println("Today we must to run and go to the gym");
    }

    @Override
    public void basicSkills() {
        System.out.println("Today's practice it's about basic skills");
    }

    @Override
    public void miniMatch() {
        System.out.println("We are gonna play a mini match with the 2nd team");
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public int getYearExp() {
        return yearExp;
    }

    public void setYearExp(int yearExp) {
        this.yearExp = yearExp;
    }
}
