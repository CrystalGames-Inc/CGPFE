package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class WindStance extends Feat {
    public WindStance() {
        super("Wind Stance", Type.COMBAT);
        setCanAcquire(
                (PlayerDataMgr.getInstance().player.attributes.dexterity >= 15) &&
                (PlayerDataMgr.getInstance().hasFeat(new Dodge())) &&
                (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 6)
        );
    }
}
