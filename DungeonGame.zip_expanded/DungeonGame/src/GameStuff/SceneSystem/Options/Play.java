package GameStuff.SceneSystem.Options;

import GameStuff.Game;
import GameStuff.SceneIds;

public class Play extends Option{
    public Play() {
        super("Jogar");
    }

    @Override
    public Game execute(Game game) {
        game.setCurrentSceneId(SceneIds.FIRSTDOOR.ordinal());
        return game;
    }
}
