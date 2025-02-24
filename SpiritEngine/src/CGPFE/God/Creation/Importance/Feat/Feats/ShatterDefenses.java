package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class ShatterDefenses extends Feat {
    public ShatterDefenses() {
        super("Shatter Defenses", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new WeaponFocus()) && (PlayerDataMgr.getInstance().hasFeat(new DazzlingDisplay())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 6));
    }
}
