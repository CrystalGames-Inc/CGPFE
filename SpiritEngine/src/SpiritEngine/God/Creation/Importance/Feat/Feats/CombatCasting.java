package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;

public class CombatCasting extends Feat {
    public CombatCasting() {
        super("Combat Casting", Type.COMBAT);
        setCanAcquire(true);
    }
}
