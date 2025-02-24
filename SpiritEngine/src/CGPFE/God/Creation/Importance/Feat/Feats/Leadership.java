package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.Management.PlayerDataMgr;

public class Leadership extends Feat {
    public Leadership() {
        super("Leadership");
        setCanAcquire(PlayerDataMgr.getInstance().player.info.level >= 7);
    }
}
