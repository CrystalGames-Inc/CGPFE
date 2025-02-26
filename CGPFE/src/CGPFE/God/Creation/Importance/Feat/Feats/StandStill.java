package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class StandStill extends Feat {
    public StandStill() {
        super("Stand Still", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new CombatReflexes()));
    }
}
