package SpiritEngine.Data.Models.Items.Equipment.Weapon.Base;

public class Damage {

    public int die;
    public int amount;

    public Damage(int die){
        this.die = die;
        this.amount = 1;
    }

    public Damage(int amount, int die){
        this.die = die;
        this.amount = amount;
    }
}