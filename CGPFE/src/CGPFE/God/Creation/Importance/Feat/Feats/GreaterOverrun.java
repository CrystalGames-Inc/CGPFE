package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class GreaterOverrun extends Feat {
    public GreaterOverrun() {
        super("Greater Overrun", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new ImprovedOverrun())) && (PlayerDataMgr.getInstance().hasFeat(new PowerAttack())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 6) && (PlayerDataMgr.getInstance().player.attributes.strength >= 13));
    }
}
