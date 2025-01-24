package SpiritEngine.God.Creation.Feats.G;

import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class GreaterWeaponFocus extends Feat {
    public GreaterWeaponFocus() {
        super("Greater Weapon Focus", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.info.level >= 8) && (PlayerDataMgr.getInstance().player.info.pClass == Class.FIGHTER));
    }
}
