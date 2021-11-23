package com.solvd.footballclub.util;

import com.solvd.footballclub.employees.TalentRecruiter;
import com.solvd.footballclub.exceptions.PlayerAttendance;
import com.solvd.footballclub.generics.PlayerGen;
import com.solvd.footballclub.generics.SponsorGen;
import com.solvd.footballclub.model.*;
import com.solvd.footballclub.places.Finances;
import com.solvd.footballclub.generics.StadiumGen;
import com.solvd.footballclub.places.Sector;
import com.solvd.footballclub.places.Stadium;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


public class Main {

    //logger
    public static final Logger log = LogManager.getLogger(Main.class);


    public static void main(String[] args) {


        FirstTeam team1 = new FirstTeam(9, "defensive", 21);
        FirstTeam team2 = new FirstTeam(11, "ofensive", 20);
        FirstTeam team3 = new FirstTeam(10, "ofensive", 50);


        if (team1.equals(team2)) {
            log.info("The match ended in tie");
            log.info("hashcode 1: " + team1.hashCode() + "\n" + "hashcode 1: " + team2.hashCode());

        } else if (team1.getAvgPlayer() > team2.getAvgPlayer()) {

            log.info("team 1 won the game because their avgPlayer is: " + team1.getAvgPlayer());
        } else {
            log.info("team 2 won the game because their avgPlayer is: " + team2.getAvgPlayer());
        }


        Striker striker = new Striker("Cristiano", 122, 32, "Striker", 186, 234, "midelfielder", 88, 90, 88);
        Striker striker2 = new Striker("Leo Messi", 122, 32, "Striker", 186, 234, "midelfielder", 89, 95, 88);


        if (striker.equals(striker2)) {
            log.info("They are equals");
            log.info("hashcode striker1: " + striker.hashCode() + "\n" + "hashcode striker1: " + striker2.hashCode());

        } else {
            log.info("They are not equals");
            log.info("hashcode striker1: " + striker.hashCode() + "\n" + "hashcode striker1: " + striker2.hashCode());
        }


        //1st Exception needs to be sorrounded by try & catch block
        Finances.getPlayerData();

        //2nd Exception. FanMemership is RunTimeException type and no need to be sorrounded by try and catch block
        Stadium stad = new Stadium("old trafford", 80000);
        stad.controlFans();

        //3rd Exception
        Player.attendance();

        //4th exception. RunTimeException
        Sector sec = new Sector("aa-44", 1233, 2222);
        sec.sectorControl();

        //5th exception
        TalentRecruiter.talentTravel();


        //Generics
        PlayerGen<Player> striker1 = new PlayerGen<>();
        striker1.getPlayer(new Striker("Lukaku", 135, 64, "Striker", 190, 234, "Striker2", 90, 22, 33));

        PlayerGen<Player> goalkeeper = new PlayerGen<>();
        goalkeeper.getPlayer(new Goalkeeper("Donnarumma", 5452, 44, "goalkeeper", 199, 32, "goalkeeper"));

        StadiumGen<String, Integer, Integer> stadium = new StadiumGen<>("Sector A", 6000, 10);
        log.info(stadium.toString());

        SponsorGen<String, String, String> sponsor = new SponsorGen<>("Fly Emirates", "Dhl", "Team viewer");
        log.info(sponsor.toString());

        //2nd Collection.
        Set<Player> talent = new HashSet<Player>();

        //3rd collection. List of created players
        LinkedList<Player> player = new LinkedList<Player>();
        player.add(striker);
        player.add(striker2);

        for (Player play : player) {
            log.info(play.getName());
        }

        //4th collection hashSet
        Set<FirstTeam> teams = new HashSet<FirstTeam>();
        teams.add(team1);
        teams.add(team2);
        teams.add(team3);

        for (FirstTeam team : teams) {
            log.info(team.getTeamSheet());
        }

        //5th Collection.
        HashMap<String, Integer> playerIds = new HashMap<>();
        playerIds.put("Leo Messi", 10);
        playerIds.put("Cristiano", 7);
        playerIds.put("Ibrahimovic", 9);
        log.info(playerIds);


    }//main method
}//main class
