package SpiritEngine.God.Creation.Feats.G;

import SpiritEngine.God.Creation.Feats.I.ImprovedVitalStrike;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class GreaterVitalStrike extends Feat {
    public GreaterVitalStrike() {
        super("Greater Vital Strike", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new ImprovedVitalStrike())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 16));
    }
}
