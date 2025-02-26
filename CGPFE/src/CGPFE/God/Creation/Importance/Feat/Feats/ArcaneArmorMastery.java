package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class ArcaneArmorMastery extends Feat {
    PlayerDataMgr mgr = PlayerDataMgr.getInstance();
    public ArcaneArmorMastery() {
        super("Arcane Armor Mastery", Type.COMBAT);
        setCanAcquire((mgr.hasFeat(new ArcaneArmorTraining())) && (mgr.hasFeat(new ArmorProficiencyMedium())) && mgr.player.info.level >= 7);
    }
}
