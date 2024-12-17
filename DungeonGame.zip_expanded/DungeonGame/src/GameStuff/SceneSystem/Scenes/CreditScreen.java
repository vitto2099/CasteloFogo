package GameStuff.SceneSystem.Scenes;

import GameStuff.SceneSystem.Options.ToMenu;

public class CreditScreen extends Scene{
    public CreditScreen() {
        super("Criado por: \n\nJoão Daniel Machado Weng, \nLeonidas Dias de Souza, \nVinicius Moreira, \nVitor Kunicki \n\nTurma de Engenharia de Software 2° Fase.");
        options.add(new ToMenu());
    }
}
