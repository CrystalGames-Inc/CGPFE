package SpiritEngine.God.Creation.Feats.C;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class CombatExpertise extends Feat {
    public CombatExpertise() {
        super("Combat Expertise", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().player.attributes.intelligence >= 13);
    }
}
