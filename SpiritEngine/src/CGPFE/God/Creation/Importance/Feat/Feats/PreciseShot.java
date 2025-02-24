package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class PreciseShot extends Feat {
    public PreciseShot() {
        super("Precise Shot", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new PointBlankShot()));
    }
}
