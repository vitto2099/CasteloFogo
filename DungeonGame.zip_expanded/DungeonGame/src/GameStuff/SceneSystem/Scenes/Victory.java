package GameStuff.SceneSystem.Scenes;

import GameStuff.SceneSystem.Options.Credits;
import GameStuff.SceneSystem.Options.Quit;

public class Victory extends Scene{
    public Victory() {
        super("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣇⣸⣧⣾⣯⣻⢶⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣷⣻⣿⣭⠟⠛⠻⢾⣸⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡍⠈⠉⠀⠀⠀⠀⢉⣾⢹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣄⠀⠀⠀⣀⣶⡿⠃⢻⣆⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⠶⠶⠾⠋⠒⠀⣀⣾⣿⣿⣿⣆⠀⢀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠿⣷⣶⣶⠁⠀⠴⣱⣿⢟⣿⡿⠟⠉⠉⠉⠉⢶⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⠛⣿⢿⣧⣴⡾⣋⣷⠿⣻⠃⢀⣤⣶⢶⢿⣿⢿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢴⡛⣿⠀⠈⣧⣿⣯⠞⠉⣡⣶⣿⣷⡟⢿⠉⢮⡀⠙⣆⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠷⣜⢷⠀⣿⣽⡟⢀⣶⣋⣽⣿⣿⣷⣌⢷⣀⣿⡿⡿⢿⢿⡹⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣄⠈⠻⣿⣿⣿⠦⢿⣭⣶⣿⣹⣿⣿⡟⠻⣿⢻⡹⡝⣌⢶⢷⡹⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣷⣾⠋⣧⠉⣏⡻⠋⢙⣿⣿⣿⣿⣿⡀⣿⠆⢹⡙⡝⣎⢦⢷⡽⠆⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣉⣿⣿⣿⠀⣿⢀⠟⠀⡴⠏⡇⢈⣿⣿⣿⣷⠸⡎⠆⢻⣙⣼⣾⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⡏⠉⣿⣿⣇⡿⠋⣠⠞⡇⠀⣇⠀⠻⣻⣿⣿⣷⡿⠾⠛⠋⠉⠹⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣦⣀⣿⣿⣯⣄⡶⢹⠀⣿⠀⣿⠀⠀⢙⣿⣿⣿⣦⡀⠀⣀⡠⠖⠻⣿⡆⠀⣠⣶⢦⡀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⠋⣿⣿⣿⣿⣆⠈⡄⢹⠀⢸⠀⣤⣾⣿⣿⣿⣿⣷⣉⣁⡀⠀⠀⣹⣿⡾⠟⣧⢿⣇⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⣿⣸⣿⣿⡿⣿⣿⣷⣄⡀⣀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⣠⠞⠁⢸⣿⡆⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⢁⣟⣿⣿⣷⣿⣿⣍⠉⠛⠟⠿⠿⠿⠿⠿⠛⠿⣿⣿⣿⣿⣻⡿⠋⢀⡞⠁⠀⠀⢸⣿⣧⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠻⣿⡏⣾⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣶⣶⣶⣶⣶⣶⢿⡟⣻⣿⣿⠟⠁⡰⠋⠀⠀⠀⠀⢸⣿⣿⡄⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣆⠙⠷⠿⣿⢏⣿⣿⣛⡷⢾⣇⣀⠼⣏⠉⠉⡉⠁⠀⠀⣿⣼⡿⠃⣠⠞⠁⠀⠀⠀⠀⠀⢸⣿⣿⡇⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣏⠈⠳⣄⣿⣿⣷⣿⠋⡻⢿⣷⣿⣁⣀⣼⣤⣶⣶⣶⠶⣿⣿⠟⢀⡼⠁⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⢣⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠯⣕⣶⣾⣿⡻⣿⡿⣤⠃⣴⣿⠋⣿⢿⢸⣉⣉⣉⣀⣴⣿⠃⣠⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣼⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏⢠⣌⠙⣿⣿⣿⣿⣤⣯⣶⣿⣏⣀⣿⠈⠈⡉⠙⢿⣿⡿⠁⣠⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣯⣼⣿⡄\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣷⣿⢿⣷⣿⢿⣻⢿⣏⢻⣿⡿⣿⣿⣿⠀⣀⠙⢶⣿⡟⠀⣰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡿⢿⣿⡇\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣾⣯⣵⣿⣿⡿⢷⣟⣾⣭⣿⣿⠃⣿⣿⣿⡂⠉⣶⣿⠟⠀⢠⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣵⣾⣿⡇\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢀⣀⠀⠀⢀⡴⠟⣩⡿⠋⠉⢉⣿⣆⣾⣹⡿⣷⣿⡿⢸⣿⣿⣿⣙⢿⣿⡿⠀⢀⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢺⣿⣿⣿⣿⠇\n" +
                "⠀⠀⠀⠀⠀⠀⢀⡾⠿⣤⣶⣏⡠⠞⠉⠀⠀⠀⣟⣏⣾⣿⣿⡿⢻⣿⡇⣾⣿⣿⣿⣿⣿⣿⠀⠀⣾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⢻⠀\n" +
                "⠀⠀⠀⠀⢀⣠⠞⠀⢀⡽⢿⣏⠀⠀⠀⠀⠀⠀⣿⣽⣿⣿⠿⣧⣼⣿⣅⣽⣿⣿⣿⣿⣿⠃⠀⣰⣁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢺⣿⣿⣿⡟⡞⠀\n" +
                "⢀⡀⠀⠈⠉⠁⣠⡶⠋⠁⢀⣼⠷⠀⠀⠀⠀⢸⣿⣿⣯⡀⠀⠀⠈⣿⣿⣿⣿⠟⠉⣿⡿⠀⢀⣿⠿⣄⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⣿⣿⣿⣿⡇⠀\n" +
                "⢸⡇⠀⢀⣰⣾⠏⠀⢀⡴⠋⠀⠀⠀⢴⣶⣿⣿⣿⣿⣿⡁⠠⣄⣾⣿⣿⣿⠋⠀⠀⠿⠧⢀⣄⣄⣀⣀⠀⠉⠙⠲⢤⡀⠀⠀⠀⠀⣾⠋⣉⣿⡿⣹⠁⠀\n" +
                "⠞⢀⣴⡺⠏⠁⠀⠀⢸⠁⠀⠀⠀⠀⢸⣿⡿⡏⣙⡿⣿⣷⣒⣸⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣶⣦⣄⡀⠙⢦⡀⠀⢠⣿⡾⠛⣁⣠⠇⠀⠀\n" +
                "⠶⡻⠏⠁⠀⢀⣀⣤⡼⠂⠀⠀⠀⢠⣿⡇⢹⠃⢃⢇⣼⠿⠿⢿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⣿⣿⣦⡀⠙⢦⣾⢋⡴⠊⠁⠀⠀⠀⠀\n" +
                "⠊⣀⣴⡶⠾⠛⠛⠉⠁⠀⠀⠀⠀⢸⣼⠀⡿⠀⡼⣿⣿⣀⣀⢀⠞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⠹⡽⣿⣿⣿⣦⡀⡽⠋⠀⣶⡶⣶⢶⡶⣶\n" +
                "⠿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⣶⠛⢿⣶⣇⣰⣿⣿⣯⣈⣉⣹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣆⢻⠹⢿⣿⣿⣿⣧⡀⠀⠛⠛⠛⠛⠛⠛\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢦⡀⠉⠙⠛⠛⠉⣹⠛⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⢛⢿⢿⡿⣿⠛⠁⢀⣿⠀⠀⠀\n"+
                "Após uma batalha árdua e estratégica, você derrotou o poderoso Dragão Vermelho! Suas habilidades, coragem e determinação foram colocadas à prova,\n" +
                "e no fim, você emergiu vitorioso. O dragão, uma criatura temida por todos, agora repousa derrotado aos seus pés. A chama que uma vez aterrorizou o\n" +
                "reino foi extinta, trazendo paz e esperança para o futuro.");
        options.add(new Quit());
        options.add(new Credits());
    }
}
