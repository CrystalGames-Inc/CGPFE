package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class GreaterVitalStrike extends Feat {
    public GreaterVitalStrike() {
        super("Greater Vital Strike", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new ImprovedVitalStrike())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 16));
    }
}
