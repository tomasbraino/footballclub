package com.solvd.footballclub.model;

public class StadiumGen<Sector, Capacity, Rooms> {

    Sector sec;
    Capacity cap;
    Rooms rooms;

    public StadiumGen(Sector sec, Capacity cap, Rooms rooms) {
        this.sec = sec;
        this.cap = cap;
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "StadiumGen " + "\n" +
                "sec: " + sec + "\n" +
                "cap: " + cap + "\n" +
                "rooms: " + rooms + "\n";
    }
}
