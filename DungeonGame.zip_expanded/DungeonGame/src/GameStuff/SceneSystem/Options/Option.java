package GameStuff.SceneSystem.Options;

import GameStuff.Game;

public abstract class Option {
    private String label; 

    public Option(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    } 

    public Game execute(Game game){
        // Código executado pela opção

        return game;
    }

}
