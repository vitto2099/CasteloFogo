package GameStuff.SceneSystem.Scenes;

import GameStuff.SceneSystem.Options.Option;

import java.util.ArrayList;

public abstract class Scene {
    private String description;
    protected ArrayList<Option> options;

    public Scene(String description) {
        this.description = description;
        this.options = new ArrayList<>();
    }

    public ArrayList<Option> getOptions() {
        return options;
    }

    // Desenha toda a estrutura da cena pra dar menos trabalho
    public void show(){
        System.out.println(description + "\n");
        if(!options.isEmpty()){
            for(int i = 1; i<options.size(); i++){
                System.out.println("{ " + i + " } " + options.get(i).getLabel());
            }
            System.out.println("{ 0 } " + options.getFirst().getLabel());
        }
        System.out.print(">> ");
    }
}
