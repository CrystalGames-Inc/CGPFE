package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class PowerAttack extends Feat {
    public PowerAttack() {
        super("Power Attack", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.strength >= 13) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 1));
    }
}
