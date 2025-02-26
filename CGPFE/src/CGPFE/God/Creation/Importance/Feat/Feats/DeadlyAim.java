package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.Management.PlayerDataMgr;

public class DeadlyAim extends Feat {
    public DeadlyAim() {
        super("Deadly Aim");
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.dexterity >= 13) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 1));
    }
}
