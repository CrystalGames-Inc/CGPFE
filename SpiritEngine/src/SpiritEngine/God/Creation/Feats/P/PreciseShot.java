package SpiritEngine.God.Creation.Feats.P;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class PreciseShot extends Feat {
    public PreciseShot() {
        super("Precise Shot", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new PointBlankShot()));
    }
}
