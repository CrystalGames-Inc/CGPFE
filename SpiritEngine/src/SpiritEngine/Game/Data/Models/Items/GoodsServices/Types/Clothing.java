package SpiritEngine.Game.Data.Models.Items.GoodsServices.Types;

import SpiritEngine.Game.Data.Models.Items.Item;

public class Clothing extends Item {

    double weight;

    public Clothing(String name, int id, double cost, double weight) {
        super(name, id, cost);
        this.weight = weight;
    }
}
