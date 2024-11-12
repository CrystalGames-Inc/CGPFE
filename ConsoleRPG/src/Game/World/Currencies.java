package Game.World;

import Game.World.Models.Currency;

public class Currencies {
    public final Currency copper = new Currency("Copper", 1, 0.1, 0.01, 0.001);
    public final Currency silver = new Currency("Silver", 10, 1, 0.1, 0.01);
    public final Currency gold = new Currency("Gold", 100, 10, 1, 0.1);
    public final Currency platinum = new Currency("Platinum", 1000, 100, 10, 1);
}
