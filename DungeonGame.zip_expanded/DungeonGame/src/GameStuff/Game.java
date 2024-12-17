package GameStuff;

import GameStuff.Mobs.Mob;

public class Game {
    private boolean running;
    private int currentSceneId;
    private Player player;
    private Mob currentEnemy;

    public Game() {
        this.running = true;
        this.currentSceneId = SceneIds.MENU.ordinal();
        this.player = new Player();
    }

    // Métodos running
    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    // Métodos currentSceneId
    public int getCurrentSceneId() {
        return currentSceneId;
    }

    public void setCurrentSceneId(int currentSceneId) {
        this.currentSceneId = currentSceneId;
    }

    // Métodos player
    public Player getPlayerInfo() {
        return player;
    }

    public Mob getCurrentEnemy(){
        return currentEnemy;
    }

    public void setCurrentEnemy(Mob enemy){
        this.currentEnemy = enemy;
    }

}
