package SpiritEngine.God.Creation.Feats.G;

import SpiritEngine.God.Creation.Feats.C.CombatExpertise;
import SpiritEngine.God.Creation.Feats.I.ImprovedDisarm;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class GreaterDisarm extends Feat {
    public GreaterDisarm() {
        super("Greater Disarm", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new CombatExpertise())) && (PlayerDataMgr.getInstance().hasFeat(new ImprovedDisarm())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 6) && (PlayerDataMgr.getInstance().player.attributes.intelligence >= 13));
    }
}
