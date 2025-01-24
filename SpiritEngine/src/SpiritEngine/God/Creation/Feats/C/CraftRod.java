package SpiritEngine.God.Creation.Feats.C;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class CraftRod extends Feat {
    public CraftRod() {
        super("Craft Rod", Type.ITEMCREATION);
        setCanAcquire(PlayerDataMgr.getInstance().player.info.level >= 9);
    }
}
