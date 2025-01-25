package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class DeadlyAim extends Feat {
    public DeadlyAim() {
        super("Deadly Aim");
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.dexterity >= 13) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 1));
    }
}
