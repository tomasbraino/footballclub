package myclasses;

public class Manager extends Person {

    //atributes

    private Integer experience;
    private String footballTactic;

    //methods

    public Manager(String name, Integer phoneNumber, Integer id, Integer experience, String footballTactic) {
        super(name, phoneNumber, id);
        this.experience = experience;
        this.footballTactic = footballTactic;
    }

    @Override
    public String run() {
        return "Running and celebrate when their team scores";
    }

    @Override
    public String talk() {
        return "Explaining the strategy to their players";
    }

    public String trainPlayers() {
        return "Training his players";
    }

    @Override
    public String toString() {
        return "Name: " + "\n" + getName() + "\n" + "phone number: " + "\n" + getPhoneNumber() +
                "\n" + "id: " + getId() + "Expeience: " + getExperience() + "\n" +
                "tactic: " + getFootballTactic();
    }


    //getters & setters
    public Integer getExperience() {
        return experience;
    }

    public String getFootballTactic() {
        return footballTactic;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public void setFootballTactic(String footballTactic) {
        this.footballTactic = footballTactic;
    }
}//end class
