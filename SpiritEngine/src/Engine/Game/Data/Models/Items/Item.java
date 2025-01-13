package Engine.Game.Data.Models.Items;

public class Item {
    public String name;
    public int id;
    public double cost; //In gp (For example, 2cp will be written as 0.02, and 5sp will be written as 0.5)

    public Item(String name, int id, double cost){
        this.name = name;
        this.id = id;
        this.cost = cost;
    }
}
