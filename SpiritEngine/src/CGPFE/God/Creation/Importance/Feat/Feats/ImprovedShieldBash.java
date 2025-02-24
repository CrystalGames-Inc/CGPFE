package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class ImprovedShieldBash extends Feat {
    public ImprovedShieldBash() {
        super("Improved Shield Bash", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new ShieldProficiency()));
    }
}
