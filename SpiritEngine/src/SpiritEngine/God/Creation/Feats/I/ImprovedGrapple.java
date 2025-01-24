package SpiritEngine.God.Creation.Feats.I;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class ImprovedGrapple extends Feat {
    public ImprovedGrapple() {
        super("Improved Grapple", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.dexterity >= 13) && (PlayerDataMgr.getInstance().hasFeat(new ImprovedUnarmedStrike())));
    }
}
