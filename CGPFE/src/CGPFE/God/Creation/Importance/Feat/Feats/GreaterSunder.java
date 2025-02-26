package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class GreaterSunder extends Feat {
    public GreaterSunder() {
        super("Greater Sunder", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new ImprovedSunder())) && (PlayerDataMgr.getInstance().hasFeat(new PowerAttack())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 6) && (PlayerDataMgr.getInstance().player.attributes.strength >= 13));
    }
}
