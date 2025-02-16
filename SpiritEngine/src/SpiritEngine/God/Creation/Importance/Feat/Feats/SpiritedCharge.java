package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class SpiritedCharge extends Feat {
    public SpiritedCharge() {
        super("Spirited Charge", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new MountedCombat())) && (PlayerDataMgr.getInstance().hasFeat(new RideByAttack())));
    }
}
