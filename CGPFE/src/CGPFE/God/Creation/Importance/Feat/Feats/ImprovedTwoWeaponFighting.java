package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class ImprovedTwoWeaponFighting extends Feat {
    public ImprovedTwoWeaponFighting() {
        super("Improved Two-Weapon Fighting", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.dexterity >= 17) && (PlayerDataMgr.getInstance().hasFeat(new TwoWeaponFighting())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 6));
    }
}
