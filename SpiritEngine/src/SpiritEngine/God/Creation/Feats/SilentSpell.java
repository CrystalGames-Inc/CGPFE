package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;

public class SilentSpell extends Feat {
    public SilentSpell() {
        super("Silent Spell", Type.METAMAGIC);
        setCanAcquire(true);
    }
}
