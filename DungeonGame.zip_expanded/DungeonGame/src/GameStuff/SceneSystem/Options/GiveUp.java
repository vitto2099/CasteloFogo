package GameStuff.SceneSystem.Options;

import GameStuff.Game;
import GameStuff.SceneIds;

public class GiveUp extends Option {
    public GiveUp() {
        super("Desistir");
    }

    @Override
    public Game execute(Game game) {
        game.setCurrentSceneId(SceneIds.GAMEOVER.ordinal());
        return game;
    }
}
