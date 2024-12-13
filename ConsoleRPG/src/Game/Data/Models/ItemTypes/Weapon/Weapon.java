package Game.Data.Models.ItemTypes.Weapon;

import Game.Data.Models.Item;

public class Weapon extends Item {
    public String Name;
    public int InventoryId;
    public int MaxCapacity;
    public int Amount;
    public int Cost;
    public String DmgS;
    public String DmgM;
    public String Critical;
    public double Range;
    public double Weight;
    public Types[] Type;
    public Specials[] Special;

    public Weapon(String name, int inventoryId, int maxCapacity, int amount, int cost, String dmgS, String dmgM, String critical, double range, double weight, Types[] type, Specials[] special) {
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
