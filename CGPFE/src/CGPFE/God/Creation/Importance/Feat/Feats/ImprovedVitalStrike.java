package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class ImprovedVitalStrike extends Feat {
    public ImprovedVitalStrike() {
        super("Improved Vital Strike", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new VitalStrike())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 11));
    }
}
