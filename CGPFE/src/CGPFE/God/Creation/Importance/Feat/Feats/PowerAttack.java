package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class PowerAttack extends Feat {
    public PowerAttack() {
        super("Power Attack", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.strength >= 13) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 1));
    }
}
