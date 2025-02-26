package CGPFE.Data.Storage.Equipment.Armor;

import CGPFE.Data.Models.Items.Equipment.Armor.Shield;

public final class Shields {

    private static Shields _instance;

    public static synchronized Shields getInstance(){
        if (_instance == null) {
            _instance = new Shields();
        }
        return _instance;
    }

    private Shields(){

    }

    public final Shield buckler = new Shield("Buckler",15,1,0,-1,5,5);
    public final Shield lightWoodenShield = new Shield("Light Wooden Shield",3,1, 0, -1, 5, 5);
    public final Shield lightSteelShield = new Shield("Light Steel Shield", 9,1,0,-1,5,6);
    public final Shield heavyWoodenShield = new Shield("Heavy Wooden Shield",7,2,0,-2,15,10);
    public final Shield heavySteelShield = new Shield("Heavy Steel Shield", 20,2,0,-2,15,15);
    public final Shield towerShield = new Shield("Tower Shield", 30,4,2,-10,50,45);
}
