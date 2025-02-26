package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class ImprovedCritical extends Feat {
    public ImprovedCritical() {
        super("Improved Critical", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().player.combatInfo.BAB >= 8);
    }
}
