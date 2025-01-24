package SpiritEngine.God.Creation.Feats.C;

import SpiritEngine.God.Creation.Feats.P.PowerAttack;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class Cleave extends Feat {
    public Cleave() {
        super("Cleave", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().player.attributes.strength >= 13 && PlayerDataMgr.getInstance().hasFeat(new PowerAttack()) && PlayerDataMgr.getInstance().player.combatInfo.BAB >= 1);
    }
}
