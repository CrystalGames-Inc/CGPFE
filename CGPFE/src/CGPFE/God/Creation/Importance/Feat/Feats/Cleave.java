package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class Cleave extends Feat {
    public Cleave() {
        super("Cleave", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().player.attributes.strength >= 13 && PlayerDataMgr.getInstance().hasFeat(new PowerAttack()) && PlayerDataMgr.getInstance().player.combatInfo.BAB >= 1);
    }
}
