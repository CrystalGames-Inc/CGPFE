package SpiritEngine.God.Creation.Feats.G;

import SpiritEngine.God.Creation.Feats.I.ImprovedOverrun;
import SpiritEngine.God.Creation.Feats.P.PowerAttack;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class GreaterOverrun extends Feat {
    public GreaterOverrun() {
        super("Greater Overrun", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new ImprovedOverrun())) && (PlayerDataMgr.getInstance().hasFeat(new PowerAttack())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 6) && (PlayerDataMgr.getInstance().player.attributes.strength >= 13));
    }
}
