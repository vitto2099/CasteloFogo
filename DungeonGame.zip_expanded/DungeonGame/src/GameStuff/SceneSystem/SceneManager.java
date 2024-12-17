package GameStuff.SceneSystem;

import java.util.HashMap;
import java.util.Map;
import GameStuff.Game;
import GameStuff.SceneSystem.Scenes.*;
import GameStuff.SceneIds;

public class SceneManager {
    private Map<Integer, Scene> scenes;
    private Game game;

    public SceneManager(Game game) {
        this.game = game;
        this.scenes = new HashMap<Integer, Scene>();

        // Adicionar as cenas aqui
        // Ex: scenes.put(0, new ExampleScene());
        scenes.put(SceneIds.GAMEOVER.ordinal(), new GameOver());
        scenes.put(SceneIds.MENU.ordinal(), new Menu());
        scenes.put(SceneIds.CREDITS.ordinal(), new CreditScreen());
        scenes.put(SceneIds.FIRSTDOOR.ordinal(), new FirstDoor());
        scenes.put(SceneIds.BATTLE.ordinal(), new Battle());
        scenes.put(SceneIds.ATTACKED.ordinal(), new Attacked());
        scenes.put(SceneIds.DRAGONDEFEAT.ordinal(), new DragonDefeat());
        scenes.put(SceneIds.VICTORY.ordinal(), new Victory());
    }

    public Scene getCurrentScene() {
        return scenes.get(game.getCurrentSceneId());
    }

    public Game executetOption(int optionId) {
        return scenes.get(game.getCurrentSceneId()).getOptions().get(optionId).execute(game);
    }
}
