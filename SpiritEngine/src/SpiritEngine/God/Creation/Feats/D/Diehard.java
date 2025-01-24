package SpiritEngine.God.Creation.Feats.D;

import SpiritEngine.God.Creation.Feats.E.Endurance;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class Diehard extends Feat {
    public Diehard() {
        super("Diehard");
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new Endurance()));
    }
}
