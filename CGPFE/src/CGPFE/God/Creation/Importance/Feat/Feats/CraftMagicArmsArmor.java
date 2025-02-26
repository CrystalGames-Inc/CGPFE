package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class CraftMagicArmsArmor extends Feat {
    public CraftMagicArmsArmor() {
        super("Craft Magic Arms and Armor", Type.ITEMCREATION);
        setCanAcquire(PlayerDataMgr.getInstance().player.info.level >= 5);
    }
}
