package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class Spellbreaker extends Feat {
    public Spellbreaker() {
        super("Spellbreaker", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new Disruptive())) && (PlayerDataMgr.getInstance().player.info.level >= 10));
    }
}
