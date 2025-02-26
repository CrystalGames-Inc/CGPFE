package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class Lunge extends Feat {
    public Lunge() {
        super("Lunge", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().player.combatInfo.BAB >= 6);
    }
}
