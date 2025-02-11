package SpiritEngine.Display;

import SpiritEngine.Data.Storage.Equipment.Weapons.Weapons;
import SpiritEngine.God.Creation.Beasts.A.Aasimar;
import SpiritEngine.God.Creation.Beasts._Beast.Beast;
import SpiritEngine.Management.CombatMgr;

public class Game {

    public static void main(String[] args){
        GameStartup g = new GameStartup();
        CombatMgr c = CombatMgr.getInstance();

        g.startGame();

        Beast aasimar = new Aasimar();

        System.out.println(aasimar.defense.hp);

        c.attackEnemy(
                aasimar,
                Weapons.getInstance().greatsword
        );

        System.out.println(aasimar.defense.hp);
    }
}