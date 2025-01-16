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

        pMgr.displayAll();
    }

    public void startIntro(){
        System.out.println("""
                        ========================================================================
                           _____                _        _  _____                          \s
                          / ____|              | |      | |/ ____|                         \s
                         | |     _ __ _   _ ___| |_ __ _| | |  __  __ _ _ __ ___   ___  ___\s
                         | |    | '__| | | / __| __/ _` | | | |_ |/ _` | '_ ` _ \\ / _ \\/ __|
                         | |____| |  | |_| \\__ \\ || (_| | | |__| | (_| | | | | | |  __/\\__ \\
                          \\_____|_|   \\__, |___/\\__\\__,_|_|\\_____|\\__,_|_| |_| |_|\\___||___/
                                       __/ |                                               \s
                           _____      |___/   _ _   ______             _                   \s
                          / ____|     (_)    (_) | |  ____|           (_)                  \s
                         | (___  _ __  _ _ __ _| |_| |__   _ __   __ _ _ _ __   ___        \s
                          \\___ \\| '_ \\| | '__| | __|  __| | '_ \\ / _` | | '_ \\ / _ \\       \s
                          ____) | |_) | | |  | | |_| |____| | | | (_| | | | | |  __/       \s
                         |_____/| .__/|_|_|  |_|\\__|______|_| |_|\\__, |_|_| |_|\\___|       \s
                                | |                               __/ |                    \s
                                |_|                              |___/                     \s
                        ========================================================================
                        """
        );
    }
}