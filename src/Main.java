import model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FirstTeam team1 = new FirstTeam(11,"defensive",20);
        FirstTeam team2 = new FirstTeam(11,"defensive",21);

        //team compare before the match

        try {
            if (team1.equals(team2)) {
                System.out.println("Teams are equals");
            }else if(team1.getAvgPlayer() > team2.getAvgPlayer() ){

                System.out.println("team 1 won the game");
            }else{
                System.out.println("team 2 won the game");
            }

        }catch (Exception e){
            System.out.println("somenthing wrong happend");
        }

        System.out.println("Let's compare some players...");
        Striker striker = new Striker("Cristiano",122,32,"Striker",186,234, "midelfielder",88,90,80);
        Striker striker2 = new Striker("Leo Messi",122,32,"Striker",170,234, "midelfielder",89,95,88);

        Defender defender = new Defender("Cuti Romero",122,32,"Central back",186,234, "midelfielder",89,95,88);

        Midfielder midfielder1 = new Midfielder("De bruyne",122,32,"Central back",170,234, "midelfielder",89,95,88);
        Goalkeeper goalkeeper = new Goalkeeper("Peter Schmeigel",1234,22,"goalkeeper",190,234,"goalkeeper");

        //player compare

        try{
            if(striker.equals(striker2)){
                System.out.println("They are equals");
            }else{
                System.out.println("They are not equals");
            }

            //if(striker.getShootPoints())

        }catch(Exception e){
            System.out.println("you can't compare those type of players");
        }


    }
}
