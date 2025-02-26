package CGPFE.Management;

import CGPFE.Data.Models.Items.Equipment.Weapon.Weapon;
import CGPFE.God.Creation.Beasts._Beast.Beast;
import CGPFE.God.Creation.NPC.NPC;
import CGPFE.Mechanics.Dice;

public class CombatMgr {

    Dice dice = new Dice();

    private static CombatMgr _instance = null;

    boolean critical;

    public static synchronized CombatMgr getInstance() {
        if (_instance == null) {
            _instance = new CombatMgr();
        }
        return _instance;
    }

    private CombatMgr(){

    }

    public int damage = 0;

    public boolean didHitEnemy(Beast enemy){

        int hitDie = dice.Roll(20,1);

        if(hitDie == 1)
            System.out.println("A nat 1! You missed your target");
        else if(hitDie == 20){
            System.out.println("A nat 20! Will you get a critical?");
            hitDie = dice.Roll(20,1);
            if(hitDie >= enemy.defense.ac){
                System.out.println("You rolled a " + hitDie + " and got a critical hit!");
                critical = true;
            }else{
                System.out.println("You rolled a " + hitDie + " and failed the critical");
                critical = false;
            }
            return true;
        }
        else if(hitDie >= enemy.defense.ac){
            System.out.println("You rolled a " + hitDie + " and hit the " + enemy.info.name);
            return true;
        }
        else{
            System.out.println("You rolled a " + hitDie + " and missed the " + enemy.info.name);
            return false;
        }
        return false;
    }

    public void attackEnemy(Beast enemy, Weapon weapon){
        if(didHitEnemy(enemy)){
            damage = dice.Roll(weapon.dmgM.die, weapon.dmgM.amount);
            if(critical)
                damage *= weapon.critical.multiplier;

            enemy.defense.hp -= damage;

            System.out.println("Dealt " + damage + " to " + enemy.info.name);
        }

        damage = 0;
        critical = false;
    }

    public void attackEnemy(NPC enemy, Weapon weapon){
        damage = dice.Roll(weapon.dmgM.die, weapon.dmgM.amount);
        enemy.info.hp -= damage;

        System.out.println("Dealt " + damage + " to " + enemy.info.name);

        damage = 0;
    }
}