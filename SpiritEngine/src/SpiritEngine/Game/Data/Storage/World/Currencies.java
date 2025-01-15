package SpiritEngine.Game.Data.Storage.World;

import SpiritEngine.Game.Data.Models.Items.Currency;

public class Currencies {
    public final Currency COPPER = new Currency("Copper", 1, 0.1, 0.01, 0.001);
    public final Currency SILVER = new Currency("Silver", 10, 1, 0.1, 0.01);
    public final Currency GOLD = new Currency("Gold", 100, 10, 1, 0.1);
    public final Currency PLATINUM = new Currency("Platinum", 1000, 100, 10, 1);
}
