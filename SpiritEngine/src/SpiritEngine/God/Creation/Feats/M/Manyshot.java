package SpiritEngine.God.Creation.Feats.M;

import SpiritEngine.God.Creation.Feats.P.PointBlankShot;
import SpiritEngine.God.Creation.Feats.R.RapidShot;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class Manyshot extends Feat {
    public Manyshot() {
        super("Manyshot", Type.COMBAT);
        setCanAcquire(
                (PlayerDataMgr.getInstance().player.attributes.dexterity >= 17) &&
                (PlayerDataMgr.getInstance().hasFeat(new PointBlankShot())) &&
                (PlayerDataMgr.getInstance().hasFeat(new RapidShot())) &&
                (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 6)
        );
    }
}
