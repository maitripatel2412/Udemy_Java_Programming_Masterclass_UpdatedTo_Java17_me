package Section_16.gameConsole.game;

public record Shooter(String name) implements Player {

    boolean findPrize(){
        System.out.println("prize found, score should be adjusted. ");
        return false;
    }

    boolean useWeapon(String weapon){
        System.out.println("you shot your " + weapon);
        return false;
    }



}
