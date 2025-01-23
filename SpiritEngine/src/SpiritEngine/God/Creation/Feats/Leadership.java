package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class Leadership extends Feat {
    public Leadership() {
        super("Leadership");
        setCanAcquire(PlayerDataMgr.getInstance().player.info.level >= 7);
    }
}
