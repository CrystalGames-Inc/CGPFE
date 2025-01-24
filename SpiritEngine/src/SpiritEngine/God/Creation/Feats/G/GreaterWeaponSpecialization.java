package SpiritEngine.God.Creation.Feats.G;

import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class GreaterWeaponSpecialization extends Feat {
    public GreaterWeaponSpecialization() {
        super("Greater Weapon Specialization", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.info.level >= 12) && (PlayerDataMgr.getInstance().player.info.pClass == Class.FIGHTER));
    }
}
