package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;

public class CombatCasting extends Feat {
    public CombatCasting() {
        super("Combat Casting", Type.COMBAT);
        setCanAcquire(true);
    }
}
