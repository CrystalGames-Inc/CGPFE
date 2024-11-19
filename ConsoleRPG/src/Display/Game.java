package Display;

import God.Creation.Entity.Additional.EntityWallet;
import God.Creation.Entity.Mandatory.EntityAttributeModifiers;
import God.Creation.Entity.Mandatory.EntityAttributes;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Constants.Race;
import God.Creation.Importance.Skills.Skill;
import Management.Player.Player;
import Management.Player.PlayerDataManager;
import Game.Other.Quol;
import Management.Player.PlayerInfo;

import java.util.Scanner;

public class Game {

    static boolean skipIntro = true;
    static boolean skipRegister = false;

    static Scanner input = new Scanner(System.in);

    public static PlayerInfo info = new PlayerInfo("PLACEHOLDER", Race.PLACEHOLDER, Class.PLACEHOLDER, 0,0,0,0, new Skill[]{});
    public static EntityAttributes attributes = new EntityAttributes(0,0,0,0,0,0,0);
    public static EntityAttributeModifiers attributeModifiers = new EntityAttributeModifiers(0,0,0,0,0,0,0);
    public static EntityWallet wallet = new EntityWallet(0,0,0,0);


    public static Player player = new Player(info, attributes, attributeModifiers, wallet);

    public static void main(String[] args){
        Startup();
    }

    public static void Startup(){
        if(!skipIntro) StartIntro();

        if(!skipRegister){
            PlayerDataManager.registerPlayer(player);
            PlayerDataManager.displayPlayerData(player);
        }
    }

    public static void StartIntro(){
        System.out.println("======================================================================="); Quol.wait(350);
        System.out.println("\r _____                _        _ _____                           \r"); Quol.wait(350);
        System.out.println("/  __ \\              | |      | |  __ \\                          \r"); Quol.wait(350);
        System.out.println("| /  \\/_ __ _   _ ___| |_ __ _| | |  \\/ __ _ _ __ ___   ___  ___ \r"); Quol.wait(350);
        System.out.println("| |   | '__| | | / __| __/ _` | | | __ / _` | '_ ` _ \\ / _ \\/ __|\r"); Quol.wait(350);
        System.out.println("| \\__/\\ |  | |_| \\__ \\ || (_| | | |_\\ \\ (_| | | | | | |  __/\\__ \\\r"); Quol.wait(350);
        System.out.println(" \\____/_|   \\__, |___/\\__\\__,_|_|\\____/\\__,_|_| |_| |_|\\___||___/\r"); Quol.wait(350);
        System.out.println("             __/ |                                               \r"); Quol.wait(350);
        System.out.println("            |___/                                                \r"); Quol.wait(350);
        System.out.println(" _____                       _     ____________ _____            \r"); Quol.wait(350);
        System.out.println("/  __ \\                     | |    | ___ \\ ___ \\  __ \\           \r"); Quol.wait(350);
        System.out.println("| /  \\/ ___  _ __  ___  ___ | | ___| |_/ / |_/ / |  \\/           \r"); Quol.wait(350);
        System.out.println("| |    / _ \\| '_ \\/ __|/ _ \\| |/ _ \\    /|  __/| | __            \r"); Quol.wait(350);
        System.out.println("| \\__/\\ (_) | | | \\__ \\ (_) | |  __/ |\\ \\| |   | |_\\ \\           \r"); Quol.wait(350);
        System.out.println(" \\____/\\___/|_| |_|___/\\___/|_|\\___\\_| \\_\\_|    \\____/           \r"); Quol.wait(350);
        System.out.println("======================================================================="); Quol.wait(350);
        System.out.println("Press Any Key To Continue...");
        input.nextLine();
    }
}
