package SpiritEngine.Game.Data.Models.Items.Equipment.Armor;

import SpiritEngine.Game.Data.Models.Items.Constants.Weight;

public class Armor {
    public String name;
    public Weight type;
    public int cost;
    public int armorBonus;
    public int maxDexBonus;
    public int armorCheckPenalty;
    public int arcCheckFailChance; //In %
    public int[] speeds; //Speed[0] is for 30ft, Speed[1] is for 20ft.
    public int weight;

    public Armor(String name, Weight type, int cost, int armorBonus, int maxDexBonus, int armorCheckPenalty, int arcCheckFailChance, int[] speeds, int weight){
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.armorBonus = armorBonus;
        this.maxDexBonus = maxDexBonus;
        this.armorCheckPenalty = armorCheckPenalty;
        this.arcCheckFailChance = arcCheckFailChance;
        this.speeds = speeds;
        this.weight = weight;
    }
}
