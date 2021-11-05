import myclasses.*;

public class Main {

    public static void main(String[] args) {

        Club localClub = new Club("Manchester Blue", "Manchester", 10, "Junior division", 20);
        Club visitorClub = new Club("manchester red","manchester", 11, "Junior division",3);

        //match day
        if(localClub.equals(visitorClub)){
            System.out.println("The match ended in a tie");
        }else{
            if(localClub.getPointsExp() > visitorClub.getPointsExp()){
                System.out.println(localClub.getName()+" wins!");
            }else{
                System.out.println(visitorClub.getName()+ "wins!");
            }
        }


        //Testing inheritance and polimorphism
       /* Person talentRec = new TalentRecruiter("Joe",33,312,"England");
        Person manager1 = new Manager("Antonio conte",123,44,10,"Defensive");
        Person fan1 = new Fans("george",55,661,4222,"northwest");
        Person skillTrainer1 = new SkillTrainer("John",145,1665,"goalkeeper trainer", 12);
        Person player1 = new Player("David",123,456,"Striker",186,90,"striker");

        System.out.println(player1.toString());
        System.out.println(manager1.toString());
        System.out.println(fan1.toString());
        System.out.println(skillTrainer1.toString());
        System.out.println(talentRec.toString());*/



    }
}
