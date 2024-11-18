package Display;

import Game.Mechanics.Dice;
import Management.Quol;

import java.util.Scanner;

public class Game {

    static boolean skipInto = false;
    static boolean skipRegister = false;

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args){
        Startup();
    }

    public static void Startup(){
        if(!skipInto) StartIntro();

        if(!skipRegister){

        }
    }

    public static void StartIntro(){
        System.out.println("======================================================================="); Quol.Wait(350);
        System.out.println("\r _____                _        _ _____                           \r"); Quol.Wait(350);
        System.out.println("/  __ \\              | |      | |  __ \\                          \r"); Quol.Wait(350);
        System.out.println("| /  \\/_ __ _   _ ___| |_ __ _| | |  \\/ __ _ _ __ ___   ___  ___ \r"); Quol.Wait(350);
        System.out.println("| |   | '__| | | / __| __/ _` | | | __ / _` | '_ ` _ \\ / _ \\/ __|\r"); Quol.Wait(350);
        System.out.println("| \\__/\\ |  | |_| \\__ \\ || (_| | | |_\\ \\ (_| | | | | | |  __/\\__ \\\r"); Quol.Wait(350);
        System.out.println(" \\____/_|   \\__, |___/\\__\\__,_|_|\\____/\\__,_|_| |_| |_|\\___||___/\r"); Quol.Wait(350);
        System.out.println("             __/ |                                               \r"); Quol.Wait(350);
        System.out.println("            |___/                                                \r"); Quol.Wait(350);
        System.out.println(" _____                       _     ____________ _____            \r"); Quol.Wait(350);
        System.out.println("/  __ \\                     | |    | ___ \\ ___ \\  __ \\           \r"); Quol.Wait(350);
        System.out.println("| /  \\/ ___  _ __  ___  ___ | | ___| |_/ / |_/ / |  \\/           \r"); Quol.Wait(350);
        System.out.println("| |    / _ \\| '_ \\/ __|/ _ \\| |/ _ \\    /|  __/| | __            \r"); Quol.Wait(350);
        System.out.println("| \\__/\\ (_) | | | \\__ \\ (_) | |  __/ |\\ \\| |   | |_\\ \\           \r"); Quol.Wait(350);
        System.out.println(" \\____/\\___/|_| |_|___/\\___/|_|\\___\\_| \\_\\_|    \\____/           \r"); Quol.Wait(350);
        System.out.println("======================================================================="); Quol.Wait(350);
        System.out.println("Press Any Key To Continue...");
        input.nextLine();
    }
}
