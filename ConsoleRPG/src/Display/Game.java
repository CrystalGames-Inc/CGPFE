package Display;

import Management.Player.Player;
import Management.Player.PlayerDataManager;
import Game.Other.CommandManager;

import java.util.Scanner;

public class Game {

    static boolean skipIntro = true;
    static boolean skipRegister = false;

    static Scanner input = new Scanner(System.in);

    static Player player;

    public static void main(String[] args){
        Startup();
    }

    public static void Startup(){
        if(!skipIntro) StartIntro();

        if(!skipRegister){
            PlayerDataManager.registerNewPlayer(player);
            PlayerDataManager.displayPlayerData();
        }
    }

    public static void StartIntro(){
        System.out.println("======================================================================="); CommandManager.wait(350);
        System.out.println("\r _____                _        _ _____                           \r"); CommandManager.wait(350);
        System.out.println("/  __ \\              | |      | |  __ \\                          \r"); CommandManager.wait(350);
        System.out.println("| /  \\/_ __ _   _ ___| |_ __ _| | |  \\/ __ _ _ __ ___   ___  ___ \r"); CommandManager.wait(350);
        System.out.println("| |   | '__| | | / __| __/ _` | | | __ / _` | '_ ` _ \\ / _ \\/ __|\r"); CommandManager.wait(350);
        System.out.println("| \\__/\\ |  | |_| \\__ \\ || (_| | | |_\\ \\ (_| | | | | | |  __/\\__ \\\r"); CommandManager.wait(350);
        System.out.println(" \\____/_|   \\__, |___/\\__\\__,_|_|\\____/\\__,_|_| |_| |_|\\___||___/\r"); CommandManager.wait(350);
        System.out.println("             __/ |                                               \r"); CommandManager.wait(350);
        System.out.println("            |___/                                                \r"); CommandManager.wait(350);
        System.out.println(" _____                       _     ____________ _____            \r"); CommandManager.wait(350);
        System.out.println("/  __ \\                     | |    | ___ \\ ___ \\  __ \\           \r"); CommandManager.wait(350);
        System.out.println("| /  \\/ ___  _ __  ___  ___ | | ___| |_/ / |_/ / |  \\/           \r"); CommandManager.wait(350);
        System.out.println("| |    / _ \\| '_ \\/ __|/ _ \\| |/ _ \\    /|  __/| | __            \r"); CommandManager.wait(350);
        System.out.println("| \\__/\\ (_) | | | \\__ \\ (_) | |  __/ |\\ \\| |   | |_\\ \\           \r"); CommandManager.wait(350);
        System.out.println(" \\____/\\___/|_| |_|___/\\___/|_|\\___\\_| \\_\\_|    \\____/           \r"); CommandManager.wait(350);
        System.out.println("======================================================================="); CommandManager.wait(350);
        System.out.println("Press Any Key To Continue...");
        input.nextLine();
    }
}
