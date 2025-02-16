package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.Data.Storage.Equipment.Armor.Armors;
import SpiritEngine.God.Creation.Importance.Feat.ArmorProficiency;
import SpiritEngine.Management.PlayerDataMgr;

public class ArmorProficiencyMedium extends ArmorProficiency {
    PlayerDataMgr mgr = PlayerDataMgr.getInstance();
    public ArmorProficiencyMedium() {
        super("Armor Proficiency, Medium", Armors.getInstance().mediumArmor);
        setCanAcquire(mgr.hasFeat(new ArmorProficiencyLight()));
    }
}
