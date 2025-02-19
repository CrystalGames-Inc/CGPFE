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

    public int damage = 0;

    public void didHitEnemy(Beast enemy){

        int hitDie = dice.Roll(20,1);

        if(hitDie == 1)
            System.out.println("A nat 1! You missed your target");
        else if(hitDie == 20){
            System.out.println("A nat 20! Will you get a critical?");
            isCritical(enemy);
        }

        if(hitDie >= enemy.defense.ac && hitDie < 20){

        }
    }

    public boolean isCritical(Beast enemy){


        return false;
    }

    public void attackEnemy(Beast enemy, Weapon weapon){
        damage = dice.Roll(weapon.dmgM.die, weapon.dmgM.amount);
        enemy.defense.hp -= damage;

        System.out.println("Dealt " + damage + " to " + enemy.info.name);

        damage = 0;
    }

    public void attackEnemy(NPC enemy, Weapon weapon){
        damage = dice.Roll(weapon.dmgM.die, weapon.dmgM.amount);
        enemy.info.hp -= damage;

        System.out.println("Dealt " + damage + " to " + enemy.info.name);

        damage = 0;
    }
}