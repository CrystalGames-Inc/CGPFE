package SpiritEngine.Game.Data.Models.Items.Equipment.Weapon.Ranged;

import SpiritEngine.Game.Data.Models.Items.Equipment.Weapon.Weapon;

public class RangedWeapon extends Weapon {
    public SpiritEngine.Game.Data.Models.Items.Equipment.Weapon.Ranged.Ammunition Ammunition;

    public RangedWeapon(String name, int id, int maxCapacity, double cost, String dmgS, String dmgM, String critical, double range, double weight, SpiritEngine.Game.Data.Models.Items.Equipment.Weapon.Base.Type[] type, SpiritEngine.Game.Data.Models.Items.Equipment.Weapon.Base.Special[] special, SpiritEngine.Game.Data.Models.Items.Equipment.Weapon.Ranged.Ammunition ammunition) {
        super(name, id, maxCapacity, cost, dmgS, dmgM, critical, range, weight, type, special);
        Ammunition = ammunition;
    }
}
