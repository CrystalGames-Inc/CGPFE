package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class ImprovedInitiative extends Feat {
    public ImprovedInitiative() {
        super("Improved Initiative", Type.COMBAT);
        setCanAcquire(true);
        setCheckModifiers(PlayerDataMgr.getInstance().player.combatInfo.initMod, 4);
    }
}
