package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class StrikeBack extends Feat {
    public StrikeBack() {
        super("Strike Back", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().player.combatInfo.BAB >= 11);
    }
}
