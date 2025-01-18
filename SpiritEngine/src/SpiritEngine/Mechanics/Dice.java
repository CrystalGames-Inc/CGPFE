package SpiritEngine.Mechanics;

import java.util.Random;

public class Dice {

    static Random die = new Random();

    //Single-Die Roll.
    public int Roll(int faces){
        return  die.nextInt(1, faces + 1);
    }

    //Multiple Dice Roll.
    public int Roll(int faces, int amount){
        int sum = 0;
        for(int i = 0; i < amount; i++){
            sum += die.nextInt(1, faces + 1);
        }
        return sum;
    }

    //Multiple Dice Roll With A Modifier
    public int Roll(int faces, int amount, int modifier){
        int sum = 0;
        for (int i = 0; i < amount; i++){
            sum += die.nextInt(1, faces + 1);
        }

        return sum + modifier;
    }
}
