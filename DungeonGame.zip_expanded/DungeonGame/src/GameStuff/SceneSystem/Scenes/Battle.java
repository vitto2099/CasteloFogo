package GameStuff.SceneSystem.Scenes;

import GameStuff.SceneSystem.Options.Attack;
import GameStuff.SceneSystem.Options.GiveUp;

public class Battle extends Scene{
    public Battle() {
        super("/                            )\n" +
                        "          (                             |\\\n" +
                        "         /|                              \\\n" +
                        "        //                                \\\n" +
                        "       ///                                 |\n" +
                        "      /( \\                                  )\\\n" +
                        "      \\  _                               //)\n" +
                        "       \\  :_                           ///\n" +
                        "        \\     )                         // \\\n" +
                        "         \\:  /                         // |/\n" +
                        "          \\ / \\                       //  \\\n" +
                        "           /)   \\   __..-'           (|  _|\n" +
                        "          //     /   .'              \\ \\  \\\n" +
                        "         /|       \\ ___          \\ | /\n" +
                        "        (|    /          '-.       ) /.'\n" +
                        "         \\ .  '-.            _    / / \\\n" +
                        "          \\'.     > --. '.     \\  / / /\n" +
                        "           \\ \\      \\     \\  \\     .' /.'\n" +
                        "            \\ \\  '. /     \\ )    / .' |\n" +
                        "             \\ _     _   |    .'/ /\n" +
                        "              \\  \\      _ |   / /  / _\n" +
                        "               \\  \\       / .' /  /     \\\n" +
                        "               \\   |     /.'   / .'       '-,\n" +
                        "                \\   \\  .'   .'/             \\\n" +
                        "   /\\    /\\      ) (    /.'           \\    |\n" +
                        "  | _// \\    (.'      /               |    |\n" +
                        "  /    /--'`    ,                   /    /\n" +
                        "  ( ) /b)  \\  '.   :            _.-'/ _/\n" +
                        "  /:/:  ,     ) :        (      /_.'/-'|  /\n" +
                        " /:/: /\\ >  ,.----.__\\    /        (/(/(/\n" +
                        "(_(,/V .'/--'    /  __/ |   /\n" +
                        " VvvV  //`    .-' .'     \\   \\\n" +
                        "   n_n//     (((/->/        |   /\n" +
                        "   '--'         ~='          \\  |\n" +
                        "                              | |,,,\n" +
                        "                          \\  \\  /\n" +
                        "                               '.__)\n"+
                "Voce percorre um corredor escuro que te leva a uma ampla sala tomada pela escuridao, a coragem que percorre seu corpo vacila perante a um calor infernal\n" +
                "vindo do interior da sala, e voce escuta uma respiração monstruosa a alguns metros a sua frente. Uma sombra colossal se ergue imponentemente no salao,\n" +
                "a escuridao e rompida pelo brilho incandescente de um par de olhos vermelhos, o salao é iluminado por toxas fixidas nas laterias das paredes, e voce finalmente" +
                "\nvê o seus maior temor. Um dragao vermelho.");
        options.add(new GiveUp());
        options.add(new Attack());
    }
}
