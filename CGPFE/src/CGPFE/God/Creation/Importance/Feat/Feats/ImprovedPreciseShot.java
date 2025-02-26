package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class ImprovedPreciseShot extends Feat {
    public ImprovedPreciseShot() {
        super("Improved Precise Shot", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.dexterity >= 19) && (PlayerDataMgr.getInstance().hasFeat(new PointBlankShot())) && (PlayerDataMgr.getInstance().hasFeat(new PreciseShot())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 11));
    }
}
