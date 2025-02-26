package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Constants.Class;
import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class GreaterWeaponSpecialization extends Feat {
    public GreaterWeaponSpecialization() {
        super("Greater Weapon Specialization", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.info.level >= 12) && (PlayerDataMgr.getInstance().player.info.pClass == Class.FIGHTER));
    }
}
