package SpiritEngine.God.Creation.Player.Additions;

import SpiritEngine.Game.Data.Models.Items.Equipment.Weapon.Ranged.RangedWeapon;

public class PlayerRangedWeapon {

    public RangedWeapon weapon;
    public int bonus;

    public PlayerRangedWeapon(RangedWeapon weapon, int bonus) {
        this.weapon = weapon;
        this.bonus = bonus;
    }
}
