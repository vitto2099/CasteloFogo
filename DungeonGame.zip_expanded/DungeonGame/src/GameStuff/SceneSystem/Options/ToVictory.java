package GameStuff.SceneSystem.Options;

import GameStuff.Game;
import GameStuff.SceneIds;

public class ToVictory extends Option{
    public ToVictory() {
        super("Vitória!");
    }

    @Override
    public Game execute(Game game) {
        game.setCurrentSceneId(SceneIds.VICTORY.ordinal());
        return game;
    }
}
