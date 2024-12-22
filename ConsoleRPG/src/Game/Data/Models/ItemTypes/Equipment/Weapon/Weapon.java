package Game.Data.Models.ItemTypes.Equipment.Weapon;

import Game.Data.Models.Item;

public class Weapon extends Item {
    public String Name;
    public int MaxCapacity;
    public double Cost; //In gp
    public String DmgS;
    public String DmgM;
    public String Critical;
    public double Range; //In ft
    public double Weight; //In lbs
    public Game.Data.Models.ItemTypes.Equipment.Weapon.Base.Type[] Type;
    public Game.Data.Models.ItemTypes.Equipment.Weapon.Base.Special[] Special;

    public Weapon(String name, int maxCapacity, double cost, String dmgS, String dmgM, String critical, double range, double weight, Game.Data.Models.ItemTypes.Equipment.Weapon.Base.Type[] type, Game.Data.Models.ItemTypes.Equipment.Weapon.Base.Special[] special) {
        Name = name;
        MaxCapacity = maxCapacity;
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
