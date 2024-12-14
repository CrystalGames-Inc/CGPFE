package Game.Data.Storage.Equipment;

import Game.Data.Models.ItemTypes.Weapon.Ammunition;
import Game.Data.Models.ItemTypes.Weapon.Weapon;

public class Munitions {
    Weapons weapons = new Weapons();

    public Ammunition blowgunDarts = new Ammunition("Blowgun Darts", 10,0.5, 0.0, new Weapon[]{weapons.blowgun});
    public Ammunition crossbowBolts = new Ammunition("Crossbow Bolts", 10,1, 1, new Weapon[]{weapons.lightCrossbow, weapons.heavyCrossbow});
    public Ammunition slingBullets = new Ammunition("Sling Bullets", 10,0.1, 5, new Weapon[]{weapons.sling});

}
