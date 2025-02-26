package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class CriticalFocus extends Feat {
    public CriticalFocus() {
        super("Critical Focus", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().player.combatInfo.BAB >= 9);
    }
}
