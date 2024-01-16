package Section_16.gameConsole.game;

import java.util.LinkedHashMap;
import java.util.Map;

public class ShooterGame extends Game<Shooter>{

    public ShooterGame(String gameName) {
        super(gameName);
    }

    @Override
    public Shooter createNewPlayer(String name) {
        return new Shooter(name);
    }

    @Override
    public Map<Character, GameAction> getGameActions(int playerIndex) {

        var map = new LinkedHashMap<>(Map.of(
                'F', new GameAction('F', " find prize", this::findPrize),
                'S', new GameAction('S', "use your gun", this::useWeapon)
        ));
        map.putAll(getStandardAction());
        return map;
    }

    public boolean findPrize(int playerIndex){
        return getPlayer(playerIndex).findPrize();
    }

    public boolean useWeapon(int playerIndex){
        return getPlayer(playerIndex).useWeapon("pistol");
    }
}
