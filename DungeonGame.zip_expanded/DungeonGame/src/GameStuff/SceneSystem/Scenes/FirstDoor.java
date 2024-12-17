package GameStuff.SceneSystem.Scenes;

import GameStuff.SceneSystem.Options.FightDragon;
import GameStuff.SceneSystem.Options.GiveUp;

public class FirstDoor extends Scene{
    public FirstDoor() {
        super("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡄⠀⠀⠀⠀⠰⠿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣶⡀⠈⡇⠀⠀⠀⡄⣴⣶⣶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡞⠛⠷⢸⡇⣦⣦⡖⡏⠈⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⢸⣷⣿⣿⣧⡇⠠⣿⡇⣰⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠁⢻⣼⣿⡿⣻⢿⣇⣴⣿⡇⡟⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⠀⢸⢻⣿⡇⡏⢸⣿⢹⣿⣟⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢼⠀⢸⠿⣿⡇⡇⢸⣿⠿⣿⡿⡿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⢠⣠⣠⣠⠀⠀⠀⢺⠀⢸⠀⣿⣷⣷⣾⣿⠀⣿⡇⡗⡇⠀⠀⣤⣠⣠⢠⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠈⣿⣿⡏⠀⠀⠀⢼⣰⣸⣿⡏⠛⢻⠛⡟⣿⣿⡇⣿⡇⠀⠀⠈⣿⣿⡏⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⣿⡏⡇⠀⠀⠀⣼⣿⣿⣿⣷⣶⣾⣶⣶⣿⣿⡇⣿⡇⠀⠀⠀⡏⣿⡇⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⣿⣇⡇⠀⠀⠀⢿⣿⣿⣿⡿⠟⠲⠻⢿⣿⣿⡇⣿⡇⠀⠀⠀⣅⣿⡇⠀⠀⠀⠀\n" +
                "⠀⠀⠀⢹⣿⣿⣷⢰⡆⢰⣿⡿⢿⠀⠀⠀⠀⠀⠀⠀⠀⡿⢿⣷⡀⣰⣆⣿⡇⣿⡟⠁⠀⠀\n" +
                "⠀⠀⠀⢸⣿⣿⣿⡟⠛⣿⣿⡇⢸⠀⠀⠀⠀⠀⠀⠀⠀⡇⢸⣿⣿⠛⢻⣿⣿⣿⡏⠀⠀⠀\n" +
                "⠀⠀⠀⢸⣿⣿⣿⡇⠀⣿⣿⣿⣏⠀⢀⠀⠀⢀⠀⠀⠀⣿⣿⣿⣯⠀⢸⣿⣿⣿⡇⠀⠀⠀\n" +
                "⠀⠀⠀⢸⣿⣿⣿⣷⣷⣿⣿⣿⣧⢼⣈⠃⠀⢸⢋⣠⠄⣿⣿⣿⣿⣾⣿⣿⣿⣿⡇⠀⠀⠀\n" +
                "⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⢥⢇⡃⠀⢸⡺⡪⢼⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀\n" +
                "⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣜⣟⠂⠀⢸⢲⢏⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀\n" +
                "⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⠺⣌⡇⠀⢸⣧⡝⢲⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀\n" +
                "⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣃⣀⣸⣾⣶⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀\n" +
                "⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⡀⠀\n" +
                "Você adentra as masmorras do castelo e sente o peso de uma atmosfera opressiva. \n" +
                "À sua frente, uma porta antiga se destaca. Uma porta coberta de musgo e umidade, como se o tempo tivesse esquecido sua existência. \n" +
                "Pequenos insetos se movem entre as frestas, e um cheiro de terra molhada invade o ar. Há algo de misterioso e maligno escondido atrás dessa entrada.");

        options.add(new GiveUp());
        options.add(new FightDragon());
    }
}
