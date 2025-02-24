package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

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
