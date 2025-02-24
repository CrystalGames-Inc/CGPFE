package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class SpiritedCharge extends Feat {
    public SpiritedCharge() {
        super("Spirited Charge", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new MountedCombat())) && (PlayerDataMgr.getInstance().hasFeat(new RideByAttack())));
    }
}
