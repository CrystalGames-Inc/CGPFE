package CGPFE.Data.Storage.Equipment.Weapons;

import CGPFE.Data.Models.Items.Equipment.Weapon.Base.Critical;
import CGPFE.Data.Models.Items.Equipment.Weapon.Base.Damage;
import CGPFE.Data.Models.Items.Equipment.Weapon.Ranged.RangedWeapon;
import CGPFE.Data.Models.Items.Equipment.Weapon.Base.Special;
import CGPFE.Data.Models.Items.Equipment.Weapon.Base.Type;
import CGPFE.Data.Models.Items.Equipment.Weapon.Weapon;

public final class Weapons {
    //region Simple Weapons

    //region Unarmed Attacks

    public static final Weapon gauntlet = new Weapon("Gauntlet", 0,1, 2, new Damage(2), new Damage(3), new Critical(2), 0, 1.0, new Type[]{Type.BLUDGEONING}, null);
    public static final Weapon unarmedStrike = new Weapon("Unarmed Strike",1,1,0, new Damage(2), new Damage(3), new Critical(2), 0, 0.0, new Type[]{Type.BLUDGEONING}, new Special[]{Special.NONLETHAL});

    //endregion

    //region Light Melee Weapons

    public static final Weapon dagger = new Weapon("Dagger",2,1,  2, new Damage(3), new Damage(4),new Critical(2,19),10, 1.0, new Type[]{Type.PIERCING, Type.SLASHING, Type.OR}, null);
    public static final Weapon punchingDagger = new Weapon("Punching Dagger",3,1,  2, new Damage(3), new Damage(4),new Critical(3), 0, 1, new Type[]{Type.PIERCING}, null);
    public static final Weapon spikedGauntlet = new Weapon("Spiked Gauntlet",4,1,  5, new Damage(3),new Damage(4),new Critical(2), 0, 1.0, new Type[]{Type.PIERCING}, null);
    public static final Weapon lightMace = new Weapon("Light Mace",5,1,5, new Damage(4), new Damage(6),new Critical(2),0, 4, new Type[]{Type.BLUDGEONING}, null);
    public static final Weapon sickle = new Weapon("Sickle",6,1,6,new Damage(4),new Damage(6),new Critical(2),0,2, new Type[]{Type.SLASHING}, new Special[]{Special.TRIP});

    //endregion

    //region One-Handed Melee Weapons

    public static final Weapon club = new Weapon("Club",7,1,0, new Damage(4),new Damage(6),new Critical(2),10,3, new Type[]{Type.BLUDGEONING}, null);
    public static final Weapon heavyMace = new Weapon("Heavy Mace",8,1,12,new Damage(6),new Damage(8),new Critical(2),0,3, new Type[]{Type.BLUDGEONING}, null);
    public static final Weapon morningstar = new Weapon("Morningstar",9,1, 8, new Damage(6), new Damage(8), new Critical(2),0,6,new Type[]{Type.BLUDGEONING, Type.PIERCING, Type.AND}, null);
    public static final Weapon shortspear = new Weapon("Shortspear",10,1, 1, new Damage(4), new Damage(6), new Critical(2), 20, 3, new Type[]{Type.PIERCING}, null);

    //endregion

    //region Two-handed Melee Weapons

    public static final Weapon longspear = new Weapon("Longspear",11,1, 5, new Damage(6), new Damage(8), new Critical(3),0, 9, new Type[]{Type.PIERCING}, new Special[]{Special.BRACE, Special.REACH});
    public static final Weapon quarterstaff = new Weapon("Quarterstaff",12,1,0, new Damage(4),new Damage(6),new Critical(2), 0, 4, new Type[]{Type.BLUDGEONING}, new Special[]{Special.DOUBLE, Special.MONK});
    public static final Weapon spear = new Weapon("Spear", 13,1,2, new Damage(6),new Damage(8),new Critical(3),20,6,new Type[]{Type.PIERCING}, new Special[]{Special.BRACE});

    //endregion

    //region Ranged Weapons

    public static final RangedWeapon blowgun = new RangedWeapon("Blowgun",14,1, 2, new Damage(1),new Damage(2),new Critical(2),20,1, new Type[]{Type.PIERCING}, null, Munitions.blowgunDarts);
    public static final RangedWeapon heavyCrossbow = new RangedWeapon("Heavy Crossbow",15,1, 50, new Damage(8),new Damage(10),new Critical(2,19),120,8, new Type[]{Type.PIERCING}, null, Munitions.crossbowBolts);
    public static final RangedWeapon lightCrossbow = new RangedWeapon("Light Crossbow",16,1, 30, new Damage(6),new Damage(8),new Critical(2,19),80, 4, new Type[]{Type.PIERCING}, null, Munitions.crossbowBolts);
    public static final RangedWeapon dart = new RangedWeapon("Dart",17,1, 0.5, new Damage(3), new Damage(4), new Critical(2), 20, 0.5, new Type[]{Type.PIERCING}, null, null);
    public static final RangedWeapon javelin = new RangedWeapon("Javelin",18,1,1, new Damage(4),new Damage(6),new Critical(2),30,2,new Type[]{Type.PIERCING}, null, null);
    public static final RangedWeapon sling = new RangedWeapon("Sling",19,1,0, new Damage(3),new Damage(4),new Critical(2),50, 0.0, new Type[]{Type.BLUDGEONING}, null, Munitions.slingBullets);

    //endregion

    public static final Weapon[] simpleWeapons = new Weapon[]{
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

    public static final Weapon throwingAxe = new Weapon("Throwing axe",20,1,8, new Damage(4),new Damage(6), new Critical(2), 10, 2, new Type[]{Type.SLASHING}, null);
    public static final Weapon lightHammer = new Weapon("Light Hammer",21,1,1, new Damage(3),new Damage(4), new Critical(2), 20, 2, new Type[]{Type.BLUDGEONING}, null);
    public static final Weapon handaxe = new Weapon("Handaxe",22,1,6,new Damage(4),new Damage(6),new Critical(3),0,3, new Type[]{Type.SLASHING}, null);
    public static final Weapon kukri = new Weapon("Kukri",23,1,8,new Damage(3),new Damage(4),new Critical(2,18),0,2,new Type[]{Type.SLASHING}, null);
    public static final Weapon lightPick = new Weapon("Light Pick",24,1,4,new Damage(3),new Damage(4),new Critical(4),0, 3, new Type[]{Type.PIERCING}, null);
    public static final Weapon sap = new Weapon("Sap",25,1,1,new Damage(4),new Damage(6),new Critical(2),0,2,new Type[]{Type.BLUDGEONING}, new Special[]{Special.NONLETHAL});
    public static final Weapon starknife = new Weapon("Starknife",26,1,24,new Damage(3),new Damage(4),new Critical(3),20,3,new Type[]{Type.PIERCING}, null);
    public static final Weapon shortSword = new Weapon("Short Sword",27,1, 10, new Damage(4),new Damage(6),new Critical(2,19),0,2,new Type[]{Type.PIERCING}, null);

    //endregion

    //region One-Handed Melee Weapons

    public static final Weapon battleaxe = new Weapon("Battleaxe",28,1, 10, new Damage(6),new Damage(8),new Critical(3),0, 6, new Type[]{Type.SLASHING}, null);
    public static final Weapon flail = new Weapon("Flail",29,1,8,new Damage(6),new Damage(8),new Critical(2),0,5, new Type[]{Type.BLUDGEONING}, new Special[]{Special.DISARM, Special.TRIP});
    public static final Weapon longsword = new Weapon("Longsword",30,1,15,new Damage(6),new Damage(8),new Critical(2,19),0,4,new Type[]{Type.SLASHING}, null);
    public static final Weapon heavyPick = new Weapon("Heavy Pick",31,1,8,new Damage(4),new Damage(6),new Critical(4),0,6, new Type[]{Type.PIERCING}, null);
    public static final Weapon rapier = new Weapon("Rapier",32,1,20,new Damage(4),new Damage(6),new Critical(2,18), 0, 2, new Type[]{Type.PIERCING}, null);
    public static final Weapon scimitar = new Weapon("Scimitar",33,1, 15, new Damage(4),new Damage(6),new Critical(2,18),0,4,new Type[]{Type.SLASHING}, null);
    public static final Weapon trident = new Weapon("Trident",34,1, 15, new Damage(6),new Damage(8),new Critical(2),10, 4, new Type[]{Type.PIERCING}, new Special[]{Special.BRACE});
    public static final Weapon warhammer = new Weapon("Warhammer",35,1,12, new Damage(6),new Damage(8),new Critical(3),0,5, new Type[]{Type.BLUDGEONING}, null);

    //endregion

    //region Two-Handed Melee Weapons

    public static final Weapon falchion = new Weapon("Falchion",36,1,75,new Damage(6),new Damage(2,4),new Critical(2,18),0,8,new Type[]{Type.SLASHING}, null);
    public static final Weapon glaive = new Weapon("Glaive",37,1,8,new Damage(8),new Damage(10),new Critical(3),0,10,new Type[]{Type.SLASHING},new Special[]{Special.REACH});
    public static final Weapon greataxe = new Weapon("Greataxe",38,1,20,new Damage(10),new Damage(12),new Critical(3),0,12, new Type[]{Type.SLASHING}, null);
    public static final Weapon greatclub = new Weapon("Greatclub",39,1,5,new Damage(8),new Damage(10),new Critical(2),0,8, new Type[]{Type.BLUDGEONING}, null);
    public static final Weapon heavyFlail = new Weapon("heavyFlail",40,1,15,new Damage(8),new Damage(10),new Critical(2,19),0,10, new Type[]{Type.BLUDGEONING}, new Special[]{Special.DISARM, Special.TRIP});
    public static final Weapon greatsword = new Weapon("Greatsword",41,1,50, new Damage(10),new Damage(2,6),new Critical(2,19),0,8, new Type[]{Type.SLASHING}, null);
    public static final Weapon guisarme = new Weapon("Guisarme",42,1,9,new Damage(6),new Damage(2,4),new Critical(3),0, 12, new Type[]{Type.SLASHING}, new Special[]{Special.REACH, Special.TRIP});
    public static final Weapon halbred = new Weapon("Halbred",43,1,10,new Damage(8),new Damage(10),new Critical(3),0,12, new Type[]{Type.PIERCING, Type.SLASHING, Type.OR}, new Special[]{Special.BRACE, Special.TRIP});
    public static final Weapon lance = new Weapon("Lance",44,1,10,new Damage(6),new Damage(8),new Critical(3),0,10,new Type[]{Type.PIERCING}, new Special[]{Special.REACH});
    public static final Weapon ranseur = new Weapon("Ranseur",45,1,10,new Damage(6),new Damage(2,4),new Critical(3),0,12,new Type[]{Type.PIERCING}, new Special[]{Special.DISARM, Special.REACH});
    public static final Weapon scythe = new Weapon("Scythe",46,1,18,new Damage(6),new Damage(2,4),new Critical(4),0,10, new Type[]{Type.PIERCING, Type.SLASHING, Type.OR}, new Special[]{Special.TRIP});


    //endregion

    //region Ranged Weapons

    public static final RangedWeapon longbow = new RangedWeapon("Longbow",47,1,75,new Damage(6),new Damage(8),new Critical(3),100,3,new Type[]{Type.PIERCING}, null, Munitions.arrows);
    public static final RangedWeapon compositeLongbow = new RangedWeapon("Composite Longbow",48,1, 100, new Damage(6),new Damage(8),new Critical(3),110,3,new Type[]{Type.PIERCING}, null, Munitions.arrows);
    public static final RangedWeapon shortbow = new RangedWeapon("Shortbow",49,1,30,new Damage(4),new Damage(6),new Critical(3),60,2,new Type[]{Type.PIERCING}, null, Munitions.arrows);
    public static final RangedWeapon compositeShortbow = new RangedWeapon("Composite Shortbow",50,1,75,new Damage(4),new Damage(6),new Critical(3),70,2,new Type[]{Type.PIERCING}, null, Munitions.arrows);

    //endregion

    public static final Weapon[] martialWeapons = new Weapon[]{
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

    public static final Weapon kama = new Weapon("Kama",51,1,2,new Damage(4),new Damage(6),new Critical(2),0,2,new Type[]{Type.SLASHING}, new Special[]{Special.MONK, Special.TRIP});
    public static final Weapon nunchaku = new Weapon("Nunchaku",52,1,2,new Damage(4),new Damage(6),new Critical(2),0,2,new Type[]{Type.BLUDGEONING}, new Special[]{Special.DISARM, Special.MONK});
    public static final Weapon sai = new Weapon("Sai",53,1,1,new Damage(3),new Damage(4),new Critical(2),0,1,new Type[]{Type.BLUDGEONING}, new Special[]{Special.DISARM, Special.MONK});
    public static final Weapon siangham = new Weapon("Siangham",54,1,3,new Damage(4),new Damage(6),new Critical(2),0,1,new Type[]{Type.PIERCING}, new Special[]{Special.MONK});

    //endregion

    //region One-Handed Melee Weapons

    public static final Weapon bastardSword = new Weapon("Bastard sword",55,1,35,new Damage(8),new Damage(10),new Critical(2,9),0, 6, new Type[]{Type.SLASHING}, null);
    public static final Weapon dwarvenWaraxe = new Weapon("Dwarven waraxe",56,1,30,new Damage(8),new Damage(10),new Critical(3),0,8,new Type[]{Type.SLASHING}, null);
    public static final Weapon whip = new Weapon("Whip",57,1,1,new Damage(2),new Damage(3),new Critical(2),0,2,new Type[]{Type.SLASHING}, new Special[]{Special.DISARM, Special.NONLETHAL, Special.REACH, Special.TRIP});

    //endregion

    //region Two-Handed Melee Weapons

    public static final Weapon orcDoubleAxe = new Weapon("Orc Double Axe",58,1,60,new Damage(6),new Damage(8),new Critical(3),0,15,new Type[]{Type.SLASHING}, new Special[]{Special.DOUBLE});
    public static final Weapon spikedChain = new Weapon("Spiked Chain",59,1, 25,new Damage(6),new Damage(2,4),new Critical(2),0,10, new Type[]{Type.PIERCING}, new Special[]{Special.DISARM, Special.TRIP});
    public static final Weapon elvenCurveBlade = new Weapon("Elven Curve Blade",60,1,80,new Damage(8),new Damage(10),new Critical(2,18),0,7,new Type[]{Type.SLASHING}, null);
    public static final Weapon direFlail = new Weapon("Dire Flail",61,1,90, new Damage(6),new Damage(8),new Critical(2), 0, 10, new Type[]{Type.BLUDGEONING}, new Special[]{Special.DISARM, Special.DOUBLE, Special.TRIP});
    public static final Weapon gnomeHookedHammer = new Weapon("Gnome-Hooked Hammer",62,1,20, new Damage(6),new Damage(8),new Critical(3),0,6, new Type[]{Type.BLUDGEONING, Type.PIERCING, Type.OR}, new Special[]{Special.DOUBLE, Special.TRIP});
    public static final Weapon twoBladedSword = new Weapon("Two-Bladed Sword",63,1,100,new Damage(6),new Damage(8),new Critical(2,19),0,10,new Type[]{Type.SLASHING}, new Special[]{Special.DOUBLE});
    public static final Weapon dwarvenEngrosh = new Weapon("Dwarven Engrosh",64,1,50,new Damage(6),new Damage(8),new Critical(3),0, 12, new Type[]{Type.PIERCING, Type.SLASHING, Type.OR}, new Special[]{Special.BRACE, Special.DOUBLE});


    //endregion

    //region Ranged Weapons

    public static final Weapon bolas = new Weapon("Bolas",65,1,5,new Damage(3),new Damage(4),new Critical(2),10, 2, new Type[]{Type.BLUDGEONING}, new Special[]{Special.NONLETHAL, Special.TRIP});
    public static final RangedWeapon handCrossbow = new RangedWeapon("Hand Crossbow",66,1,100,new Damage(3),new Damage(4),new Critical(2,19),30,2, new Type[]{Type.PIERCING}, null, Munitions.handCrossbowBolts);
    public static final RangedWeapon repeatingHeavyCrossbow = new RangedWeapon("Repeating Heavy Crossbow",67,1,400,new Damage(8),new Damage(10),new Critical(2,19),120,12,new Type[]{Type.PIERCING}, null, Munitions.repeatingCrossbowBolts);
    public static final RangedWeapon repeatingLightCrossbow = new RangedWeapon("Repeating Light Crossbow",68,1,250,new Damage(6),new Damage(8),new Critical(2,19),80,6,new Type[]{Type.PIERCING}, null, Munitions.repeatingCrossbowBolts);
    public static final Weapon net = new Weapon("Net",69,1,20,null,null,null, 10, 6, null, null);
    public static final Weapon shuriken = new Weapon("Shuriken",70,1,1,new Damage(1),new Damage(2),new Critical(2),10,0.5, new Type[]{Type.PIERCING}, new Special[]{Special.MONK});
    public static final RangedWeapon halflingSlingStaff = new RangedWeapon("Halfling Sling Staff",71,1,20,new Damage(6),new Damage(8),new Critical(3),80,3,new Type[]{Type.BLUDGEONING}, null, Munitions.slingBullets);

    //endregion

    public static Weapon[] exoticWeapons = new Weapon[]{
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