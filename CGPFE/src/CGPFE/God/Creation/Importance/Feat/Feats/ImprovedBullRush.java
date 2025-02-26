package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class ImprovedBullRush extends Feat {
    public ImprovedBullRush() {
        super("Improved Bull Rush", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.strength >= 13) && (PlayerDataMgr.getInstance().hasFeat(new PowerAttack())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 1));
    }
}
