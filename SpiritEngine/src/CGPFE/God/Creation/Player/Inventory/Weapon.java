package CGPFE.God.Creation.Player.Inventory;

public class Weapon {

    public CGPFE.Data.Models.Items.Equipment.Weapon.Weapon weapon;
    public int bonus;

    public Weapon(CGPFE.Data.Models.Items.Equipment.Weapon.Weapon weapon, int bonus) {
        this.weapon = weapon;
        this.bonus = bonus;
    }
}