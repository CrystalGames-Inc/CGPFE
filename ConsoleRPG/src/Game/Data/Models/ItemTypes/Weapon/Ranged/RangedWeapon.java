package Game.Data.Models.ItemTypes.Weapon.Ranged;

import Game.Data.Models.ItemTypes.Weapon.Base.Specials;
import Game.Data.Models.ItemTypes.Weapon.Base.Types;
import Game.Data.Models.ItemTypes.Weapon.Weapon;

public class RangedWeapon extends Weapon {
    public Ammunition Ammunition;

    public RangedWeapon(String name, int inventoryId, int maxCapacity, int amount, double cost, String dmgS, String dmgM, String critical, double range, double weight, Types[] type, Specials[] special, Ammunition ammunition) {
        super(name, inventoryId, maxCapacity, amount, cost, dmgS, dmgM, critical, range, weight, type, special);
        Ammunition = ammunition;
    }
}
