package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class ImprovedGrapple extends Feat {
    public ImprovedGrapple() {
        super("Improved Grapple", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.dexterity >= 13) && (PlayerDataMgr.getInstance().hasFeat(new ImprovedUnarmedStrike())));
    }
}
