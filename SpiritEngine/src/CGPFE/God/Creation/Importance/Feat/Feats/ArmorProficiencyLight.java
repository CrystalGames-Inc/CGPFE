package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.Data.Storage.Equipment.Armor.Armors;
import CGPFE.God.Creation.Importance.Feat.ArmorProficiency;

public class ArmorProficiencyLight extends ArmorProficiency {
    public ArmorProficiencyLight() {
        super("Armor Proficiency, Light", Armors.getInstance().lightArmor);
        setCanAcquire(true);
    }
}
