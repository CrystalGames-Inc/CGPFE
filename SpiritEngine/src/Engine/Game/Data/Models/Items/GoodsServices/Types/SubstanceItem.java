package Engine.Game.Data.Models.Items.GoodsServices.Types;

import Engine.Game.Data.Models.Items.Item;

public class SubstanceItem extends Item {

    public double weight;

    public SubstanceItem(String name, int id, double cost, double weight) {
        super(name, id, cost);
        this.weight = weight;
    }
}
