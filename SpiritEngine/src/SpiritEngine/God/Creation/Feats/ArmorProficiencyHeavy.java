package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class ArmorProficiencyHeavy extends Feat {
    PlayerDataMgr mgr = PlayerDataMgr.getInstance();
    public ArmorProficiencyHeavy() {
        super("Armor Proficiency, Heavy", Type.COMBAT);
        setCanAcquire((mgr.hasFeat(new ArmorProficiencyLight())) && (mgr.hasFeat(new ArmorProficiencyMedium())));
    }
}
