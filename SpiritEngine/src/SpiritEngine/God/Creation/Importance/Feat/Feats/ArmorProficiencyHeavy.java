package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.Data.Storage.Equipment.Armor.Armors;
import SpiritEngine.God.Creation.Importance.Feat.ArmorProficiency;
import SpiritEngine.Management.PlayerDataMgr;

public class ArmorProficiencyHeavy extends ArmorProficiency {
    PlayerDataMgr mgr = PlayerDataMgr.getInstance();
    public ArmorProficiencyHeavy() {
        super("Armor Proficiency, Heavy", Armors.getInstance().heavyArmor);
        setCanAcquire((mgr.hasFeat(new ArmorProficiencyLight())) && (mgr.hasFeat(new ArmorProficiencyMedium())));
    }
}
