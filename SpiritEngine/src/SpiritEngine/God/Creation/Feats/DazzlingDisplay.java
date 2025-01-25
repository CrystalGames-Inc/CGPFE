package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class DazzlingDisplay extends Feat {
    public DazzlingDisplay() {
        super("Dazzling Display");
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new CriticalFocus()));
    }
}
