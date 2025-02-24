package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class Unseat extends Feat {
    public Unseat() {
        super("Unseat", Type.COMBAT);
        setCanAcquire(
                (PlayerDataMgr.getInstance().player.attributes.strength >= 13) &&
                (PlayerDataMgr.getInstance().hasFeat(new MountedCombat())) &&
                (PlayerDataMgr.getInstance().hasFeat(new PowerAttack())) &&
                (PlayerDataMgr.getInstance().hasFeat(new ImprovedBullRush())) &&
                (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 1)
        );
    }
}
