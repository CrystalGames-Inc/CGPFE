package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class BrewPotion extends Feat {
    public BrewPotion() {
        super("Brew Potion", Type.ITEMCREATION);
        setCanAcquire(PlayerDataMgr.getInstance().player.info.level >= 3);
    }
}
