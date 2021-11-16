package com.solvd.footballclub.model;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class Fixture {
    private int matchDay;
    private String nameReferee;
    private String nameOtherTeam;
    private Image image;

    //methods
    public Fixture(int matchDay, String nameReferee, String nameOtherTeam) {
        this.matchDay = matchDay;
        this.nameReferee = nameReferee;
        this.nameOtherTeam = nameOtherTeam;
    }

    public static void getImage() {
        //1st exception handle with images
        try {
            Image image = ImageIO.read(new File("src/main/resources/fixture.jpg"));
            System.out.println(image.getGraphics());
        } catch (IOException e) {
            System.out.println("Image lost. There is no image in your folder");
            e.printStackTrace();
        }

    }


    public int getMatchDay() {
        return matchDay;
    }

    public void setMatchDay(int matchDay) {
        this.matchDay = matchDay;
    }

    public String getNameReferee() {
        return nameReferee;
    }

    public void setNameReferee(String nameReferee) {
        this.nameReferee = nameReferee;
    }

    public String getNameOtherTeam() {
        return nameOtherTeam;
    }

    public void setNameOtherTeam(String nameOtherTeam) {
        this.nameOtherTeam = nameOtherTeam;
    }
}
