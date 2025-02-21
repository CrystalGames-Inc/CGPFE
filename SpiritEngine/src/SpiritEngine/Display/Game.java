package SpiritEngine.Display;

import SpiritEngine.Data.Storage.Equipment.Weapons.Weapons;
import SpiritEngine.God.Creation.Beasts.A.Aasimar;
import SpiritEngine.God.Creation.Beasts._Beast.Beast;
import SpiritEngine.Management.CombatMgr;
import SpiritEngine.Management.PlayerDataMgr;

public class Game {

    public static void main(String[] args){
        GameStartup g = new GameStartup();
        CombatMgr c = CombatMgr.getInstance();

        g.startGame();


        PlayerDataMgr.getInstance();

        Beast aboleth = new Aasimar();

        System.out.println("Aboleth Health: " + aboleth.defense.hp);

        c.attackEnemy(aboleth, Weapons.greatsword);

        System.out.println("Aboleth Health: " + aboleth.defense.hp);
    }
}