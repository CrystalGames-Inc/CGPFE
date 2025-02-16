package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;

public class EmpowerSpell extends Feat {
    public EmpowerSpell() {
        super("Empower Spell", Type.METAMAGIC);
        setCanAcquire(true);
    }
}
