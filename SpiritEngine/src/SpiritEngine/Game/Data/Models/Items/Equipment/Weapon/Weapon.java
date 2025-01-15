package SpiritEngine.Game.Data.Models.Items.Equipment.Weapon;

import SpiritEngine.Game.Data.Models.Items.Equipment.Weapon.Base.*;
import SpiritEngine.Game.Data.Models.Items.Item;

public class Weapon extends Item {
    public String name;
    public int id;
    public int maxCapacity;
    public double cost; //In gp
    public String dmgS;
    public String dmgM;
    public String critical;
    public double range; //In ft
    public double weight; //In lbs
    public Type[] type;
    public Special[] special;

    public Weapon(String name, int id, int maxCapacity, double cost, String dmgS, String dmgM, String critical, double range, double weight, Type[] type, Special[] special) {
        super(name, id, cost);
        this.name = name;
        this.id = id;
        this.maxCapacity = maxCapacity;
        this.cost = cost;
        this.dmgS = dmgS;
        this.dmgM = dmgM;
        this.critical = critical;
        this.range = range;
        this.weight = weight;
        this.type = type;
        this.special = special;
    }
}
