package SpiritEngine.God.Creation.Feats.B;

import SpiritEngine.God.Creation.Feats.C.CriticalFocus;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class BleedingCritical extends Feat {
    public BleedingCritical() {
        super("Bleeding Critical", Type.COMBAT, Type.CRITICAL);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new CriticalFocus())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 11));
    }
}
