package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class ImprovedPreciseShot extends Feat {
    public ImprovedPreciseShot() {
        super("Improved Precise Shot", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.dexterity >= 19) && (PlayerDataMgr.getInstance().hasFeat(new PointBlankShot())) && (PlayerDataMgr.getInstance().hasFeat(new PreciseShot())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 11));
    }
}
