package Game.Other;

import java.io.IOException;

public class Quol {
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
}
