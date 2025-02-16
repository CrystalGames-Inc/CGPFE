package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

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
