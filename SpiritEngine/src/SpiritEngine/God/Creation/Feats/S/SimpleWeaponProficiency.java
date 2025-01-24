package SpiritEngine.God.Creation.Feats.S;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;

public class SimpleWeaponProficiency extends Feat {
    public SimpleWeaponProficiency() {
        super("Simple Weapon Proficiency", Type.COMBAT);
        setCanAcquire(true);
    }
}
