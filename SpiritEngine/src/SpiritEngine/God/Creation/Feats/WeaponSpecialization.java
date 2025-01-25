package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class WeaponSpecialization extends Feat {
    public WeaponSpecialization() {
        super("Weapon Specialization", Type.COMBAT);
        setCanAcquire(
                (PlayerDataMgr.getInstance().hasFeat(new WeaponFocus())) &&
                (PlayerDataMgr.getInstance().player.info.pClass == Class.FIGHTER) &&
                (PlayerDataMgr.getInstance().player.info.level >= 4)
        );
    }
}
