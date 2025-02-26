package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class GreaterTwoWeaponFighting extends Feat {
    public GreaterTwoWeaponFighting() {
        super("Greater Two-Weapon Fighting", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().player.attributes.dexterity >= 19) && (PlayerDataMgr.getInstance().hasFeat(new ImprovedTwoWeaponFighting())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 11));
    }
}
