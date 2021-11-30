package com.solvd.footballclub.places;

import com.solvd.footballclub.exceptions.StadiumTicketsControl;
import com.solvd.footballclub.model.Fans;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sector {

    public static final Logger log = LogManager.getLogger(Sector.class);

    private String name;
    private int id;
    private int amountPlaces;

    public Sector(String name, Integer id, Integer amountPlaces) {
        this.name = name;
        this.id = id;
        this.amountPlaces = amountPlaces;

    }

    Fans fan = new Fans("Tom", 453344, 23, 445, "aa-22");

    //4th exception
    public void sectorControl() throws StadiumTicketsControl {

        int id = fan.getFanId();
        String sector = fan.getStadiumSector();

        if (id != 0 || sector == null) {
            log.info("this fan is checked and can enter to the stadium sector");
        } else {
            throw new StadiumTicketsControl("Error, fan unknown");
        }

    }

    //3rd enum
    enum Sectors{
        SECTOR1, SECTOR2, SECTOR3;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
