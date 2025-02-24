package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class TowerShieldProficiency extends Feat {
    public TowerShieldProficiency() {
        super("Tower Shield Proficiency", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new ShieldProficiency()));
    }
}
