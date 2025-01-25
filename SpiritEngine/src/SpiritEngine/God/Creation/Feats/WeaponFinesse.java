package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;

public class WeaponFinesse extends Feat {
    public WeaponFinesse() {
        super("Weapon Finesse", Type.COMBAT);
        setCanAcquire(true);
    }
}
