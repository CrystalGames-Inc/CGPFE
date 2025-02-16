package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;

public class ShieldProficiency extends Feat {
    public ShieldProficiency() {
        super("Shield Proficiency", Type.COMBAT);
        setCanAcquire(true);
    }
}
