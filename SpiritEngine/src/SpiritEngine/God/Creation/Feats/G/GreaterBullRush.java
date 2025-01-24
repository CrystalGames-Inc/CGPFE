package SpiritEngine.God.Creation.Feats.G;

import SpiritEngine.God.Creation.Feats.I.ImprovedBullRush;
import SpiritEngine.God.Creation.Feats.P.PowerAttack;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class GreaterBullRush extends Feat {
    public GreaterBullRush() {
        super("Greater Bull Rush", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new ImprovedBullRush())) && (PlayerDataMgr.getInstance().hasFeat(new PowerAttack())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 6) && (PlayerDataMgr.getInstance().player.attributes.strength >= 13));
    }
}
