package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class CriticalMastery extends Feat {
    public CriticalMastery() {
        super("Critical Mastery", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new CriticalFocus()));
    }
}
