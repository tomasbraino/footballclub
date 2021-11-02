package myclasses;

public class Finances {

    private Float budget;
    private Integer salaries;
    private Integer debts;

    //methods
    public Finances() {

    }

    public Float getBudget() {
        return budget;
    }

    public void setBudget(Float budget) {
        this.budget = budget;
    }

    public Integer getSalaries() {
        return salaries;
    }

    public void setSalaries(Integer salaries) {
        this.salaries = salaries;
    }

    public Integer getDebts() {
        return debts;
    }

    public void setDebts(Integer debts) {
        this.debts = debts;
    }

    public Integer paySalaries() {
        return salaries;
    }

    public String transfers() {
        return "The club buy a new player";
    }

}
