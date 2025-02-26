package CGPFE.God.Creation.Player.Inventory;

public class RangedWeapon {

    public CGPFE.Data.Models.Items.Equipment.Weapon.Ranged.RangedWeapon weapon;
    public int bonus;

    public RangedWeapon(CGPFE.Data.Models.Items.Equipment.Weapon.Ranged.RangedWeapon weapon, int bonus) {
        this.weapon = weapon;
        this.bonus = bonus;
    }
}
