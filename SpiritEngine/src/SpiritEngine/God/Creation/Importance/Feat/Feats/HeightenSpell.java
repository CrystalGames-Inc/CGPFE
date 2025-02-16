package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;

public class HeightenSpell extends Feat {
    public HeightenSpell() {
        super("Heighten Spell", Type.METAMAGIC);
        setCanAcquire(true);
    }
}
