package GameStuff.SceneSystem.Options;

import GameStuff.Game;

public class Quit extends Option {
    public Quit() {
        super("Sair");
    }

    @Override
    public Game execute(Game game) {
        game.setRunning(false);
        return super.execute(game);
    }
}
