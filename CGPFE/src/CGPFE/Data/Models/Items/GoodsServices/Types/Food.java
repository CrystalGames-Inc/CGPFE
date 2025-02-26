package CGPFE.Data.Models.Items.GoodsServices.Types;

import CGPFE.Data.Models.Items.Item;

public class Food extends Item {

    public double weight;

    public Food(String name, int id, double cost, double weight) {
        super(name, id, cost);
        this.weight = weight;
    }
}
