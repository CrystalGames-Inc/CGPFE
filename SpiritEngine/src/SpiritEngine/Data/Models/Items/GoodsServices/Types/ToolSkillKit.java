package SpiritEngine.Data.Models.Items.GoodsServices.Types;

import SpiritEngine.Data.Models.Items.Item;

public class ToolSkillKit extends Item {

    public double weight;

    public ToolSkillKit(String name, int id, double cost, double weight) {
        super(name, id, cost);
        this.weight = weight;
    }
}
