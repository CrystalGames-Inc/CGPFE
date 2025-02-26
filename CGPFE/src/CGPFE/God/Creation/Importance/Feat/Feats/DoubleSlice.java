package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class DoubleSlice extends Feat {
    public DoubleSlice() {
        super("Double Slice", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.dexterity >= 15) && (PlayerDataMgr.getInstance().hasFeat(new TwoWeaponFighting())));
    }
}
