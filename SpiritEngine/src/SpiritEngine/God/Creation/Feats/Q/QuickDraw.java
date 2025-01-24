package SpiritEngine.God.Creation.Feats.Q;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class QuickDraw extends Feat {
    public QuickDraw() {
        super("Quick Draw", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().player.combatInfo.BAB >= 1);
    }
}
