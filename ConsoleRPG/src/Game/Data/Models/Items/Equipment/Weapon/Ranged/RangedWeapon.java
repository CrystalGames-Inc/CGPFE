package Game.Data.Models.Items.Equipment.Weapon.Ranged;

import Game.Data.Models.Items.Equipment.Weapon.Weapon;

public class RangedWeapon extends Weapon {
    public Game.Data.Models.Items.Equipment.Weapon.Ranged.Ammunition Ammunition;

    public RangedWeapon(String name, int maxCapacity, double cost, String dmgS, String dmgM, String critical, double range, double weight, Game.Data.Models.Items.Equipment.Weapon.Base.Type[] type, Game.Data.Models.Items.Equipment.Weapon.Base.Special[] special, Game.Data.Models.Items.Equipment.Weapon.Ranged.Ammunition ammunition) {
        super(name, maxCapacity, cost, dmgS, dmgM, critical, range, weight, type, special);
        Ammunition = ammunition;
    }
}
