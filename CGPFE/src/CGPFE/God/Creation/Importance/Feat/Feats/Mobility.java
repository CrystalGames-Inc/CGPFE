package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class Mobility extends Feat {
    public Mobility() {
        super("Mobility", Type.COMBAT);
        setCanAcquire(
                PlayerDataMgr.getInstance().player.attributes.dexterity >= 13 &&
                PlayerDataMgr.getInstance().hasFeat(new Dodge())
        );
        setCheckModifiers(PlayerDataMgr.getInstance().player.combatInfo.AC, 2);
    }
}
