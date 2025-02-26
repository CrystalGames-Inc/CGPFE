package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class GreaterGrapple extends Feat {
    public GreaterGrapple() {
        super("Greater Grapple", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new CombatExpertise())) && (PlayerDataMgr.getInstance().hasFeat(new ImprovedUnarmedStrike())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 6) && (PlayerDataMgr.getInstance().player.attributes.dexterity >= 13));
    }
}
