package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class BrewPotion extends Feat {
    public BrewPotion() {
        super("Brew Potion", Type.ITEMCREATION);
        setCanAcquire(PlayerDataMgr.getInstance().player.info.level >= 3);
    }
}
