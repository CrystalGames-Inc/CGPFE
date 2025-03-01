package CGPFE.Display;

import CGPFE.Management.PlayerDataMgr;

public class GameStartup {
    public boolean skipIntro = false;
    public boolean skipRegister = false;

    public void startGame(){
        PlayerDataMgr pMgr = PlayerDataMgr.getInstance();

        if(!skipIntro) startIntro();

        if(!skipRegister) pMgr.registerNewPlayer();
    }

    public void startIntro(){
        System.out.println("""
                 =======================================================================\s
                 |  _____                _        _  _____                          \s
                 | / ____|              | |      | |/ ____|                         \s
                 || |     _ __ _   _ ___| |_ __ _| | |  __  __ _ _ __ ___   ___  ___\s
                 || |    | '__| | | / __| __/ _` | | | |_ |/ _` | '_ ` _ \\ / _ \\/ __|
                 || |____| |  | |_| \\__ \\ || (_| | | |__| | (_| | | | | | |  __/\\__ \\
                 | \\_____|_|   \\__, |___/\\__\\__,_|_|\\_____|\\__,_|_| |_| |_|\\___||___/
                 |              __/ |                                               \s
                 |             |___/____ _____ _____  ______ ______                 \s
                 |                / ____/ ____|  __ \\|  ____|  ____|                \s
                 |               | |   | |  __| |__) | |__  | |__                   \s
                 |               | |   | | |_ |  ___/|  __| |  __|                  \s
                 |               | |___| |__| | |    | |    | |____                 \s
                 |                \\_____\\_____|_|    |_|    |______|                \s
                 =======================================================================\s
                 """
        );
    }
}