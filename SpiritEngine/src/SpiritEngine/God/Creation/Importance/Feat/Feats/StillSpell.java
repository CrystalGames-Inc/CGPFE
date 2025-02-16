package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;

public class StillSpell extends Feat {
    public StillSpell() {
        super("Still Spell", Type.METAMAGIC);
        setCanAcquire(true);
    }
}
