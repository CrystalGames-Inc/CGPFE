package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;

public class EmpowerSpell extends Feat {
    public EmpowerSpell() {
        super("Empower Spell", Type.METAMAGIC);
        setCanAcquire(true);
    }
}
