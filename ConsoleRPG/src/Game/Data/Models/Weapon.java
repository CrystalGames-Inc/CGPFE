package Game.Data.Models;

public class Weapon {
    public String Name;
    public int Cost;
    public String DmgS;
    public String DmgM;
    public String Critical;
    public double Range;
    public double Weight;
    public String Type;
    public String Special;

    public Weapon(String name, int cost, String dmgS, String dmgM, String critical, double range, double weight, String type, String special) {
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
