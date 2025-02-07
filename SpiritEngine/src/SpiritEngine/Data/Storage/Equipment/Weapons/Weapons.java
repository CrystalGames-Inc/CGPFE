package SpiritEngine.Data.Storage.Equipment.Weapons;

import SpiritEngine.Data.Models.Items.Equipment.Weapon.Ranged.RangedWeapon;
import SpiritEngine.Data.Models.Items.Equipment.Weapon.Base.Special;
import SpiritEngine.Data.Models.Items.Equipment.Weapon.Base.Type;
import SpiritEngine.Data.Models.Items.Equipment.Weapon.Weapon;

public final class Weapons {

    private static Weapons _instance;

    public static synchronized Weapons getInstance(){
        if (_instance == null) {
            _instance = new Weapons();
        }
        return _instance;
    }

    private Weapons(){

    }

    Munitions munitions = Munitions.getInstance();

    //region Simple Weapons

    //region Unarmed Attacks

    public final Weapon gauntlet = new Weapon("Gauntlet", 0,1, 2, "1d2", "1d3", "x2", 0.0, 1.0, new Type[]{Type.BLUDGEONING}, null);
    public final Weapon unarmedStrike = new Weapon("Unarmed Strike",1,1,0, "1d2", "1d3", "x2", 0.0, 0.0, new Type[]{Type.BLUDGEONING}, new Special[]{Special.NONLETHAL});

    //endregion

    //region Light Melee Weapons

    public final Weapon dagger = new Weapon("Dagger",2,1,  2, "1d3", "1d4","19-20/x2",10.0, 1.0, new Type[]{Type.PIERCING, Type.SLASHING, Type.OR}, null);
    public final Weapon punchingDagger = new Weapon("Punching Dagger",3,1,  2, "1d3", "1d4","x3", 0.0, 1, new Type[]{Type.PIERCING}, null);
    public final Weapon spikedGauntlet = new Weapon("Spiked Gauntlet",4,1,  5, "1d3","1d4","x2", 0.0, 1.0, new Type[]{Type.PIERCING}, null);
    public final Weapon lightMace = new Weapon("Light Mace",5,1,5, "1d4", "1d6","x2",0.0, 4, new Type[]{Type.BLUDGEONING}, null);
    public final Weapon sickle = new Weapon("Sickle",6,1,6,"1d4","1d6","x2",0.0,2, new Type[]{Type.SLASHING}, new Special[]{Special.TRIP});

    //endregion

    //region One-Handed Melee Weapons

    public final Weapon club = new Weapon("Club",7,1,0, "1d4","1d6","x2",10,3, new Type[]{Type.BLUDGEONING}, null);
    public final Weapon heavyMace = new Weapon("Heavy Mace",8,1,12,"1d6","1d8","x2",0.0,3, new Type[]{Type.BLUDGEONING}, null);
    public final Weapon morningstar = new Weapon("Morningstar",9,1, 8, "1d6", "1d8", "x2",0.0,6,new Type[]{Type.BLUDGEONING, Type.PIERCING, Type.AND}, null);
    public final Weapon shortspear = new Weapon("Shortspear",10,1, 1, "1d4", "1d6", "x2", 20, 3, new Type[]{Type.PIERCING}, null);

    //endregion

    //region Two-handed Melee Weapons

    public final Weapon longspear = new Weapon("Longspear",11,1, 5, "1d6", "1d8", "x3",0.0, 9, new Type[]{Type.PIERCING}, new Special[]{Special.BRACE, Special.REACH});
    public final Weapon quarterstaff = new Weapon("Quarterstaff",12,1,0, "1d4/1d4","1d6/1d6","x2", 0.0, 4, new Type[]{Type.BLUDGEONING}, new Special[]{Special.DOUBLE, Special.MONK});
    public final Weapon spear = new Weapon("Spear", 13,1,2, "1d6","1d8","x3",20.0,6,new Type[]{Type.PIERCING}, new Special[]{Special.BRACE});

    //endregion

    //region Ranged Weapons

    public final RangedWeapon blowgun = new RangedWeapon("Blowgun",14,1, 2, "1","1d2","x2",20,1, new Type[]{Type.PIERCING}, null, munitions.blowgunDarts);
    public final RangedWeapon heavyCrossbow = new RangedWeapon("Heavy Crossbow",15,1, 50, "1d8","1d10","19-20/x2",120,8, new Type[]{Type.PIERCING}, null, munitions.crossbowBolts);
    public final RangedWeapon lightCrossbow = new RangedWeapon("Light Crossbow",16,1, 30, "1d6","1d8","19-20/x2",80, 4, new Type[]{Type.PIERCING}, null, munitions.crossbowBolts);
    public final RangedWeapon dart = new RangedWeapon("Dart",17,1, 0.5, "1d3", "1d4", "x2", 20, 0.5, new Type[]{Type.PIERCING}, null, null);
    public final RangedWeapon javelin = new RangedWeapon("Javelin",18,1,1, "1d4","1d6","x2",30,2,new Type[]{Type.PIERCING}, null, null);
    public final RangedWeapon sling = new RangedWeapon("Sling",19,1,0, "1d3","1d4","x2",50, 0.0, new Type[]{Type.BLUDGEONING}, null, munitions.slingBullets);

    //endregion

    public final Weapon[] simpleWeapons = new Weapon[]{
            gauntlet,
            unarmedStrike,
            dagger,
            punchingDagger,
            spikedGauntlet,
            lightMace,
            sickle,
            club,
            heavyMace,
            morningstar,
            shortspear,
            longspear,
            quarterstaff,
            spear,
            blowgun,
            heavyCrossbow,
            lightCrossbow,
            dart,
            javelin,
            sling
    };

    //endregion

    //region Martial Weapons

    //region Light Melee Weapons

    public final Weapon throwingAxe = new Weapon("Throwing axe",20,1,8, "1d4","1d6", "x2", 10, 2, new Type[]{Type.SLASHING}, null);
    public final Weapon lightHammer = new Weapon("Light Hammer",21,1,1, "1d3","1d4", "x2", 20, 2, new Type[]{Type.BLUDGEONING}, null);
    public final Weapon handaxe = new Weapon("Handaxe",22,1,6,"1d4","1d6","x3",0.0,3, new Type[]{Type.SLASHING}, null);
    public final Weapon kukri = new Weapon("Kukri",23,1,8,"1d3","1d4","18-20/x2",0.0,2,new Type[]{Type.SLASHING}, null);
    public final Weapon lightPick = new Weapon("Light Pick",24,1,4,"1d3","1d4","x4",0.0, 3, new Type[]{Type.PIERCING}, null);
    public final Weapon sap = new Weapon("Sap",25,1,1,"1d4","1d6","x2",0.0,2,new Type[]{Type.BLUDGEONING}, new Special[]{Special.NONLETHAL});
    public final Weapon starknife = new Weapon("Starknife",26,1,24,"1d3","1d4","x3",20,3,new Type[]{Type.PIERCING}, null);
    public final Weapon shortSword = new Weapon("Short Sword",27,1, 10, "1d4","1d6","19-20/x2",0.0,2,new Type[]{Type.PIERCING}, null);

    //endregion

    //region One-Handed Melee Weapons

    public final Weapon battleaxe = new Weapon("Battleaxe",28,1, 10, "1d6","1d8","x3",0.0, 6, new Type[]{Type.SLASHING}, null);
    public final Weapon flail = new Weapon("Flail",29,1,8,"1d6","1d8","x2",0.0,5, new Type[]{Type.BLUDGEONING}, new Special[]{Special.DISARM, Special.TRIP});
    public final Weapon longsword = new Weapon("Longsword",30,1,15,"1d6","1d8","19-20/x2",0.0,4,new Type[]{Type.SLASHING}, null);
    public final Weapon heavyPick = new Weapon("Heavy Pick",31,1,8,"1d4","1d6","x4",0.0,6, new Type[]{Type.PIERCING}, null);
    public final Weapon rapier = new Weapon("Rapier",32,1,20,"1d4","1d6","18-20/x2", 0.0, 2, new Type[]{Type.PIERCING}, null);
    public final Weapon scimitar = new Weapon("Scimitar",33,1, 15, "1d4","1d6","18-20/x2",0.0,4,new Type[]{Type.SLASHING}, null);
    public final Weapon trident = new Weapon("Trident",34,1, 15, "1d6","1d8","x2",10, 4, new Type[]{Type.PIERCING}, new Special[]{Special.BRACE});
    public final Weapon warhammer = new Weapon("Warhammer",35,1,12, "1d6","1d8","x3",0.0,5, new Type[]{Type.BLUDGEONING}, null);

    //endregion

    //region Two-Handed Melee Weapons

    public final Weapon falchion = new Weapon("Falchion",36,1,75,"1d6","2d4","18-20/xs",0.0,8,new Type[]{Type.SLASHING}, null);
    public final Weapon glaive = new Weapon("Glaive",37,1,8,"1d8","1d10","x3",0.0,10,new Type[]{Type.SLASHING},new Special[]{Special.REACH});
    public final Weapon greataxe = new Weapon("Greataxe",38,1,20,"1d10","1d12","x3",0.0,12, new Type[]{Type.SLASHING}, null);
    public final Weapon greatclub = new Weapon("Greatclub",39,1,5,"1d8","1d10","x2",0.0,8, new Type[]{Type.BLUDGEONING}, null);
    public final Weapon heavyFlail = new Weapon("heavyFlail",40,1,15,"1d8","1d10","19-20/x2",0.0,10, new Type[]{Type.BLUDGEONING}, new Special[]{Special.DISARM, Special.TRIP});
    public final Weapon greatsword = new Weapon("Greatsword",41,1,50, "1d10","2d6","19-20/x2",0.0,8, new Type[]{Type.SLASHING}, null);
    public final Weapon guisarme = new Weapon("Guisarme",42,1,9,"1d6","2d4","x3",0.0, 12, new Type[]{Type.SLASHING}, new Special[]{Special.REACH, Special.TRIP});
    public final Weapon halbred = new Weapon("Halbred",43,1,10,"1d8","1d10","x3",0.0,12, new Type[]{Type.PIERCING, Type.SLASHING, Type.OR}, new Special[]{Special.BRACE, Special.TRIP});
    public final Weapon lance = new Weapon("Lance",44,1,10,"1d6","1d8","x3",0.0,10,new Type[]{Type.PIERCING}, new Special[]{Special.REACH});
    public final Weapon ranseur = new Weapon("Ranseur",45,1,10,"1d6","2d4","x3",0.0,12,new Type[]{Type.PIERCING}, new Special[]{Special.DISARM, Special.REACH});
    public final Weapon scythe = new Weapon("Scythe",46,1,18,"1d6","2d4","x4",0.0,10, new Type[]{Type.PIERCING, Type.SLASHING, Type.OR}, new Special[]{Special.TRIP});


    //endregion

    //region Ranged Weapons

    public final RangedWeapon longbow = new RangedWeapon("Longbow",47,1,75,"1d6","1d8","x3",100,3,new Type[]{Type.PIERCING}, null, munitions.arrows);
    public final RangedWeapon compositeLongbow = new RangedWeapon("Composite Longbow",48,1, 100, "1d6","1d8","x3",110,3,new Type[]{Type.PIERCING}, null, munitions.arrows);
    public final RangedWeapon shortbow = new RangedWeapon("Shortbow",49,1,30,"1d4","1d6","x3",60,2,new Type[]{Type.PIERCING}, null, munitions.arrows);
    public final RangedWeapon compositeShortbow = new RangedWeapon("Composite Shortbow",50,1,75,"1d4","1d6","x3",70,2,new Type[]{Type.PIERCING}, null, munitions.arrows);

    //endregion

    public final Weapon[] martialWeapons = new Weapon[]{
            throwingAxe,
            lightHammer,
            handaxe,
            kukri,
            lightPick,
            sap,
            starknife,
            shortSword,
            battleaxe,
            flail,
            longsword,
            heavyPick,
            rapier,
            scimitar,
            trident,
            warhammer,
            falchion,
            glaive,
            greataxe,
            greatclub,
            heavyFlail,
            greatsword,
            guisarme,
            halbred,
            lance,
            ranseur,
            scythe,
            longbow,
            compositeLongbow,
            shortbow,
            compositeShortbow
    };

    //endregion

    //region Exotic Weapons

    //region Light Melee Weapons

    public final Weapon kama = new Weapon("Kama",51,1,2,"1d4","1d6","x2",0.0,2,new Type[]{Type.SLASHING}, new Special[]{Special.MONK, Special.TRIP});
    public final Weapon nunchaku = new Weapon("Nunchaku",52,1,2,"1d4","1d6","x2",0.0,2,new Type[]{Type.BLUDGEONING}, new Special[]{Special.DISARM, Special.MONK});
    public final Weapon sai = new Weapon("Sai",53,1,1,"1d3","1d4","x2",0.0,1,new Type[]{Type.BLUDGEONING}, new Special[]{Special.DISARM, Special.MONK});
    public final Weapon siangham = new Weapon("Siangham",54,1,3,"1d4","1d6","x2",0.0,1,new Type[]{Type.PIERCING}, new Special[]{Special.MONK});

    //endregion

    //region One-Handed Melee Weapons

    public final Weapon bastardSword = new Weapon("Bastard sword",55,1,35,"1d8","1d10","19-20/x2",0.0, 6, new Type[]{Type.SLASHING}, null);
    public final Weapon dwarvenWaraxe = new Weapon("Dwarven waraxe",56,1,30,"1d8","1d10","x3",0.0,8,new Type[]{Type.SLASHING}, null);
    public final Weapon whip = new Weapon("Whip",57,1,1,"1d2","1d3","x2",0.0,2,new Type[]{Type.SLASHING}, new Special[]{Special.DISARM, Special.NONLETHAL, Special.REACH, Special.TRIP});

    //endregion

    //region Two-Handed Melee Weapons

    public final Weapon orcDoubleAxe = new Weapon("Orc Double Axe",58,1,60,"1d6/1d6","1d8/1d8","x3",0.0,15,new Type[]{Type.SLASHING}, new Special[]{Special.DOUBLE});
    public final Weapon spikedChain = new Weapon("Spiked Chain",59,1, 25,"1d6","2d4","x2",0.0,10, new Type[]{Type.PIERCING}, new Special[]{Special.DISARM, Special.TRIP});
    public final Weapon elvenCurveBlade = new Weapon("Elven Curve Blade",60,1,80,"1d8","1d10","18-20/x2",0.0,7,new Type[]{Type.SLASHING}, null);
    public final Weapon direFlail = new Weapon("Dire Flail",61,1,90, "1d6/1d6","1d8/1d8","x2", 0.0, 10, new Type[]{Type.BLUDGEONING}, new Special[]{Special.DISARM, Special.DOUBLE, Special.TRIP});
    public final Weapon gnomeHookedHammer = new Weapon("Gnome-Hooked Hammer",62,1,20, "1d6/1d4","1d8/1d6","x3/x4",0.0,6, new Type[]{Type.BLUDGEONING, Type.PIERCING, Type.OR}, new Special[]{Special.DOUBLE, Special.TRIP});
    public final Weapon twoBladedSword = new Weapon("Two-Bladed Sword",63,1,100,"1d6/1d6","1d8/1d8","19-20/x2",0.0,10,new Type[]{Type.SLASHING}, new Special[]{Special.DOUBLE});
    public final Weapon dwarvenEngrosh = new Weapon("Dwarven Engrosh",64,1,50,"1d6/1d4","1d8/1d6","x3",0.0, 12, new Type[]{Type.PIERCING, Type.SLASHING, Type.OR}, new Special[]{Special.BRACE, Special.DOUBLE});


    //endregion

    //region Ranged Weapons

    public final Weapon bolas = new Weapon("Bolas",65,1,5,"1d3","1d4","x2",10, 2, new Type[]{Type.BLUDGEONING}, new Special[]{Special.NONLETHAL, Special.TRIP});
    public final RangedWeapon handCrossbow = new RangedWeapon("Hand Crossbow",66,1,100,"1d3","1d4","19-20/x2",30,2, new Type[]{Type.PIERCING}, null, munitions.handCrossbowBolts);
    public final RangedWeapon repeatingHeavyCrossbow = new RangedWeapon("Repeating Heavy Crossbow",67,1,400,"1d8","1d10","19-20/x2",120,12,new Type[]{Type.PIERCING}, null, munitions.repeatingCrossbowBolts);
    public final RangedWeapon repeatingLightCrossbow = new RangedWeapon("Repeating Light Crossbow",68,1,250,"1d6","1d8","19-20/x2",80,6,new Type[]{Type.PIERCING}, null, munitions.repeatingCrossbowBolts);
    public final Weapon net = new Weapon("Net",69,1,20,null,null,null, 10, 6, null, null);
    public final Weapon shuriken = new Weapon("Shuriken",70,1,1,"1","1d2","x2",10,0.5, new Type[]{Type.PIERCING}, new Special[]{Special.MONK});
    public final RangedWeapon halflingSlingStaff = new RangedWeapon("Halfling Sling Staff",71,1,20,"1d6","1d8","x3",80,3,new Type[]{Type.BLUDGEONING}, null, munitions.slingBullets);

    //endregion

    public Weapon[] exoticWeapons = new Weapon[]{
            kama,
            nunchaku,
            sai,
            siangham,
            bastardSword,
            dwarvenWaraxe,
            whip,
            orcDoubleAxe,
            spikedChain,
            elvenCurveBlade,
            direFlail,
            gnomeHookedHammer,
            twoBladedSword,
            dwarvenEngrosh,
            bolas,
            handCrossbow,
            repeatingHeavyCrossbow,
            repeatingLightCrossbow,
            net,
            shuriken,
            halflingSlingStaff
    };

    //endregion
}