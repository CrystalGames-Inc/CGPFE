package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class GorgonsStrike extends Feat {
    public GorgonsStrike() {
        super("Gorgon's Strike", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new ImprovedUnarmedStrike())) && (PlayerDataMgr.getInstance().hasFeat(new ScorpionStyle())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 6));
    }
}
