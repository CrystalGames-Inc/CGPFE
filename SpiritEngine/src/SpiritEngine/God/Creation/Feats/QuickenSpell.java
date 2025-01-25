package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;

public class QuickenSpell extends Feat {
    public QuickenSpell() {
        super("Quicken Spell", Type.METAMAGIC);
        setCanAcquire(true);
    }
}
