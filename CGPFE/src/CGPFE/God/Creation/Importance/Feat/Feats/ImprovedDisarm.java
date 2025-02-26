package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class ImprovedDisarm extends Feat {
    public ImprovedDisarm() {
        super("Improved Disarm", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.intelligence >= 13) && (PlayerDataMgr.getInstance().hasFeat(new CombatExpertise())));
    }
}
