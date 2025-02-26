package CGPFE.Data.Models.Items.Equipment.Weapon.Ranged;

import CGPFE.Data.Models.Items.Equipment.Weapon.Base.Critical;
import CGPFE.Data.Models.Items.Equipment.Weapon.Base.Damage;
import CGPFE.Data.Models.Items.Equipment.Weapon.Weapon;

public class RangedWeapon extends Weapon {
    public CGPFE.Data.Models.Items.Equipment.Weapon.Ranged.Ammunition Ammunition;

    public RangedWeapon(String name, int id, int maxCapacity, double cost, Damage dmgS, Damage dmgM, Critical critical, int range, double weight, CGPFE.Data.Models.Items.Equipment.Weapon.Base.Type[] type, CGPFE.Data.Models.Items.Equipment.Weapon.Base.Special[] special, CGPFE.Data.Models.Items.Equipment.Weapon.Ranged.Ammunition ammunition) {
        super(name, id, maxCapacity, cost, dmgS, dmgM, critical, range, weight, type, special);
        Ammunition = ammunition;
    }
}
