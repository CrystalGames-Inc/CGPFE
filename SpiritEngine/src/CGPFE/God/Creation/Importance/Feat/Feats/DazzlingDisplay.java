package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.Management.PlayerDataMgr;

public class DazzlingDisplay extends Feat {
    public DazzlingDisplay() {
        super("Dazzling Display");
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new CriticalFocus()));
    }
}
