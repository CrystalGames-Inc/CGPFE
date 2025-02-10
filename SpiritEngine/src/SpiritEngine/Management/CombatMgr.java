package SpiritEngine.Management;

import SpiritEngine.Data.Models.Items.Equipment.Weapon.Weapon;
import SpiritEngine.God.Creation.Beasts._Beast.Beast;
import SpiritEngine.God.Creation.NPC.NPC;

public class CombatMgr {

    private static CombatMgr _instance = null;

    public static synchronized CombatMgr getInstance() {
        if (_instance == null) {
            _instance = new CombatMgr();
        }
        return _instance;
    }

    private CombatMgr(){

    }

    public void attackEnemy(Beast enemy, Weapon weapon){

    }

    public void attackEnemy(NPC enemy, Weapon weapon){

    }
}