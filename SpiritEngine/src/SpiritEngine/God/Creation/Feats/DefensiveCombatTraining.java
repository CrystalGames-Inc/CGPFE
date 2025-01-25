package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;

public class DefensiveCombatTraining extends Feat {
    public DefensiveCombatTraining() {
        super("Defensive Combat Training", Type.COMBAT);
        setCanAcquire(true);
    }
}
