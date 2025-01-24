package SpiritEngine.God.Creation.Feats.F;

import SpiritEngine.God.Creation.Feats.P.PointBlankShot;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class FarShot extends Feat {
    public FarShot() {
        super("Far Shot", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new PointBlankShot()));
    }
}
