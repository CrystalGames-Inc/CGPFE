package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

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
