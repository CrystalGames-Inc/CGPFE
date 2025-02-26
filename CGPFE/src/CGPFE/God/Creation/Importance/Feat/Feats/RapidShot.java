package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.Management.PlayerDataMgr;

public class RapidShot extends Feat {
    public RapidShot() {
        super("Rapid Shot");
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.dexterity >= 13) && (PlayerDataMgr.getInstance().hasFeat(new PointBlankShot())));
    }
}
