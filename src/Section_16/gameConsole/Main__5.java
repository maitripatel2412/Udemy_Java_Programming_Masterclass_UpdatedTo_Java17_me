package Section_16.gameConsole;

import Section_16.gameConsole.game.GameConsole;
import Section_16.gameConsole.game.ShooterGame;

public class Main__5 {

    public static void main(String[] args) {

        var console = new GameConsole<>(new ShooterGame("the shootout game"));

        int playerIndex = console.addPlayer();
        console.playGame(playerIndex);

    }

}
