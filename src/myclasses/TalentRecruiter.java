package myclasses;

public class TalentRecruiter extends Person {

    private String countryResearch;

    public TalentRecruiter(String name, Integer phoneNumber, Integer id, String countryResearch) {
        super(name, phoneNumber, id);
        this.countryResearch = countryResearch;
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
    public String run() {
        return "running";
    }

    @Override
    public String talk() {
        return "Talking about young talents with the CEO of the club";
    }

    @Override
    public String toString() {
        return "Name: " + "\n" + getName() + "\n" + "phone number: " + "\n" + getPhoneNumber() +
                "\n" + "id: " + getId() + "\n" + "country assignment: " + getCountryResearch();
    }

    public String getCountryResearch() {
        return countryResearch;
    }

    public void setCountryResearch(String countryResearch) {
        this.countryResearch = countryResearch;
    }
}
