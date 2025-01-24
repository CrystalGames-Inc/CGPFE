package SpiritEngine.God.Creation.Feats.I;

import SpiritEngine.God.Creation.Feats.C.CombatExpertise;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class ImprovedDisarm extends Feat {
    public ImprovedDisarm() {
        super("Improved Disarm", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.intelligence >= 13) && (PlayerDataMgr.getInstance().hasFeat(new CombatExpertise())));
    }
}
