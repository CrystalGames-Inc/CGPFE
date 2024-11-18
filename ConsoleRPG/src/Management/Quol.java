package Management;

public class Quol {
    public static void Wait(int millis){
        try{
            Thread.sleep(350);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }
}
