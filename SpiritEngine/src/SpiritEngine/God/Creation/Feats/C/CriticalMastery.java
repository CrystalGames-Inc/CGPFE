package SpiritEngine.God.Creation.Feats.C;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class CriticalMastery extends Feat {
    public CriticalMastery() {
        super("Critical Mastery", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new CriticalFocus()));
    }
}
