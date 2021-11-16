package com.solvd.footballclub.interfaces;

import com.solvd.footballclub.exceptions.FanMemership;

public interface StadiumIn {
    abstract void alertSound();
    abstract void messageSound();
    abstract void controlFans() throws FanMemership;
    abstract void security();

}
