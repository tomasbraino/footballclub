package model;

public class Club {

    //atributes
    private String name;
    private String adress;
    private int age;
    private String actualDiv;
    private int pointsExp;

    //methods
    public Club(String name, String adress, int age, String actualDiv, int pointsExp) {

        this.name = name;
        this.adress = adress;
        this.age = age;
        this.actualDiv = actualDiv;
        this.pointsExp = pointsExp;

    }

    @Override
    public int hashCode() {
        return hashCode() + pointsExp;
    }

    @Override
    public boolean equals(Object obj) {

        // If the object is compared with itself then return true
        if (obj == this) {
            return true;
        }

        /* Check if obj is an instance of Club or not
          "null instanceof [type]" also returns false */
        if (!(obj instanceof Club)) {
            return false;
        }

        // typecast obj to Club so that we can compare data members
        Club club = (Club) obj;

        // Compare the data members and return accordingly
        return Double.compare(re, c.re) == 0
                && Double.compare(im, c.im) == 0;
    }


    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Adress: " + getAdress() +
                "\n" + "Age: " + getAge() + "\n" + "Actual div: " + getActualDiv() +
                "\n" + "Points in the tournament: " + getPointsExp();
    }

    //getters

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getAge() {
        return age;
    }

    public String getActualDiv() {
        return actualDiv;
    }

    public int getPointsExp() {
        return pointsExp;
    }

    public void setPointsExp(int pointsExp) {
        this.pointsExp = pointsExp;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setActualDiv(String actualDiv) {
        this.actualDiv = actualDiv;
    }
}
