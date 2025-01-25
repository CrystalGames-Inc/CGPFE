package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class Spellbreaker extends Feat {
    public Spellbreaker() {
        super("Spellbreaker", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new Disruptive())) && (PlayerDataMgr.getInstance().player.info.level >= 10));
    }
}
