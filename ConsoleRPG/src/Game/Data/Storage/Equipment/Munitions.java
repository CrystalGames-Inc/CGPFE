package Game.Data.Storage.Equipment;

import Game.Data.Models.ItemTypes.Weapon.Ranged.Ammunition;

public class Munitions {
    public Ammunition blowgunDarts = new Ammunition("Blowgun Darts", 10,0.5, 0.0);
    public Ammunition crossbowBolts = new Ammunition("Crossbow Bolts", 10,1, 1);
    public Ammunition slingBullets = new Ammunition("Sling Bullets", 10,0.1, 5);
    public Ammunition arrows = new Ammunition("Arrows", 20, 1, 3);
    public Ammunition handCrossbowBolts = new Ammunition("Bolts",10,1,1);
    public Ammunition repeatingCrossbowBolts = new Ammunition("Bolts",5,1,1);

}
