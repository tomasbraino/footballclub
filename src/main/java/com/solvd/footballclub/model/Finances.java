package com.solvd.footballclub.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finances {

    private Float budget;
    private int salaries;
    private int debts;

    //methods
    public Finances(Float budget, int salaries, int debts) {
        this.budget = budget;
        this.salaries = salaries;
        this.debts = debts;

    }

   public static void getPlayerData() throws InputMismatchException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Add a name for the new player: ");
        String namePlayer = scan.next();

        System.out.println("Add an age for the new player: ");
        int agePlayer = scan.nextInt();

        System.out.println("Add current salary of the new player: ");
        float salaryPlayer = scan.nextFloat();

        System.out.println("Name: " + namePlayer + "\n" + "Age: " + agePlayer + "\n" + "Salary: " + salaryPlayer);

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
