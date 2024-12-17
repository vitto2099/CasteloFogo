package GameStuff.SceneSystem.Options;

import GameStuff.Game;
import GameStuff.SceneIds;

public class Credits extends Option{
    public Credits() {
        super("Creditos");
    }

    @Override
    public Game execute(Game game) {
        game.setCurrentSceneId(SceneIds.CREDITS.ordinal());
        return game;
    }
}
