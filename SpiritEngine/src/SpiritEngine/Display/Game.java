package SpiritEngine.Display;

import SpiritEngine.Data.Storage.Equipment.Weapons.Weapons;
import SpiritEngine.God.Creation.Beasts.A.Aboleth;
import SpiritEngine.God.Creation.Beasts._Beast.Beast;
import SpiritEngine.God.Creation.Importance.Feat.Feats.GreatCleave;
import SpiritEngine.Management.CombatMgr;

public class Game {

    public static void main(String[] args){
        GameStartup g = new GameStartup();
        CombatMgr c = CombatMgr.getInstance();

        g.startGame();

        Weapons weapons = Weapons.getInstance();

        Beast aboleth = new Aboleth();

        System.out.println("Aboleth Health: " + aboleth.defense.hp);

        c.attackEnemy(aboleth, weapons.greatsword);

        System.out.println("Aboleth Health: " + aboleth.defense.hp);
    }
}