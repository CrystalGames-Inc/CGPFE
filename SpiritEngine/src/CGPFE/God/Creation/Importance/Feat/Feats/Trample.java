package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class Trample extends Feat {
    public Trample() {
        super("Trample", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new MountedCombat()));
    }
}
