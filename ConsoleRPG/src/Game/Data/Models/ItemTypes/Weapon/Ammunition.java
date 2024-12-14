package Game.Data.Models.ItemTypes.Weapon;

public class Ammunition {
    public String Name;
    public int Amount;
    public double Cost;
    public double Weight;
    public Weapon[] Weapon;

    public Ammunition(String name, int amount, double cost, double weight, Weapon[] weapon){
        Name = name;
        Amount = amount;
        Cost = cost;
        Weight = weight;
        Weapon = weapon;
    }
}
