package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;

public class MartialWeaponProficiency extends Feat {
    public MartialWeaponProficiency() {
        super("Martial Weapon Proficiency", Type.COMBAT);
        setCanAcquire(true);
    }
}
