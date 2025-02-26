package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class ScorpionStyle extends Feat {
    public ScorpionStyle() {
        super("Scorpion Style", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new ImprovedUnarmedStrike()));
    }
}
