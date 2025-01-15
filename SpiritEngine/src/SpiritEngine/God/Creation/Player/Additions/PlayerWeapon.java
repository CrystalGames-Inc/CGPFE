package SpiritEngine.God.Creation.Player.Additions;

import SpiritEngine.Game.Data.Models.Items.Equipment.Weapon.Weapon;

public class PlayerWeapon {

    public Weapon weapon;
    public int bonus;

    public PlayerWeapon(Weapon weapon, int bonus) {
        this.weapon = weapon;
        this.bonus = bonus;
    }
}