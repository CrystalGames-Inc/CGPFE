package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class TowerShieldProficiency extends Feat {
    public TowerShieldProficiency() {
        super("Tower Shield Proficiency", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new ShieldProficiency()));
    }
}
