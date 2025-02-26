package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class GreaterFeint extends Feat {
    public GreaterFeint() {
        super("Greater Feint", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new CombatExpertise())) && (PlayerDataMgr.getInstance().hasFeat(new ImprovedFeint())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 6) && (PlayerDataMgr.getInstance().player.attributes.intelligence >= 13));
    }
}
