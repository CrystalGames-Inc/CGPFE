package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class DoubleSlice extends Feat {
    public DoubleSlice() {
        super("Double Slice", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.dexterity >= 15) && (PlayerDataMgr.getInstance().hasFeat(new TwoWeaponFighting())));
    }
}
