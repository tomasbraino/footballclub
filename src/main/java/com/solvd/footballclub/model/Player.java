package com.solvd.footballclub.model;

import com.solvd.footballclub.employees.TalentRecruiter;
import com.solvd.footballclub.exceptions.PlayerAttendance;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public abstract class Player extends Person {

    public static final Logger log = LogManager.getLogger(Player.class);

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

    public static void attendance() throws PlayerAttendance {
        int counter = 0;
        ArrayList<Boolean> attendance = new ArrayList<Boolean>();
        attendance.add(true);
        attendance.add(false);
        attendance.add(false);
        attendance.add(false);

        for (int i = 0; i < attendance.size(); i++) {

           log.info(attendance.get(i));
            if(attendance.get(i) == false){
                counter ++;
            }

        }
        if(counter >= 3){
            throw new PlayerAttendance("This player has too much faults");
        }else{
            log.info("no problem with this player, he is too professional");
        }

    }


    @Override
    public String listen() {
        return "listening to his teammate";
    }

    @Override
    public String talk() {
        return "talking to his teammate";
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
