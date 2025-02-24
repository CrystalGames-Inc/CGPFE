package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class ShieldFocus extends Feat {
    public ShieldFocus() {
        super("Shield Focus", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new ShieldProficiency()) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 1));
        setCheckModifiers(PlayerDataMgr.getInstance().player.combatInfo.AC, 2);
    }
}
