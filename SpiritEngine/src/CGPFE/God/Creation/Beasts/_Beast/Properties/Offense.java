package CGPFE.God.Creation.Beasts._Beast.Properties;

import CGPFE.Data.Models.Items.Equipment.Weapon.Ranged.RangedWeapon;
import CGPFE.Data.Models.Items.Equipment.Weapon.Weapon;

public class Offense {

    public Weapon weapon;
    public RangedWeapon rangedWeapon;

    public Offense(Weapon weapon, RangedWeapon rangedWeapon) {
        this.weapon = weapon;
        this.rangedWeapon = rangedWeapon;
    }
}