package com.solvd.footballclub.model;

public abstract class Player extends Person {

    private String fieldPosition;
    private int height;
    private int weight;
    private String fieldPosition2;

    //methods

    public Player(String name, int phoneNumber, int id, String fieldPosition, int height, int weight, String fieldPosition2) {
        super(name, phoneNumber, id);

        this.fieldPosition = fieldPosition;
        this.fieldPosition2 = fieldPosition2;
        this.height = height;
        this.weight = weight;
    }

    @Override
    String listen() {
        return "the player is lestening what his manager says";
    }

    @Override
    String talk() {
        return "the player is talking with his partner";
    }

    @Override
    public String toString() {
        return super.toString() + "Field position: " + getFieldPosition() + "\n" +
                "Field position 2: " + getFieldPosition2() + "\n" +
                "Height: " + getHeight() + "\n" +
                "weight: " + getWeight();
    }

    //getters & setters

    public String getFieldPosition() {
        return fieldPosition;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getFieldPosition2() {
        return fieldPosition2;
    }

    public void setFieldPosition(String fieldPosition) {
        this.fieldPosition = fieldPosition;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFieldPosition2(String fieldPosition2) {
        this.fieldPosition2 = fieldPosition2;
    }
}
