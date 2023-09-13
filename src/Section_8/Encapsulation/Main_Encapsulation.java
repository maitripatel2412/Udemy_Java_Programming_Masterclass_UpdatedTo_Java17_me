package Section_8.Encapsulation;

public class Main_Encapsulation {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "maitri";
//        player.health = 20 ;
//        player.weapon = "badminton";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("remaining health = "+player.healthRemaining());
//
//        player.loseHealth(11);
//        System.out.println("remaining health = "+player.healthRemaining());

        EnhancedPlayer maitri = new EnhancedPlayer("maitri" );
        System.out.println("initial health is "+maitri.healthRemaining());


    }
}
