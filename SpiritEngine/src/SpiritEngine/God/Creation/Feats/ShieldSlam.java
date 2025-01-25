package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class ShieldSlam extends Feat {
    public ShieldSlam() {
        super("Shield Slam", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new ImprovedShieldBash())) &&
        (PlayerDataMgr.getInstance().hasFeat(new ShieldProficiency())) &&
        (PlayerDataMgr.getInstance().hasFeat(new TwoWeaponFighting())) &&
        (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 6)
        );
    }
}
