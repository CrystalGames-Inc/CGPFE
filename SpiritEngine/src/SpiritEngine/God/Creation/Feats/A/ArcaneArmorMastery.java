package SpiritEngine.God.Creation.Feats.A;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class ArcaneArmorMastery extends Feat {
    PlayerDataMgr mgr = PlayerDataMgr.getInstance();
    public ArcaneArmorMastery() {
        super("Arcane Armor Mastery", Type.COMBAT);
        setCanAcquire((mgr.hasFeat(new ArcaneArmorTraining())) && (mgr.hasFeat(new ArmorProficiencyMedium())) && mgr.player.info.level >= 7);
    }
}
