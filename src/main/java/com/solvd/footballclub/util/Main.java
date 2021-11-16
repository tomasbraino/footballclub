package com.solvd.footballclub.util;

import com.solvd.footballclub.exceptions.PlayerAttendance;
import com.solvd.footballclub.generics.PlayerGen;
import com.solvd.footballclub.generics.SponsorGen;
import com.solvd.footballclub.model.*;
import com.solvd.footballclub.places.Finances;
import com.solvd.footballclub.generics.StadiumGen;
import com.solvd.footballclub.places.Stadium;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {


       /* FirstTeam team1 = new FirstTeam(11, "defensive", 20);
        FirstTeam team2 = new FirstTeam(11, "defensive", 20);


        if (team1.equals(team2)) {
            System.out.println("The match ended in tie");//change system.out for logger
            System.out.println("hashcode 1: " + team1.hashCode() + "\n" + "hashcode 1: " + team2.hashCode()); //change system.out for logger

        } else if (team1.getAvgPlayer() > team2.getAvgPlayer()) {

            System.out.println("team 1 won the game because their avgPlayer is: " + team1.getAvgPlayer());//change system.out for logger
        } else {
            System.out.println("team 2 won the game because their avgPlayer is: " + team2.getAvgPlayer()); //change system.out for logger
        }


        Striker striker = new Striker("Cristiano", 122, 32, "Striker", 186, 234, "midelfielder", 88, 90, 88);
        Striker striker2 = new Striker("Leo Messi", 122, 32, "Striker", 186, 234, "midelfielder", 89, 95, 88);


        if (striker.equals(striker2)) {
            System.out.println("They are equals"); //change system.out for logger
            System.out.println("hashcode striker1: " + striker.hashCode() + "\n" + "hashcode striker1: " + striker2.hashCode());

        } else {
            System.out.println("They are not equals"); //change system.out for logger
            System.out.println("hashcode striker1: " + striker.hashCode() + "\n" + "hashcode striker1: " + striker2.hashCode());
        }


        try{ //1st Exception needs to be sorrounded by try & catch block
        Finances.getPlayerData();
        }catch(Exception e){
            e.printStackTrace();
        }
*/
        //2nd Exception. FanMemership is RunTimeException type and no need to be sorrounded by try and catch block
        Stadium stad = new Stadium("old trafford",80000);
        stad.controlFans();
/*
        //3rd Exception
        try {
            Player.attendance();
        } catch (PlayerAttendance e) {
            e.printStackTrace();
        }*/


        /*//Generics
        PlayerGen<Player> striker1 = new PlayerGen<>();
        striker1.getPlayer(new Striker("Lukaku",135,64,"Striker",190,234,"Striker2",90,22,33));

        PlayerGen<Player> goalkeeper = new PlayerGen<>();
        goalkeeper.getPlayer(new Goalkeeper("Donnarumma",5452,44,"goalkeeper",199,32,"goalkeeper"));

        StadiumGen<String, Integer, Integer> stadium = new StadiumGen<>("Sector A",6000,10);
        System.out.println(stadium.toString()); //change system.out for logger

        SponsorGen<String, String, String> sponsor = new SponsorGen<>("Fly Emirates","Dhl","Team viewer");
        System.out.println(sponsor.toString()); //change system.out for logger
*/

    }//main method
}//main class
