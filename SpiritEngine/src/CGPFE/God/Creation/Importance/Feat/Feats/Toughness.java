package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.Management.PlayerDataMgr;

public class Toughness extends Feat {
    public Toughness() {
        super("Toughness");
        setCanAcquire(true);
        setCheckModifiers(PlayerDataMgr.getInstance().player.info.health, 2);
        setCheckModifiers(PlayerDataMgr.getInstance().player.info.maxHealth, 2);
    }
}
