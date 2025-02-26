package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.Data.Storage.Equipment.Armor.Armors;
import CGPFE.God.Creation.Importance.Feat.ArmorProficiency;
import CGPFE.Management.PlayerDataMgr;

public class ArmorProficiencyMedium extends ArmorProficiency {
    PlayerDataMgr mgr = PlayerDataMgr.getInstance();
    public ArmorProficiencyMedium() {
        super("Armor Proficiency, Medium", Armors.getInstance().mediumArmor);
        setCanAcquire(mgr.hasFeat(new ArmorProficiencyLight()));
    }
}
