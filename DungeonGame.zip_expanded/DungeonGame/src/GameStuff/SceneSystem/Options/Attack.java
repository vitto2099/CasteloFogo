package GameStuff.SceneSystem.Options;

import java.util.Random;

import GameStuff.Game;
import GameStuff.SceneIds;

public class Attack extends Option {
    public Attack(){
        super("Atacar");
    }

    @Override
    public Game execute(Game game) {
        if(game.getCurrentEnemy().getHealth() - game.getPlayerInfo().getDamage() > 0){
            String[] texts = {"O ser odioso vem em sua direção pronto para desmembra-lo, porem, voce é mais rapido,\nsua espada desce como uma guilhotina e corta a asa direita do dragao.",
            "Voce corre em direção a fera e golpeia o peito do dragao, sua espada nao falha,\ne corta profundamente a carne!!! Um rugido extridente ecoa pelo salao, \nlogo em seguida a luz do fogo brilha na boca do dragao. Uma bola de fogo vem em sua direção!!!",
            "A cauda impacta o chão com uma força colossal, quebrando as pedras e espalhando\nfaíscas flamejantes por toda a sala dourada.\nAproveitando o momento de vulnerabilidade do dragão, você avança sem hesitação.\nSua arma brilha enquanto encontra um ponto frágil sob as escamas do dragão. O golpe é certeiro, e a criatura solta um rugido ensurdecedor de dor,\nchamas escapando de sua garganta. O dano causado é devastador contra essa força titânica",
            "O dragão vermelho, uma fera colossal de escamas rubras brilhantes como brasas vivas,\ngira furiosamente seu corpo. Sua cauda imensa, reluzindo como lava em movimento, se lança em um arco devastador em sua direção,\ncortando o ar com um som estridente. Você sente o calor intenso emanando da criatura enquanto o golpe passa perto, mas com agilidade,\nvocê salta para o lado, escapando por um triz."};

            Random rand = new Random();

            game.getCurrentEnemy().setHealth(game.getCurrentEnemy().getHealth() - game.getPlayerInfo().getDamage());
            System.out.print(texts[rand.nextInt(texts.length)]);
            game.setCurrentSceneId(SceneIds.ATTACKED.ordinal());
        }else{
            game.setCurrentEnemy(null);
            game.setCurrentSceneId(SceneIds.DRAGONDEFEAT.ordinal());
        }

        return game;
    }
}
