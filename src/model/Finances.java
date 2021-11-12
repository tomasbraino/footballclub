package model;

public class Finances {

    private Float budget;
    private int salaries;
    private int debts;

    //methods
    public Finances() {

    }

    public Float getBudget() {
        return budget;
    }

    public void setBudget(Float budget) {
        this.budget = budget;
    }

    public int getSalaries() {
        return salaries;
    }

    public void setSalaries(int salaries) {
        this.salaries = salaries;
    }

    public int getDebts() {
        return debts;
    }

    public void setDebts(int debts) {
        this.debts = debts;
    }

    public int paySalaries() {
        return salaries;
    }

    public String transfers() {
        return "The club buy a new player";
    }

}
