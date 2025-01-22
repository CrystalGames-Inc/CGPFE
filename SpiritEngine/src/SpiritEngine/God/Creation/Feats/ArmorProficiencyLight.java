package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;

public class ArmorProficiencyLight extends Feat {
    public ArmorProficiencyLight() {
        super("Armor Proficiency, Light", Type.COMBAT);
        setCanAcquire(true);
    }
}
