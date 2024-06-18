package Section_18.randomChallenge;

public class MainGame {

    public static void main(String[] args) {

        var console = new GameConsole<>(new DiceGame("Dice Rolling Game"));
        console.playGame(console.addPlayer());

    }

}
