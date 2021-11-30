package com.solvd.footballclub.places;

import com.solvd.footballclub.exceptions.FanMemership;
import com.solvd.footballclub.interfaces.StadiumIn;
import com.solvd.footballclub.model.Player;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Stadium implements StadiumIn {

    public static final Logger log = LogManager.getLogger(Stadium.class);

    private String name;
    private int capacity;

    //methods
    public Stadium(String name, Integer capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    //2nd enum
    enum Places{
        PITCH, GATE, BENCH, TUNNEL;
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
        log.info("Please evacuate the stadium");
    }

    @Override
    public void messageSound() {
        log.info("The striker score!!! ");
    }

    @Override
    public void controlFans() throws FanMemership {

        //FanMemership Exception uses
        Scanner scan = new Scanner(System.in);
        boolean status = scan.nextBoolean();

        if (status) {
            log.info("This fan can enter to the stadium");
        } else {
            throw new FanMemership("this fan can not enter to the stadium");
        }

    }

    @Override
    public void security() {
        log.info("Security on the pitch");
    }
}
