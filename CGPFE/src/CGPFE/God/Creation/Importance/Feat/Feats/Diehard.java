package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.Management.PlayerDataMgr;

public class Diehard extends Feat {
    public Diehard() {
        super("Diehard");
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new Endurance()));
    }
}
