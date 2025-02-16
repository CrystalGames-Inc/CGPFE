package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

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
