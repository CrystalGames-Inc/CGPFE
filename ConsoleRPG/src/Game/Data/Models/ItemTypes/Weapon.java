package Game.Data.Models.ItemTypes;

import Game.Data.Models.Item;

public class Weapon implements Item {
    public int InventoryId;
    public int MaxCapacity;
    public int Amount;
    public String Name;
    public int Cost;
    public String DmgS;
    public String DmgM;
    public String Critical;
    public double Range;
    public double Weight;
    public String[] Type;
    public String[] Special;

    public Weapon(int inventoryId, int maxCapacity, int amount, String name, int cost, String dmgS, String dmgM, String critical, double range, double weight, String[] type, String[] special) {
        InventoryId = inventoryId;
        MaxCapacity = maxCapacity;
        Amount = amount;
        Name = name;
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
