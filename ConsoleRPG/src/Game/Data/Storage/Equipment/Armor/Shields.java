package Game.Data.Storage.Equipment.Armor;

import Game.Data.Models.ItemTypes.Equipment.Armor.Shield;

public class Shields {
    public Shield buckler = new Shield("Buckler",15,1,0,-1,5,5);
    public Shield lightWoodenShield = new Shield("Light Wooden Shield",3,1, 0, -1, 5, 5);
    public Shield lightSteelShield = new Shield("Light Steel Shield", 9,1,0,-1,5,6);
    public Shield heavyWoodenShield = new Shield("Heavy Wooden Shield",7,2,0,-2,15,10);
    public Shield heavySteelShield = new Shield("Heavy Steel Shield", 20,2,0,-2,15,15);
    public Shield towerShield = new Shield("Tower Shield", 30,4,2,-10,50,45);
}
