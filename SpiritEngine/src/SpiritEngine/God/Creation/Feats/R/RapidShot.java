package SpiritEngine.God.Creation.Feats.R;

import SpiritEngine.God.Creation.Feats.P.PointBlankShot;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class RapidShot extends Feat {
    public RapidShot() {
        super("Rapid Shot");
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.dexterity >= 13) && (PlayerDataMgr.getInstance().hasFeat(new PointBlankShot())));
    }
}
