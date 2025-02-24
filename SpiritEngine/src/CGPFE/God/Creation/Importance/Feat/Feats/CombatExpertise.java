package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class CombatExpertise extends Feat {
    public CombatExpertise() {
        super("Combat Expertise", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().player.attributes.intelligence >= 13);
    }
}
