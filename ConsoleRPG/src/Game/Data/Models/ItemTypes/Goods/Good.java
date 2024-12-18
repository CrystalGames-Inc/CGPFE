package Game.Data.Models.ItemTypes.Goods;

import Game.Data.Models.Item;

public class Good extends Item {
    public String name;
    public int itemId;
    public int inventoryId;
    public int amount;
    public double cost;
    public double weight;

    public Good(String name, int itemId, int inventoryId, int amount, double cost, double weight){
        this.name = name;
        this.itemId = itemId;
        this.inventoryId = inventoryId;
        this.amount = amount;
        this.cost = cost;
        this.weight = weight;
    }
}
