package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class LightningStance extends Feat {
    public LightningStance() {
        super("Lightning Stance", Type.COMBAT);
        setCanAcquire(
                (PlayerDataMgr.getInstance().player.attributes.dexterity >= 17) &&
                (PlayerDataMgr.getInstance().hasFeat(new Dodge())) &&
                (PlayerDataMgr.getInstance().hasFeat(new WindStance())) &&
                (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 11)
        );
    }
}
