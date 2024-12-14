package Game.Data.Storage.Equipment;

import Game.Data.Models.ItemTypes.Weapon.Specials;
import Game.Data.Models.ItemTypes.Weapon.Types;
import Game.Data.Models.ItemTypes.Weapon.Weapon;

public class Weapons {
    Munitions munitions = new Munitions();

    Weapon[] weapons = {
            new Weapon("Gauntlet", 0, 1, 0, 2, "1d2", "1d3", "x2", 0.0, 1.0, new Types[]{Types.BLUDGEONING}, null, null),
            new Weapon("Unarmed Strike",0,1,0, 0, "1d2", "1d3", "x2", 0.0, 0.0, new Types[]{Types.BLUDGEONING}, new Specials[]{Specials.NONLETHAL}, null),
            new Weapon("Dagger", 0, 1, 0, 2, "1d3", "1d4","19-20/x2",10.0, 1.0, new Types[]{Types.PIERCING, Types.SLASHING, Types.OR}, null, null),
            new Weapon("Punching Dagger", 0, 1, 0, 2, "1d3", "1d4","x3", 0.0, 1, new Types[]{Types.PIERCING}, null,null),
            new Weapon("Spiked Gauntlet", 0, 1, 0, 5, "1d3","1d4","x2", 0.0, 1.0, new Types[]{Types.PIERCING}, null, null),
            new Weapon("Light Mace", 0,1,0, 5, "1d4", "1d6","x2",0.0, 4, new Types[]{Types.BLUDGEONING}, null, null),
            new Weapon("Sickle",0,1,0,6,"1d4","1d6","x2",0.0,2, new Types[]{Types.SLASHING}, new Specials[]{Specials.TRIP}, null),
            new Weapon("Club",0,1,0, 0,"1d4","1d6","x2",10,3, new Types[]{Types.BLUDGEONING}, null, null),
            new Weapon("Heavy Mace",0,1,0,12,"1d6","1d8","x2",0.0,3, new Types[]{Types.BLUDGEONING}, null, null),
            new Weapon("Morningstar",0,1,0, 8, "1d6", "1d8", "x2",0.0,6,new Types[]{Types.BLUDGEONING, Types.PIERCING, Types.AND}, null, null),
            new Weapon("Shortspear",0,1,0, 1, "1d4", "1d6", "x2", 20, 3, new Types[]{Types.PIERCING}, null, null),
            new Weapon("Longspear",0,1,0, 5, "1d6", "1d8", "x3",0.0, 9, new Types[]{Types.PIERCING}, new Specials[]{Specials.BRACE, Specials.REACH}, null),
            new Weapon("Quarterstaff",0,1,0,0, "1d4/1d4","1d6/1d6","x2", 0.0, 4, new Types[]{Types.BLUDGEONING}, new Specials[]{Specials.DOUBLE, Specials.MONK}, null),
            new Weapon("Spear", 0,1,0,2, "1d6","1d8","x3",20.0,6,new Types[]{Types.PIERCING}, new Specials[]{Specials.BRACE}, null),
            new Weapon("Blowgun",0,1,0, 2, "1","1d2","x2",20,1, new Types[]{Types.PIERCING}, null, munitions.blowgunDarts),
            new Weapon("Heavy Crossbow",0,1,0, 50, "1d8","1d10","19-20/x2",120,8, new Types[]{Types.PIERCING}, null, munitions.crossbowBolts),
            new Weapon("Light Crossbow",0,1,0, 30, "1d6","1d8","19-20/x2",80, 4, new Types[]{Types.PIERCING}, null, munitions.crossbowBolts),
            new Weapon("Dart",0,1,0, 0.5, "1d3", "1d4", "x2", 20, 0.5, new Types[]{Types.PIERCING}, null, null),
            new Weapon("Javelin", 0,1,0,1, "1d4","1d6","x2",30,2,new Types[]{Types.PIERCING}, null, null),
            new Weapon("Sling",0,1,0, 0, "1d3","1d4","x2",50, 0.0, new Types[]{Types.BLUDGEONING}, null, munitions.slingBullets),
            new Weapon("Throwing axe",0,1,0,8, "1d4","1d6", "x2", 10, 2, new Types[]{Types.SLASHING}, null, null),
            new Weapon("Light Hammer",0,1,0,1, "1d3","1d4", "x2", 20, 2, new Types[]{Types.BLUDGEONING}, null, null),
            new Weapon("Handaxe",0,1,0,6,"1d4","1d6","x3",0.0,3, new Types[]{Types.SLASHING}, null, null),
            new Weapon("Kukri",0,1,0,8,"1d3","1d4","18-20/x2",0.0,2,new Types[]{Types.SLASHING}, null, null),
            new Weapon("Light Pick", 0,1,0,4,"1d3","1d4","x4",0.0, 3, new Types[]{Types.PIERCING}, null, null),
            new Weapon("Sap",0,1,0,1,"1d4","1d6","x2",0.0,2,new Types[]{Types.BLUDGEONING}, new Specials[]{Specials.NONLETHAL}, null),
            new Weapon("Starknife",0,1,0,24,"1d3","1d4","x3",20,3,new Types[]{Types.PIERCING}, null, null),
            new Weapon("Short Sword",0,1,0, 10, "1d4","1d6","19-20/x2",0.0,2,new Types[]{Types.PIERCING}, null, null),
            new Weapon("Battleaxe",0,1,0, 10, "1d6","1d8","x3",0.0, 6, new Types[]{Types.SLASHING}, null, null),
            new Weapon("Flail",0,1,0,8,"1d6","1d8","x2",0.0,5, new Types[]{Types.BLUDGEONING}, new Specials[]{Specials.DISARM, Specials.TRIP}, null),
            new Weapon("Longsword",0,1,0,15,"1d6","1d8","19-20/x2",0.0,4,new Types[]{Types.SLASHING}, null, null),
            new Weapon("Heavy Pick",0,1,0,8,"1d4","1d6","x4",0.0,6, new Types[]{Types.PIERCING}, null, null),
            new Weapon("Rapier",0,1,0,20,"1d4","1d6","18-20/x2", 0.0, 2, new Types[]{Types.PIERCING}, null, null),
            new Weapon("Scimitar",0,1,0, 15, "1d4","1d6","18-20/x2",0.0,4,new Types[]{Types.SLASHING}, null, null),
            new Weapon("Trident",0,1,0, 15, "1d6","1d8","x2",10, 4, new Types[]{Types.PIERCING}, new Specials[]{Specials.BRACE}, null),
            new Weapon("Warhammer",0,1,0,12, "1d6","1d8","x3",0.0,5, new Types[]{Types.BLUDGEONING}, null, null),
            new Weapon("Falchion",0,1,0,75,"1d6","2d4","18-20/xs",0.0,8,new Types[]{Types.SLASHING}, null, null),
            new Weapon("Glaive",0,1,0, 8,"1d8","1d10","x3",0.0,10,new Types[]{Types.SLASHING},new Specials[]{Specials.REACH}, null)
    };
}
