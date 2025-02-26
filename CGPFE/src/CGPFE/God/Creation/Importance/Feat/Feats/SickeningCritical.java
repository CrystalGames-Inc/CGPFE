package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class SickeningCritical extends Feat {
    public SickeningCritical() {
        super("Sickening Critical", Type.COMBAT, Type.CRITICAL);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new CriticalFocus())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 11));
    }
}
