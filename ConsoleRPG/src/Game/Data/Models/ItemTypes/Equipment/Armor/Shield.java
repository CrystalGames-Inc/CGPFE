package Game.Data.Models.ItemTypes.Equipment.Armor;

public class Shield {
    public String Name;
    public int Cost;
    public int ShieldBonus;
    public int MaxDexBonus;
    public int ArmorCheckPenalty;
    public int ArcSpellFailChance;
    public int Weight;

    public Shield(String name, int cost, int shieldBonus, int maxDexBonus, int armorCheckPenalty, int arcSpellFailChance, int weight){
        Name = name;
        Cost = cost;
        ShieldBonus = shieldBonus;
        MaxDexBonus = maxDexBonus;
        ArmorCheckPenalty = armorCheckPenalty;
        ArcSpellFailChance = arcSpellFailChance;
        Weight = weight;
    }
}
