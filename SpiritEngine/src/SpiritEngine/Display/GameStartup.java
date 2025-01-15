package SpiritEngine.Display;

import SpiritEngine.Management.CommandMgr;
import SpiritEngine.Management.PlayerDataMgr;

import java.util.Scanner;

public class GameStartup {
    boolean skipIntro = false;
    boolean skipRegister = false;

    public void startGame(){
        PlayerDataMgr pMgr = PlayerDataMgr.getInstance();

        if(!skipIntro) startIntro();

        if(!skipRegister) pMgr.registerNewPlayer();
    }

    public void startIntro(){
        System.out.println(
                "========================================================================\n" +
                "   _____                _        _  _____                           \n" +
                "  / ____|              | |      | |/ ____|                          \n" +
                " | |     _ __ _   _ ___| |_ __ _| | |  __  __ _ _ __ ___   ___  ___ \n" +
                " | |    | '__| | | / __| __/ _` | | | |_ |/ _` | '_ ` _ \\ / _ \\/ __|\n" +
                " | |____| |  | |_| \\__ \\ || (_| | | |__| | (_| | | | | | |  __/\\__ \\\n" +
                "  \\_____|_|   \\__, |___/\\__\\__,_|_|\\_____|\\__,_|_| |_| |_|\\___||___/\n" +
                "               __/ |                                                \n" +
                "   _____      |___/   _ _   ______             _                    \n" +
                "  / ____|     (_)    (_) | |  ____|           (_)                   \n" +
                " | (___  _ __  _ _ __ _| |_| |__   _ __   __ _ _ _ __   ___         \n" +
                "  \\___ \\| '_ \\| | '__| | __|  __| | '_ \\ / _` | | '_ \\ / _ \\        \n" +
                "  ____) | |_) | | |  | | |_| |____| | | | (_| | | | | |  __/        \n" +
                " |_____/| .__/|_|_|  |_|\\__|______|_| |_|\\__, |_|_| |_|\\___|        \n" +
                "        | |                               __/ |                     \n" +
                "        |_|                              |___/                      \n" +
                "========================================================================"
        );
    }
}