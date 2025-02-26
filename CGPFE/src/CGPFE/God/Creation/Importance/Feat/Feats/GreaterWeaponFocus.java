package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Constants.Class;
import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class GreaterWeaponFocus extends Feat {
    public GreaterWeaponFocus() {
        super("Greater Weapon Focus", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.info.level >= 8) && (PlayerDataMgr.getInstance().player.info.pClass == Class.FIGHTER));
    }
}
