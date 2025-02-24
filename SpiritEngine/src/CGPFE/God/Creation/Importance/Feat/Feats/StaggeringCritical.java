package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class StaggeringCritical extends Feat {
    public StaggeringCritical() {
        super("Staggering Critical", Type.COMBAT, Type.CRITICAL);
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new CriticalFocus()) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 13));
    }
}
