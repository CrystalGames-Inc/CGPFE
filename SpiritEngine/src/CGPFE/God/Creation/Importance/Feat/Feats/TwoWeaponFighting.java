package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class TwoWeaponFighting extends Feat {
    public TwoWeaponFighting() {
        super("Two-Weapon Fighting", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().player.attributes.dexterity >= 15);
    }
}
