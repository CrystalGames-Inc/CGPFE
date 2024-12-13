package Management;

public class CommandManagerSingleton {

    private static CommandManagerSingleton _instance;

    private CommandManagerSingleton(){

    }

    public static synchronized CommandManagerSingleton getInstance(){
        if(_instance == null)
            _instance = new CommandManagerSingleton();

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
            Thread.sleep(350);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }

    public void cls(){
        System.out.flush();
    }
}
