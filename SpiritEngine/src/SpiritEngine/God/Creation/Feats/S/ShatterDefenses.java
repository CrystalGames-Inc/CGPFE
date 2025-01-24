package SpiritEngine.God.Creation.Feats.S;

import SpiritEngine.God.Creation.Feats.D.DazzlingDisplay;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class ShatterDefenses extends Feat {
    public ShatterDefenses() {
        super("Shatter Defenses", Type.COMBAT);
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new WeaponFocus()) && (PlayerDataMgr.getInstance().hasFeat(new DazzlingDisplay())) && (PlayerDataMgr.getInstance().player.combatInfo.BAB >= 6));
    }
}
