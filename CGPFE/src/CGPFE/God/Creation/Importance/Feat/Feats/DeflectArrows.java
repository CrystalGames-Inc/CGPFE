package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class DeflectArrows extends Feat {
    public DeflectArrows() {
        super("Deflect Arrows", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.dexterity >= 13) && (PlayerDataMgr.getInstance().hasFeat(new ImprovedUnarmedStrike())));
    }
}
