package Management;

import java.util.Scanner;

public class CommandMgr {

    private static CommandMgr _instance;
    Scanner input = new Scanner(System.in);

    private CommandMgr(){

    }

    public static synchronized CommandMgr getInstance(){
        if(_instance == null)
            _instance = new CommandMgr();

        return _instance;
    }

    public void checkForCommand(String text){
        String[] words = text.split(" ");
        switch (words[0].toUpperCase()){
            case "EXIT":
                exit();
                break;
            case "HELP":
                help();
                break;
            default:
                System.out.println("Unregistered command. For list of available commands use 'help'");
                break;
        }
    }

    public void exit(){
        System.exit(0);
    }

    public void help(){
        System.out.println("List Of Available Commands:");
        System.out.println("    exit - Exit the application");
    }

    public void wait(int millis){
        try{
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void cls(){
        System.out.flush();
    }

    public void awaitUserInput(){
        input.nextLine();
    }
}
