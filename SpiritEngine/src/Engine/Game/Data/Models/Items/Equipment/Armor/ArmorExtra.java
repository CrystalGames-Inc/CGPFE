package Engine.Game.Data.Models.Items.Equipment.Armor;

public class ArmorExtra {
    public String Name;
    public int Cost;
    public int ArmorCheckPenalty;
    public int ArcSpellFailChance;
    public int WeightMod;

    public ArmorExtra(String name, int cost, int armorCheckPenalty, int arcSpellFailChance, int weightMod){
        Name = name;
        Cost = cost;
        ArmorCheckPenalty = armorCheckPenalty;
        ArcSpellFailChance = arcSpellFailChance;
        WeightMod = weightMod;
    }
}
