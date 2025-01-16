package SpiritEngine.Game.Data.Models.Items.Equipment.Armor;

public class Shield {
    public String name;
    public int cost;
    public int shieldBonus;
    public int maxDexBonus;
    public int armorCheckPenalty;
    public int spellFailChance;
    public int weight;

    public Shield(String name, int cost, int shieldBonus, int maxDexBonus, int armorCheckPenalty, int spellFailChance, int weight){
        this.name = name;
        this.cost = cost;
        this.shieldBonus = shieldBonus;
        this.maxDexBonus = maxDexBonus;
        this.armorCheckPenalty = armorCheckPenalty;
        this.spellFailChance = spellFailChance;
        this.weight = weight;
    }
}
