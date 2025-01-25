package SpiritEngine.God.Creation.Feats;

import SpiritEngine.Data.Storage.Equipment.Armor.Armors;
import SpiritEngine.God.Creation.Importance.Feat.ArmorProficiency;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class ArmorProficiencyMedium extends ArmorProficiency {
    PlayerDataMgr mgr = PlayerDataMgr.getInstance();
    public ArmorProficiencyMedium() {
        super("Armor Proficiency, Medium", new Armors().mediumArmor);
        setCanAcquire(mgr.hasFeat(new ArmorProficiencyLight()));
    }
}
