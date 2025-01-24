package SpiritEngine.God.Creation.Feats.A;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class ArcaneArmorTraining extends Feat {
    PlayerDataMgr mgr = PlayerDataMgr.getInstance();
    public ArcaneArmorTraining() {
        super("Arcane Armor Training", Type.COMBAT);
        setCanAcquire((mgr.hasFeat(new ArmorProficiencyLight())) && (mgr.player.info.level >= 3));
    }
}
