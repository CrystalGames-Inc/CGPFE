package Game.Data.Storage;

import Game.Data.Models.ItemTypes.Weapon.Types;
import Game.Data.Models.ItemTypes.Weapon.Weapon;

public class Weapons {
    public Weapon gauntlet = new Weapon("Gauntlet", 0, 1, 0, 2, "1d2", "1d3", "x2", 0.0, 1.0, new Types[]{Types.BLUDGEONING}, null);
    public Weapon dagger = new Weapon("Dagger", 0, 1, 0, 2, "1d3", "1d4","19-20/x2",10.0, 1.0, new Types[]{Types.PIERCING, Types.SLASHING, Types.OR}, null);
    public Weapon punchingDagger = new Weapon("Punching Dagger", 0, 1, 0, 2, "1d3", "1d4","x3", 0.0, 1, new Types[]{Types.PIERCING}, null);
}
