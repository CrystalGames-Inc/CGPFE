package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class Toughness extends Feat {
    public Toughness() {
        super("Toughness");
        setCanAcquire(true);
        setCheckModifiers(PlayerDataMgr.getInstance().player.info.health, 2);
        setCheckModifiers(PlayerDataMgr.getInstance().player.info.maxHealth, 2);
    }
}
