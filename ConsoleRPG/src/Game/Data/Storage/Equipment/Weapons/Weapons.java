package Game.Data.Storage.Equipment.Weapons;

import Game.Data.Models.Items.Equipment.Weapon.Ranged.RangedWeapon;
import Game.Data.Models.Items.Equipment.Weapon.Base.Special;
import Game.Data.Models.Items.Equipment.Weapon.Base.Type;
import Game.Data.Models.Items.Equipment.Weapon.Weapon;

public class Weapons {
    Munitions munitions = new Munitions();

    //region Simple Weapons

    //region Unarmed Attacks

    public Weapon gauntlet = new Weapon("Gauntlet", 1, 2, "1d2", "1d3", "x2", 0.0, 1.0, new Type[]{Type.BLUDGEONING}, null);
    public Weapon unarmedStrike = new Weapon("Unarmed Strike",1,0, "1d2", "1d3", "x2", 0.0, 0.0, new Type[]{Type.BLUDGEONING}, new Special[]{Special.NONLETHAL});

    //endregion

    //region Light Melee Weapons

    public Weapon dagger = new Weapon("Dagger",  1,  2, "1d3", "1d4","19-20/x2",10.0, 1.0, new Type[]{Type.PIERCING, Type.SLASHING, Type.OR}, null);
    public Weapon punchingDagger = new Weapon("Punching Dagger",  1,  2, "1d3", "1d4","x3", 0.0, 1, new Type[]{Type.PIERCING}, null);
    public Weapon spikedGauntlet = new Weapon("Spiked Gauntlet",  1,  5, "1d3","1d4","x2", 0.0, 1.0, new Type[]{Type.PIERCING}, null);
    public Weapon lightMace = new Weapon("Light Mace", 1,5, "1d4", "1d6","x2",0.0, 4, new Type[]{Type.BLUDGEONING}, null);
    public Weapon sickle = new Weapon("Sickle",1,6,"1d4","1d6","x2",0.0,2, new Type[]{Type.SLASHING}, new Special[]{Special.TRIP});

    //endregion

    //region One-Handed Melee Weapons

    public Weapon club = new Weapon("Club",1,0, "1d4","1d6","x2",10,3, new Type[]{Type.BLUDGEONING}, null);
    public Weapon heavyMace = new Weapon("Heavy Mace",1,12,"1d6","1d8","x2",0.0,3, new Type[]{Type.BLUDGEONING}, null);
    public Weapon morningstar = new Weapon("Morningstar",1, 8, "1d6", "1d8", "x2",0.0,6,new Type[]{Type.BLUDGEONING, Type.PIERCING, Type.AND}, null);
    public Weapon shortspear = new Weapon("Shortspear",1, 1, "1d4", "1d6", "x2", 20, 3, new Type[]{Type.PIERCING}, null);

    //endregion

    //region Two-handed Melee Weapons

    public Weapon longspear = new Weapon("Longspear",1, 5, "1d6", "1d8", "x3",0.0, 9, new Type[]{Type.PIERCING}, new Special[]{Special.BRACE, Special.REACH});
    public Weapon quarterstaff = new Weapon("Quarterstaff",1,0, "1d4/1d4","1d6/1d6","x2", 0.0, 4, new Type[]{Type.BLUDGEONING}, new Special[]{Special.DOUBLE, Special.MONK});
    public Weapon spear = new Weapon("Spear", 1,2, "1d6","1d8","x3",20.0,6,new Type[]{Type.PIERCING}, new Special[]{Special.BRACE});

    //endregion

    //region Ranged Weapons

    public RangedWeapon blowgun = new RangedWeapon("Blowgun",1, 2, "1","1d2","x2",20,1, new Type[]{Type.PIERCING}, null, munitions.blowgunDarts);
    public RangedWeapon heavyCrossbow = new RangedWeapon("Heavy Crossbow",1, 50, "1d8","1d10","19-20/x2",120,8, new Type[]{Type.PIERCING}, null, munitions.crossbowBolts);
    public RangedWeapon lightCrossbow = new RangedWeapon("Light Crossbow",1, 30, "1d6","1d8","19-20/x2",80, 4, new Type[]{Type.PIERCING}, null, munitions.crossbowBolts);
    public RangedWeapon dart = new RangedWeapon("Dart",1, 0.5, "1d3", "1d4", "x2", 20, 0.5, new Type[]{Type.PIERCING}, null, null);
    public RangedWeapon javelin = new RangedWeapon("Javelin", 1,1, "1d4","1d6","x2",30,2,new Type[]{Type.PIERCING}, null, null);
    public RangedWeapon sling = new RangedWeapon("Sling",1, 0, "1d3","1d4","x2",50, 0.0, new Type[]{Type.BLUDGEONING}, null, munitions.slingBullets);

    //endregion

    //endregion

    //region Martial Weapons

    //region Light Melee Weapons

    public Weapon throwingAxe = new Weapon("Throwing axe",1,8, "1d4","1d6", "x2", 10, 2, new Type[]{Type.SLASHING}, null);
    public Weapon lightHammer = new Weapon("Light Hammer",1,1, "1d3","1d4", "x2", 20, 2, new Type[]{Type.BLUDGEONING}, null);
    public Weapon handaxe = new Weapon("Handaxe",1,6,"1d4","1d6","x3",0.0,3, new Type[]{Type.SLASHING}, null);
    public Weapon kukri = new Weapon("Kukri",1,8,"1d3","1d4","18-20/x2",0.0,2,new Type[]{Type.SLASHING}, null);
    public Weapon lightPick = new Weapon("Light Pick", 1,4,"1d3","1d4","x4",0.0, 3, new Type[]{Type.PIERCING}, null);
    public Weapon sap = new Weapon("Sap",1,1,"1d4","1d6","x2",0.0,2,new Type[]{Type.BLUDGEONING}, new Special[]{Special.NONLETHAL});
    public Weapon starknife = new Weapon("Starknife",1,24,"1d3","1d4","x3",20,3,new Type[]{Type.PIERCING}, null);
    public Weapon shortSword = new Weapon("Short Sword",1, 10, "1d4","1d6","19-20/x2",0.0,2,new Type[]{Type.PIERCING}, null);

    //endregion

    //region One-Handed Melee Weapons

    public Weapon battleaxe = new Weapon("Battleaxe",1, 10, "1d6","1d8","x3",0.0, 6, new Type[]{Type.SLASHING}, null);
    public Weapon flail = new Weapon("Flail",1,8,"1d6","1d8","x2",0.0,5, new Type[]{Type.BLUDGEONING}, new Special[]{Special.DISARM, Special.TRIP});
    public Weapon longsword = new Weapon("Longsword",1,15,"1d6","1d8","19-20/x2",0.0,4,new Type[]{Type.SLASHING}, null);
    public Weapon heavyPick = new Weapon("Heavy Pick",1,8,"1d4","1d6","x4",0.0,6, new Type[]{Type.PIERCING}, null);
    public Weapon rapier = new Weapon("Rapier",1,20,"1d4","1d6","18-20/x2", 0.0, 2, new Type[]{Type.PIERCING}, null);
    public Weapon scimitar = new Weapon("Scimitar",1, 15, "1d4","1d6","18-20/x2",0.0,4,new Type[]{Type.SLASHING}, null);
    public Weapon trident = new Weapon("Trident",1, 15, "1d6","1d8","x2",10, 4, new Type[]{Type.PIERCING}, new Special[]{Special.BRACE});
    public Weapon warhammer = new Weapon("Warhammer",1,12, "1d6","1d8","x3",0.0,5, new Type[]{Type.BLUDGEONING}, null);

    //endregion

    //region Two-Handed Melee Weapons

    public Weapon falchion = new Weapon("Falchion",1,75,"1d6","2d4","18-20/xs",0.0,8,new Type[]{Type.SLASHING}, null);
    public Weapon glaive = new Weapon("Glaive",1, 8,"1d8","1d10","x3",0.0,10,new Type[]{Type.SLASHING},new Special[]{Special.REACH});
    public Weapon greataxe = new Weapon("Greataxe",1,20,"1d10","1d12","x3",0.0,12, new Type[]{Type.SLASHING}, null);
    public Weapon greatclub = new Weapon("Greatclub",1,5,"1d8","1d10","x2",0.0,8, new Type[]{Type.BLUDGEONING}, null);
    public Weapon heavyFlail = new Weapon("heavyFlail",1,15,"1d8","1d10","19-20/x2",0.0,10, new Type[]{Type.BLUDGEONING}, new Special[]{Special.DISARM, Special.TRIP});
    public Weapon greatsword = new Weapon("Greatsword",1, 50, "1d10","2d6","19-20/x2",0.0,8, new Type[]{Type.SLASHING}, null);
    public Weapon guisarme = new Weapon("Guisarme",1,9,"1d6","2d4","x3",0.0, 12, new Type[]{Type.SLASHING}, new Special[]{Special.REACH, Special.TRIP});
    public Weapon halbred = new Weapon("Halbred",1,10,"1d8","1d10","x3",0.0,12, new Type[]{Type.PIERCING, Type.SLASHING, Type.OR}, new Special[]{Special.BRACE, Special.TRIP});
    public Weapon lance = new Weapon("Lance",1,10,"1d6","1d8","x3",0.0,10,new Type[]{Type.PIERCING}, new Special[]{Special.REACH});
    public Weapon ranseur = new Weapon("Ranseur",1,10,"1d6","2d4","x3",0.0,12,new Type[]{Type.PIERCING}, new Special[]{Special.DISARM, Special.REACH});
    public Weapon scythe = new Weapon("Scythe",1,18,"1d6","2d4","x4",0.0,10, new Type[]{Type.PIERCING, Type.SLASHING, Type.OR}, new Special[]{Special.TRIP});


    //endregion

    //region Ranged Weapons

    public RangedWeapon longbow = new RangedWeapon("Longbow",1,75,"1d6","1d8","x3",100,3,new Type[]{Type.PIERCING}, null, munitions.arrows);
    public RangedWeapon compositeLongbow = new RangedWeapon("Composite Longbow",1, 100, "1d6","1d8","x3",110,3,new Type[]{Type.PIERCING}, null, munitions.arrows);
    public RangedWeapon shortbow = new RangedWeapon("Shortbow",1,30,"1d4","1d6","x3",60,2,new Type[]{Type.PIERCING}, null, munitions.arrows);
    public RangedWeapon compositeShortbow = new RangedWeapon("Composite Shortbow",1,75,"1d4","1d6","x3",70,2,new Type[]{Type.PIERCING}, null, munitions.arrows);

    //endregion

    //endregion

    //region Exotic Weapons

    //region Light Melee Weapons

    public Weapon kama = new Weapon("Kama",1,2,"1d4","1d6","x2",0.0,2,new Type[]{Type.SLASHING}, new Special[]{Special.MONK, Special.TRIP});
    public Weapon nunchaku = new Weapon("Nunchaku",1,2,"1d4","1d6","x2",0.0,2,new Type[]{Type.BLUDGEONING}, new Special[]{Special.DISARM, Special.MONK});
    public Weapon sai = new Weapon("Sai",1,1,"1d3","1d4","x2",0.0,1,new Type[]{Type.BLUDGEONING}, new Special[]{Special.DISARM, Special.MONK});
    public Weapon siangham = new Weapon("Siangham",1,3,"1d4","1d6","x2",0.0,1,new Type[]{Type.PIERCING}, new Special[]{Special.MONK});

    //endregion

    //region One-Handed Melee Weapons

    public Weapon bastardSword = new Weapon("Bastard sword",1,35,"1d8","1d10","19-20/x2",0.0, 6, new Type[]{Type.SLASHING}, null);
    public Weapon dwarvenWaraxe = new Weapon("Dwarven waraxe",1,30,"1d8","1d10","x3",0.0,8,new Type[]{Type.SLASHING}, null);
    public Weapon whip = new Weapon("Whip",1,1,"1d2","1d3","x2",0.0,2,new Type[]{Type.SLASHING}, new Special[]{Special.DISARM, Special.NONLETHAL, Special.REACH, Special.TRIP});

    //endregion

    //region Two-Handed Melee Weapons

    public Weapon orcDoubleAxe = new Weapon("Orc Double Axe",1,60,"1d6/1d6","1d8/1d8","x3",0.0,15,new Type[]{Type.SLASHING}, new Special[]{Special.DOUBLE});
    public Weapon spikedChain = new Weapon("Spiked Chain",1, 25,"1d6","2d4","x2",0.0,10, new Type[]{Type.PIERCING}, new Special[]{Special.DISARM, Special.TRIP});
    public Weapon elvenCurveBlade = new Weapon("Elven Curve Blade",1,80,"1d8","1d10","18-20/x2",0.0,7,new Type[]{Type.SLASHING}, null);
    public Weapon direFlail = new Weapon("Dire Flail",1,90, "1d6/1d6","1d8/1d8","x2", 0.0, 10, new Type[]{Type.BLUDGEONING}, new Special[]{Special.DISARM, Special.DOUBLE, Special.TRIP});
    public Weapon gnomeHookedHammer = new Weapon("Gnome-Hooked Hammer",1,20, "1d6/1d4","1d8/1d6","x3/x4",0.0,6, new Type[]{Type.BLUDGEONING, Type.PIERCING, Type.OR}, new Special[]{Special.DOUBLE, Special.TRIP});
    public Weapon twoBladedSword = new Weapon("Two-Bladed Sword",1,100,"1d6/1d6","1d8/1d8","19-20/x2",0.0,10,new Type[]{Type.SLASHING}, new Special[]{Special.DOUBLE});
    public Weapon dwarvenEngrosh = new Weapon("Dwarven Engrosh",1,50,"1d6/1d4","1d8/1d6","x3",0.0, 12, new Type[]{Type.PIERCING, Type.SLASHING, Type.OR}, new Special[]{Special.BRACE, Special.DOUBLE});


    //endregion

    //region Ranged Weapons

    public Weapon bolas = new Weapon("Bolas",1,5,"1d3","1d4","x2",10, 2, new Type[]{Type.BLUDGEONING}, new Special[]{Special.NONLETHAL, Special.TRIP});
    public RangedWeapon handCrossbow = new RangedWeapon("Hand Crossbow",1,100,"1d3","1d4","19-20/x2",30,2, new Type[]{Type.PIERCING}, null, munitions.handCrossbowBolts);
    public RangedWeapon repeatingHeavyCrossbow = new RangedWeapon("Repeating Heavy Crossbow",1,400,"1d8","1d10","19-20/x2",120,12,new Type[]{Type.PIERCING}, null, munitions.repeatingCrossbowBolts);
    public RangedWeapon repeatingLightCrossbow = new RangedWeapon("Repeating Light Crossbow",1,250,"1d6","1d8","19-20/x2",80,6,new Type[]{Type.PIERCING}, null, munitions.repeatingCrossbowBolts);
    public Weapon net = new Weapon("Net",1,20,null,null,null, 10, 6, null, null);
    public Weapon shuriken = new Weapon("Shuriken",1,1,"1","1d2","x2",10,0.5, new Type[]{Type.PIERCING}, new Special[]{Special.MONK});
    public RangedWeapon halflingSlingStaff = new RangedWeapon("Halfling Sling Staff",1,20,"1d6","1d8","x3",80,3,new Type[]{Type.BLUDGEONING}, null, munitions.slingBullets);

    //endregion

    //endregion
}