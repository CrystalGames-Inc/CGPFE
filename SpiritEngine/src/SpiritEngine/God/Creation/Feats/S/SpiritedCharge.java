package SpiritEngine.God.Creation.Feats.S;

import SpiritEngine.God.Creation.Feats.M.MountedCombat;
import SpiritEngine.God.Creation.Feats.R.RideByAttack;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class SpiritedCharge extends Feat {
    public SpiritedCharge() {
        super("Spirited Charge", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new MountedCombat())) && (PlayerDataMgr.getInstance().hasFeat(new RideByAttack())));
    }
}
