package SpiritEngine.God.Creation.Feats.D;

import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class Disruptive extends Feat {
    public Disruptive() {
        super("Disruptive", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.info.pClass == Class.FIGHTER) && (PlayerDataMgr.getInstance().player.info.level >= 6));
    }
}
