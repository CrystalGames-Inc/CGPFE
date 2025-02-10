package SpiritEngine.Data.Models.Items.Equipment.Weapon.Ranged;

import SpiritEngine.Data.Models.Items.Equipment.Weapon.Base.Critical;
import SpiritEngine.Data.Models.Items.Equipment.Weapon.Base.Damage;
import SpiritEngine.Data.Models.Items.Equipment.Weapon.Weapon;

public class RangedWeapon extends Weapon {
    public SpiritEngine.Data.Models.Items.Equipment.Weapon.Ranged.Ammunition Ammunition;

    public RangedWeapon(String name, int id, int maxCapacity, double cost, Damage dmgS, Damage dmgM, Critical critical, double range, double weight, SpiritEngine.Data.Models.Items.Equipment.Weapon.Base.Type[] type, SpiritEngine.Data.Models.Items.Equipment.Weapon.Base.Special[] special, SpiritEngine.Data.Models.Items.Equipment.Weapon.Ranged.Ammunition ammunition) {
        super(name, id, maxCapacity, cost, dmgS, dmgM, critical, range, weight, type, special);
        Ammunition = ammunition;
    }
}
