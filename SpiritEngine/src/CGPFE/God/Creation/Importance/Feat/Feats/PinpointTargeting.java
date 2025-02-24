package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class PinpointTargeting extends Feat {
    public PinpointTargeting() {
        super("Pinpoint Targeting", Type.COMBAT);
        setCanAcquire(
                PlayerDataMgr.getInstance().player.attributes.dexterity >= 19 &&
                PlayerDataMgr.getInstance().hasFeat(new ImprovedPreciseShot()) &&
                PlayerDataMgr.getInstance().hasFeat(new PointBlankShot()) &&
                PlayerDataMgr.getInstance().player.combatInfo.BAB >= 16
        );
    }
}
