package SpiritEngine.God.Creation.Feats.A;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class ArmorProficiencyMedium extends Feat {
    PlayerDataMgr mgr = PlayerDataMgr.getInstance();
    public ArmorProficiencyMedium() {
        super("Armor Proficiency, Medium", Type.COMBAT);
        setCanAcquire(mgr.hasFeat(new ArmorProficiencyLight()));
    }
}
