package Engine.Game.Data.Models.Items.GoodsServices;

import Engine.Game.Data.Models.Items.Item;

public class Good extends Item {

    public double weight;

    public Good(String name, int id, double cost, double weight){
        super(name, id, cost);
        this.name = name;
        this.id = id;
        this.cost = cost;
        this.weight = weight;
    }
}
