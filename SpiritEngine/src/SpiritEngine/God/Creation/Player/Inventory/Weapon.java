package SpiritEngine.God.Creation.Player.Inventory;

public class Weapon {

    public SpiritEngine.Data.Models.Items.Equipment.Weapon.Weapon weapon;
    public int bonus;

    public Weapon(SpiritEngine.Data.Models.Items.Equipment.Weapon.Weapon weapon, int bonus) {
        this.weapon = weapon;
        this.bonus = bonus;
    }
}