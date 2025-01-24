package SpiritEngine.God.Creation.Feats.S;

import SpiritEngine.God.Creation.Feats.D.Dodge;
import SpiritEngine.God.Creation.Feats.M.Mobility;
import SpiritEngine.God.Creation.Feats.M.MountedCombat;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class SpringAttack extends Feat {
    public SpringAttack() {
        super("Spring Attack", Type.COMBAT);
        setCanAcquire(
                (PlayerDataMgr.getInstance().player.attributes.dexterity >= 13) &&
                (PlayerDataMgr.getInstance().hasFeat(new Dodge())) &&
                (PlayerDataMgr.getInstance().hasFeat(new Mobility())) &&
                (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 4)
        );
    }
}
