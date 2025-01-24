package SpiritEngine.God.Creation.Feats.I;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class ImprovedCritical extends Feat {
    public ImprovedCritical() {
        super("Improved Critical", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().player.combatInfo.BAB >= 8);
    }
}
