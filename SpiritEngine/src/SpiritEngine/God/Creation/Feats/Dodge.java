package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class Dodge extends Feat {
    public Dodge() {
        super("Dodge", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().player.attributes.dexterity >= 13);
        if(hasFeat()){
            PlayerDataMgr.getInstance().player.combatInfo.AC++;
        }
    }
}
