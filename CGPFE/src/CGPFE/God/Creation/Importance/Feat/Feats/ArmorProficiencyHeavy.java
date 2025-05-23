package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.Data.Storage.Equipment.Armor.Armors;
import CGPFE.God.Creation.Importance.Feat.ArmorProficiency;
import CGPFE.Management.PlayerDataMgr;

public class ArmorProficiencyHeavy extends ArmorProficiency {
    PlayerDataMgr mgr = PlayerDataMgr.getInstance();
    public ArmorProficiencyHeavy() {
        super("Armor Proficiency, Heavy", Armors.getInstance().heavyArmor);
        setCanAcquire((mgr.hasFeat(new ArmorProficiencyLight())) && (mgr.hasFeat(new ArmorProficiencyMedium())));
    }
}
