package Game.Data.Models.ItemTypes.Goods;

import Game.Data.Models.Item;

public class Good extends Item {
    public String name;
    public int itemId;
    public double cost;
    public double weight;

    public Good(String name, int itemId, double cost, double weight){
        this.name = name;
        this.itemId = itemId;
        this.cost = cost;
        this.weight = weight;
    }
}
