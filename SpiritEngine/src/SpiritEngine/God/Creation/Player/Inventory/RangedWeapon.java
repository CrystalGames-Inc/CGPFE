package SpiritEngine.God.Creation.Player.Inventory;

public class RangedWeapon {

    public SpiritEngine.Data.Models.Items.Equipment.Weapon.Ranged.RangedWeapon weapon;
    public int bonus;

    public RangedWeapon(SpiritEngine.Data.Models.Items.Equipment.Weapon.Ranged.RangedWeapon weapon, int bonus) {
        this.weapon = weapon;
        this.bonus = bonus;
    }
}
