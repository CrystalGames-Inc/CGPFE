package SpiritEngine.God.Creation.Feats.I;

import SpiritEngine.God.Creation.Feats.P.PowerAttack;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class ImprovedOverrun extends Feat {
    public ImprovedOverrun() {
        super("Improved Overrun", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.strength >= 13) && (PlayerDataMgr.getInstance().hasFeat(new PowerAttack())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 1));
    }
}
