package CGPFE.Data.Models.Items.Equipment.Weapon.Base;

public class Critical {
    public int multiplier;
    public int minDie;

    public Critical(int multiplier){
        this.multiplier = multiplier;
        minDie = 20;
    }

    public Critical(int multiplier, int minDie){
        this.multiplier = multiplier;
        this.minDie = minDie;
    }
}