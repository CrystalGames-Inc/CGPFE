package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class RapidShot extends Feat {
    public RapidShot() {
        super("Rapid Shot");
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.dexterity >= 13) && (PlayerDataMgr.getInstance().hasFeat(new PointBlankShot())));
    }
}
