package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class CraftStaff extends Feat {
    public CraftStaff() {
        super("Craft Staff", Type.ITEMCREATION);
        setCanAcquire(PlayerDataMgr.getInstance().player.info.level >= 11);
    }
}
