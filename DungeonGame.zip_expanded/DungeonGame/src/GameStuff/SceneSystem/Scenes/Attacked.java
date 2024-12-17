package GameStuff.SceneSystem.Scenes;

import GameStuff.SceneSystem.Options.Attack;
import GameStuff.SceneSystem.Options.GiveUp;

public class Attacked extends Scene{
    public Attacked() {
        super("");

        options.add(new GiveUp());
        options.add(new Attack());
    }
}
