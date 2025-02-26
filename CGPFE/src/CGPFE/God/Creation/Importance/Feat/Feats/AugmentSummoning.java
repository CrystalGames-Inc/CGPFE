package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.Management.PlayerDataMgr;

public class AugmentSummoning extends Feat {
    public AugmentSummoning() {
        super("Augment Summoning");
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new SpellFocus()));
    }
}
