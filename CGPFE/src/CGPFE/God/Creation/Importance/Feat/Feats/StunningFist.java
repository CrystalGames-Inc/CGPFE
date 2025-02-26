package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class StunningFist extends Feat {
    public StunningFist() {
        super("Stunning Fist", Type.COMBAT);
        setCanAcquire(
                (PlayerDataMgr.getInstance().player.attributes.dexterity >= 13) &&
                (PlayerDataMgr.getInstance().player.attributes.wisdom >= 13) &&
                (PlayerDataMgr.getInstance().hasFeat(new ImprovedUnarmedStrike())) &&
                (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 8)
        );
    }
}
