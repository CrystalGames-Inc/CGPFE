package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class TwoWeaponDefense extends Feat {
    public TwoWeaponDefense() {
        super("Two-Weapon Defense", Type.COMBAT);
        setCanAcquire(
                (PlayerDataMgr.getInstance().player.attributes.dexterity >= 15) &&
                (PlayerDataMgr.getInstance().hasFeat(new TwoWeaponFighting()))
        );
    }
}
