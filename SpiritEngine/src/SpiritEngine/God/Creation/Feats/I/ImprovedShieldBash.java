package SpiritEngine.God.Creation.Feats.I;

import SpiritEngine.God.Creation.Feats.S.ShieldProficiency;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class ImprovedShieldBash extends Feat {
    public ImprovedShieldBash() {
        super("Improved Shield Bash", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new ShieldProficiency()));
    }
}
