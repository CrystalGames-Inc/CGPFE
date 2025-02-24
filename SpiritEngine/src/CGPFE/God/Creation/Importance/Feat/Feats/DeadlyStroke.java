package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class DeadlyStroke extends Feat {
    PlayerDataMgr mgr = PlayerDataMgr.getInstance();
    public DeadlyStroke() {
        super("Deadly Stroke", Type.COMBAT);
        setCanAcquire((mgr.hasFeat(new DazzlingDisplay())) && (mgr.hasFeat(new GreaterWeaponFocus())) && (mgr.hasFeat(new ShatterDefenses())) && (mgr.hasFeat(new WeaponFocus())) && (mgr.player.combatInfo.BAB >= 11));
    }
}
