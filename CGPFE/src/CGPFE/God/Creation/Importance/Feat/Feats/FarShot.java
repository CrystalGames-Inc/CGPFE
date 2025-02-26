package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class FarShot extends Feat {
    public FarShot() {
        super("Far Shot", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new PointBlankShot()));
    }
}
