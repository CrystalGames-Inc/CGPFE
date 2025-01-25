package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class ShieldMaster extends Feat {
    public ShieldMaster() {
        super("Shield Master", Type.COMBAT);
        setCanAcquire(
                (PlayerDataMgr.getInstance().hasFeat(new ImprovedShieldBash())) &&
                (PlayerDataMgr.getInstance().hasFeat(new ShieldProficiency())) &&
                (PlayerDataMgr.getInstance().hasFeat(new ShieldSlam())) &&
                (PlayerDataMgr.getInstance().hasFeat(new TwoWeaponFighting())) &&
                (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 11)
        );
    }
}
