package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class ImprovedVitalStrike extends Feat {
    public ImprovedVitalStrike() {
        super("Improved Vital Strike", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new VitalStrike())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 11));
    }
}
