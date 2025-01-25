package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class ScribeScroll extends Feat {
    public ScribeScroll() {
        super("Scribe Scroll", Type.ITEMCREATION);
        setCanAcquire(PlayerDataMgr.getInstance().player.info.level >= 1);
    }
}
