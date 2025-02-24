package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class StunningCritical extends Feat {
    public StunningCritical() {
        super("Stunning Critical", Type.COMBAT, Type.CRITICAL);
        setCanAcquire(
                (PlayerDataMgr.getInstance().hasFeat(new CriticalFocus())) &&
                (PlayerDataMgr.getInstance().hasFeat(new StaggeringCritical())) &&
                (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 17)
        );
    }
}
