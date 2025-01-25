package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class ImprovedSunder extends Feat {
    public ImprovedSunder() {
        super("Improved Sunder", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.strength >= 13) && (PlayerDataMgr.getInstance().hasFeat(new PowerAttack())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 1));
    }
}
