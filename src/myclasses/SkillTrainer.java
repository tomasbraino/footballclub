package myclasses;

public class SkillTrainer extends Person {

    private String specialist;
    private int yearExp;

    public SkillTrainer(String name, Integer phoneNumber, Integer id, String specialist, int yearExp) {
        super(name, phoneNumber, id);
        this.specialist = specialist;
        this.yearExp = yearExp;
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
