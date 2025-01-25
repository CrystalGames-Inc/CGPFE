package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class GreaterGrapple extends Feat {
    public GreaterGrapple() {
        super("Greater Grapple", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new CombatExpertise())) && (PlayerDataMgr.getInstance().hasFeat(new ImprovedUnarmedStrike())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 6) && (PlayerDataMgr.getInstance().player.attributes.dexterity >= 13));
    }
}
