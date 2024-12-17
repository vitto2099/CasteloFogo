package GameStuff.SceneSystem.Scenes;

import GameStuff.SceneSystem.Options.Credits;
import GameStuff.SceneSystem.Options.Play;
import GameStuff.SceneSystem.Options.Quit;

public class Menu extends Scene{
    public Menu() {
        super("CASTELO DE FOGO \nBem-vindo ao Castelo de Fogo, um lugar onde coragem e astúcia são testadas a cada passo. \nVocê está pronto para enfrentar os segredos sombrios e perigos letais");
        options.add(new Quit());
        options.add(new Play());
        options.add(new Credits());
    }
}
