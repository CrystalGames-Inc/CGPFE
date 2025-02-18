package SpiritEngine.Management;

import SpiritEngine.Data.Models.Items.Equipment.Weapon.Weapon;
import SpiritEngine.God.Creation.Beasts._Beast.Beast;
import SpiritEngine.God.Creation.Importance.Constants.Size;
import SpiritEngine.God.Creation.NPC.NPC;
import SpiritEngine.Mechanics.Dice;

public class CombatMgr {

    Dice dice = new Dice();

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
        int damage = 0;

        if(enemy.info.size == Size.SMALL){
            damage = dice.Roll(weapon.dmgS.die, weapon.dmgS.amount);
            enemy.defense.hp -= damage;
        }
        else if(enemy.info.size == Size.MEDIUM){
            damage = dice.Roll(weapon.dmgM.die, weapon.dmgM.amount);
            enemy.defense.hp -= damage;
        }

        System.out.println("Dealt " + damage + " to " + enemy.info.name);
    }

    public void attackEnemy(NPC enemy, Weapon weapon){
        int damage = 0;

        if(enemy.info.size == Size.SMALL){
            damage = dice.Roll(weapon.dmgS.die, weapon.dmgS.amount);
            enemy.info.hp -= damage;
        }
        else if(enemy.info.size == Size.MEDIUM){
            damage = dice.Roll(weapon.dmgM.die, weapon.dmgM.amount);
            enemy.info.hp -= damage;
        }

        System.out.println("Dealt " + damage + " to " + enemy.info.name);
    }
}