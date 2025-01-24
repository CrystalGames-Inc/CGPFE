package SpiritEngine.God.Creation.Feats.A;

import SpiritEngine.God.Creation.Feats.S.SpellFocus;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class AugmentSummoning extends Feat {
    public AugmentSummoning() {
        super("Augment Summoning");
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new SpellFocus()));
    }
}
