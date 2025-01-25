package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class Trample extends Feat {
    public Trample() {
        super("Trample", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new MountedCombat()));
    }
}
