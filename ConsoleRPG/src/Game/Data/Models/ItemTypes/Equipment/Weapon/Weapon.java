package Game.Data.Models.ItemTypes.Equipment.Weapon;

import Game.Data.Models.Item;
import Game.Data.Models.ItemTypes.Equipment.Weapon.Base.Specials;
import Game.Data.Models.ItemTypes.Equipment.Weapon.Base.Types;

public class Weapon extends Item {
    public String Name;
    public int InventoryId;
    public int MaxCapacity;
    public int Amount;
    public double Cost; //In gp
    public String DmgS;
    public String DmgM;
    public String Critical;
    public double Range; //In ft
    public double Weight; //In lbs
    public Types[] Type;
    public Specials[] Special;

    public Weapon(String name, int inventoryId, int maxCapacity, int amount, double cost, String dmgS, String dmgM, String critical, double range, double weight, Types[] type, Specials[] special) {
        Name = name;
        InventoryId = inventoryId;
        MaxCapacity = maxCapacity;
        Amount = amount;
        Cost = cost;
        DmgS = dmgS;
        DmgM = dmgM;
        Critical = critical;
        Range = range;
        Weight = weight;
        Type = type;
        Special = special;
    }
}
