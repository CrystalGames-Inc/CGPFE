package Game.Data.Models.ItemTypes.Equipment.Weapon.Ranged;

public class Ammunition {
    public String Name;
    public int Amount;
    public double Cost;
    public double Weight;

    public Ammunition(String name, int amount, double cost, double weight){
        Name = name;
        Amount = amount;
        Cost = cost;
        Weight = weight;
    }
}
