package GameStuff.SceneSystem.Options;

import GameStuff.Game;
import GameStuff.SceneIds;

public class ToMenu extends Option{
    public ToMenu() {
        super("Voltar para o menu");
    }

    @Override
    public Game execute(Game game) {
        game.setCurrentSceneId(SceneIds.MENU.ordinal());
        return game;
    }
}
