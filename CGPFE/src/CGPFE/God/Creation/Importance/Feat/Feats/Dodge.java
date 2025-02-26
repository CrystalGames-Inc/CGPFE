package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class Dodge extends Feat {
    public Dodge() {
        super("Dodge", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().player.attributes.dexterity >= 13);
        if(hasFeat()){
            PlayerDataMgr.getInstance().player.combatInfo.AC++;
        }
    }
}
