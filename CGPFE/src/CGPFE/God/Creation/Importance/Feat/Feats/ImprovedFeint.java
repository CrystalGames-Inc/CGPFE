package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class ImprovedFeint extends Feat {
    public ImprovedFeint() {
        super("Improved Feint", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.intelligence >= 13) && (PlayerDataMgr.getInstance().hasFeat(new CombatExpertise())));
    }
}
