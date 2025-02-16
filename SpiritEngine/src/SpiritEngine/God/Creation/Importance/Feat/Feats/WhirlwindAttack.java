package SpiritEngine.God.Creation.Importance.Feat.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class WhirlwindAttack extends Feat {
    public WhirlwindAttack() {
        super("Whirlwind Attack", Type.COMBAT);
        setCanAcquire(
                (PlayerDataMgr.getInstance().player.attributes.dexterity >= 13) &&
                (PlayerDataMgr.getInstance().player.attributes.intelligence >= 13) &&
                (PlayerDataMgr.getInstance().hasFeat(new CombatExpertise()) &&
                (PlayerDataMgr.getInstance().hasFeat(new SpringAttack())))
        );
    }
}
