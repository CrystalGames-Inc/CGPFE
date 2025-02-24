package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class ArcaneArmorTraining extends Feat {
    PlayerDataMgr mgr = PlayerDataMgr.getInstance();
    public ArcaneArmorTraining() {
        super("Arcane Armor Training", Type.COMBAT);
        setCanAcquire((mgr.hasFeat(new ArmorProficiencyLight())) && (mgr.player.info.level >= 3));
    }
}
