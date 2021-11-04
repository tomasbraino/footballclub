package myclasses;


public abstract class Person {
    //atributes
    private String name;
    private Integer phoneNumber;
    private Integer id;

    //methods

    public Person(String name, Integer phoneNumber, Integer id) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String run() {

        return "I'm running";
    }

    public String talk() {

        return "I'm talking with someone";
    }

    @Override
    public String toString() {
        return "Name: " + "\n" + getName() + "\n" + "phone number: " + "\n" + getPhoneNumber() +
                "\n" + "id: " + getId();
    }


}
