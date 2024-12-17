package GameStuff.SceneSystem.Options;

import GameStuff.Game;
import GameStuff.Mobs.Dragon;
import GameStuff.SceneIds;

public class FightDragon extends Option{
    public FightDragon() {
        super("Lutar contra o Dragão");
    }

    @Override
    public Game execute(Game game) {
        game.setCurrentEnemy(new Dragon());
        game.setCurrentSceneId(SceneIds.BATTLE.ordinal());
        return game;
    }
}
