package SpiritEngine.God.Creation.Feats.C;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class CriticalFocus extends Feat {
    public CriticalFocus() {
        super("Critical Focus", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().player.combatInfo.BAB >= 9);
    }
}
