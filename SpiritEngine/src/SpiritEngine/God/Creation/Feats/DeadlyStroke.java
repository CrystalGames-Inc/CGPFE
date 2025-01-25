package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class DeadlyStroke extends Feat {
    PlayerDataMgr mgr = PlayerDataMgr.getInstance();
    public DeadlyStroke() {
        super("Deadly Stroke", Type.COMBAT);
        setCanAcquire((mgr.hasFeat(new DazzlingDisplay())) && (mgr.hasFeat(new GreaterWeaponFocus())) && (mgr.hasFeat(new ShatterDefenses())) && (mgr.hasFeat(new WeaponFocus())) && (mgr.player.combatInfo.BAB >= 11));
    }
}
