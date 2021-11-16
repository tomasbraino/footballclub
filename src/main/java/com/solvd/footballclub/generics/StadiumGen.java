package com.solvd.footballclub.generics;

public class StadiumGen<Sector, Capacity, Rooms> {

    private Sector sec;
    private Capacity cap;
    private Rooms rooms;

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
