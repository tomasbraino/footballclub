package com.solvd.footballclub.places;

public class ClothesRoom {

    private String name;
    private int amountLocker;

    //methods
    public ClothesRoom() {

    }

    //1st enum
    enum Lockers{
        LOCKER1, LOCKER2, LOCKER3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountLocker() {
        return amountLocker;
    }

    public void setAmountLocker(int amountLocker) {
        this.amountLocker = amountLocker;
    }
}
