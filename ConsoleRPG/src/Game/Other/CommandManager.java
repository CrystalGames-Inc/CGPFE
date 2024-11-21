package Game.Other;

public class CommandManager {

    //region Custom Commands

    public static void wait(int millis){
        try{
            Thread.sleep(350);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }

    public static void cls(){
        System.out.flush();
    }

    //endregion

    public static void checkForCommand(String text){
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

    static void exit(){
        System.exit(0);
    }

    static void help(){
        System.out.println("List Of Available Commands:");
        System.out.println("    exit - Exit the application");
    }
}
