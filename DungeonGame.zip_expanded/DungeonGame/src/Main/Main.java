package Main;

import java.util.Scanner;
import GameStuff.Game;
import GameStuff.SceneSystem.SceneManager;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Classe com as informações do jogo
        Game game = new Game();
        // Gerenciador de cenas
        SceneManager sm = new SceneManager(game);

        // Loop principal
        while(game.isRunning()){
            sm.getCurrentScene().show();
            int choice = sc.nextInt();
            if(choice >= 0 && choice < sm.getCurrentScene().getOptions().size()){
                game = sm.executetOption(choice);
            }
        }
        sc.close();
    }
}