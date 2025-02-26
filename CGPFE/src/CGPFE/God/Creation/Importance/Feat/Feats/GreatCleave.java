package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class GreatCleave extends Feat {
    public GreatCleave() {
        super("Great Cleave", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.strength >= 13) && (PlayerDataMgr.getInstance().hasFeat(new Cleave())) && (PlayerDataMgr.getInstance().hasFeat(new PowerAttack())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 4));
    }
}
