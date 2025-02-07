package SpiritEngine.God.Creation.Feats;

import SpiritEngine.Data.Storage.Equipment.Armor.Armors;
import SpiritEngine.God.Creation.Importance.Feat.ArmorProficiency;

public class ArmorProficiencyLight extends ArmorProficiency {
    public ArmorProficiencyLight() {
        super("Armor Proficiency, Light", Armors.getInstance().lightArmor);
        setCanAcquire(true);
    }
}
