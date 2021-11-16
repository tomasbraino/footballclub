package com.solvd.footballclub.places;

import com.solvd.footballclub.exceptions.FanMemership;
import com.solvd.footballclub.interfaces.StadiumIn;

import java.util.Scanner;

public class Stadium implements StadiumIn {

    private String name;
    private int capacity;

    //methods
    public Stadium(String name, Integer capacity) {
        this.name = name;
        this.capacity = capacity;
    }


    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public void alertSound() {
        System.out.println("Please evacuate the stadium");
    }

    @Override
    public void messageSound() {
        System.out.println("The striker score!!! ");
    }

    @Override
    public void controlFans() throws FanMemership {

        //FanMemership Exception uses
        Scanner scan = new Scanner(System.in);
        boolean status = scan.nextBoolean();

        if (status) {
            System.out.println("This fan can enter to the stadium");
        } else {
            throw new FanMemership("this fan can not enter to the stadium");
        }

    }

    @Override
    public void security() {
        System.out.println("Security on the pitch");
    }
}