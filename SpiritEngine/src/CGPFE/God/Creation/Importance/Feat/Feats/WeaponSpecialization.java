package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Constants.Class;
import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

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
