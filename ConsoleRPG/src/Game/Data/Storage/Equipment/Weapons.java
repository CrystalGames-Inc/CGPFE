package Game.Data.Storage.Equipment;

import Game.Data.Models.ItemTypes.Weapon.Specials;
import Game.Data.Models.ItemTypes.Weapon.Types;
import Game.Data.Models.ItemTypes.Weapon.Weapon;

public class Weapons {

    //region Simple Weapons

    //region Unarmed Attacks

    public Weapon gauntlet = new Weapon("Gauntlet", 0, 1, 0, 2, "1d2", "1d3", "x2", 0.0, 1.0, new Types[]{Types.BLUDGEONING}, null);
    public Weapon unarmedStrike = new Weapon("Unramed Strike",0,1,0, 0, "1d2", "1d3", "x2", 0.0, 0.0, new Types[]{Types.BLUDGEONING}, new Specials[]{Specials.NONLETHAL});

    //endregion

    //region Light Melee Weapons

    public Weapon dagger = new Weapon("Dagger", 0, 1, 0, 2, "1d3", "1d4","19-20/x2",10.0, 1.0, new Types[]{Types.PIERCING, Types.SLASHING, Types.OR}, null);
    public Weapon punchingDagger = new Weapon("Punching Dagger", 0, 1, 0, 2, "1d3", "1d4","x3", 0.0, 1, new Types[]{Types.PIERCING}, null);
    public Weapon spikedGauntlet = new Weapon("Spiked Gauntlet", 0, 1, 0, 5, "1d3","1d4","x2", 0.0, 1.0, new Types[]{Types.PIERCING}, null);
    public Weapon lightMace = new Weapon("Light Mace", 0,1,0, 5, "1d4", "1d6","x2",0.0, 4, new Types[]{Types.BLUDGEONING}, null);
    public Weapon sickle = new Weapon("Sickle",0,1,0,6,"1d4","1d6","x2",0.0,2, new Types[]{Types.SLASHING}, new Specials[]{Specials.TRIP});

    //endregion

    //region One-Handed Melee Weapons

    public Weapon club = new Weapon("Club",0,1,0, 0,"1d4","1d6","x2",10,3, new Types[]{Types.BLUDGEONING}, null);
    public Weapon heavyMace = new Weapon("Heavy Mace",0,1,0,12,"1d6","1d8","x2",0.0,3, new Types[]{Types.BLUDGEONING}, null);
    public Weapon morningStar = new Weapon("Morningstar",0,1,0, 8, "1d6", "1d8", "x2",0.0,6,new Types[]{Types.BLUDGEONING, Types.PIERCING, Types.AND}, null);
    public Weapon shortspear = new Weapon("Shortspear",0,1,0, 1, "1d4", "1d6", "x2", 20, 3, new Types[]{Types.PIERCING}, null);

    //endregion

    //region Two-Handed Melee Weapons

    public Weapon longspear = new Weapon("Longspear",0,1,0, 5, "1d6", "1d8", "x3",0.0, 9, new Types[]{Types.PIERCING}, new Specials[]{Specials.BRACE, Specials.REACH});
    public Weapon quarterstaff = new Weapon("Quarterstaff",0,1,0,0, "1d4/1d4","1d6/1d6","x2", 0.0, 4, new Types[]{Types.BLUDGEONING}, new Specials[]{Specials.DOUBLE, Specials.MONK});
    public Weapon spear = new Weapon("Spear", 0,1,0,2, "1d6","1d8","x3",20.0,6,new Types[]{Types.PIERCING}, new Specials[]{Specials.BRACE});

    //endregion

    //region Ranged Weapons

    public Weapon blowgun = new Weapon("Blowgun",0,1,0, 2, "1","1d2","x2",20,1, new Types[]{Types.PIERCING}, null);
    public Weapon heavyCrossbow = new Weapon("Heavy Crossbow",0,1,0, 50, "1d8","1d10","19-20/x2",120,8, new Types[]{Types.PIERCING}, null);
    public Weapon lightCrossbow = new Weapon("Light Crossbow",0,1,0, 30, "1d6","1d8","19-20/x2",80, 4, new Types[]{Types.PIERCING}, null);
    public Weapon dart = new Weapon("Dart",0,1,0, 0.5, "1d3", "1d4", "x2", 20, 0.5, new Types[]{Types.PIERCING}, null);
    public Weapon javelin = new Weapon("Javelin", 0,1,0,1, "1d4","1d6","x2",30,2,new Types[]{Types.PIERCING}, null);
    public Weapon sling = new Weapon("Sling",0,1,0, 0, "1d3","1d4","x2",50, 0.0, new Types[]{Types.BLUDGEONING}, null);

    //endregion

    //endregion

    //region Martial Weapons

    

    //endregion
}
