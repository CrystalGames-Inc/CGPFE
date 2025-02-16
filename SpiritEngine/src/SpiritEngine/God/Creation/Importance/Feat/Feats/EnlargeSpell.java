package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;

public class EnlargeSpell extends Feat {
    public EnlargeSpell() {
        super("Enlarge Spell", Type.METAMAGIC);
        setCanAcquire(true);
    }
}
