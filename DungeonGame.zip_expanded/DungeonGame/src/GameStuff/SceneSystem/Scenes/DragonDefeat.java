package GameStuff.SceneSystem.Scenes;

import GameStuff.SceneSystem.Options.ToVictory;

public class DragonDefeat extends Scene{
    public DragonDefeat() {
        super("ensanguentado pela batalha com seu ultimo suspiro voce crava a espada na cabeça do dragão,\n" +
                "o grande corpo do ser maligno desaba ao chao e o barulho do impacto faz o salao inteiro tremer.\n" +
                "Nada pode parar o seu incrivel poder, ou sera que nao?");
        options.add(new ToVictory());
    }
}
