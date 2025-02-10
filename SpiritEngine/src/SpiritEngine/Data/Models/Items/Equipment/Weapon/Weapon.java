package SpiritEngine.Data.Models.Items.Equipment.Weapon;

import SpiritEngine.Data.Models.Items.Equipment.Weapon.Base.*;
import SpiritEngine.Data.Models.Items.Item;

public class Weapon extends Item {
    public String name;
    public int id;
    public int maxCapacity;
    public double cost; //In gp
    public Damage dmgS;
    public Damage dmgM;
    public Critical critical;
    public double range; //In ft
    public double weight; //In lbs
    public Type[] type;
    public Special[] special;

    public Weapon(String name, int id, int maxCapacity, double cost, Damage dmgS, Damage dmgM, Critical critical, double range, double weight, Type[] type, Special[] special) {
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
