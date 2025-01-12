package Engine.Game.Data.Models.Items.Equipment.Armor;

public class Armor {
    public String Name;
    public int Cost;
    public int ArmorBonus;
    public int MaxDexBonus;
    public int ArmorCheckPenalty;
    public int ArcCheckFailChance; //In %
    public int[] Speeds; //Speed[0] is for 30ft, Speed[1] is for 20ft.
    public int Weight;

    public Armor(String name, int cost, int armorBonus, int maxDexBonus, int armorCheckPenalty, int arcCheckFailChance, int[] speeds, int weight){
        Name = name;
        Cost = cost;
        ArmorBonus = armorBonus;
        MaxDexBonus = maxDexBonus;
        ArmorCheckPenalty = armorCheckPenalty;
        ArcCheckFailChance = arcCheckFailChance;
        Speeds = speeds;
        Weight = weight;
    }
}
