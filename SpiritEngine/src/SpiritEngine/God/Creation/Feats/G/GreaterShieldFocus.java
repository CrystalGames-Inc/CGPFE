package SpiritEngine.God.Creation.Feats.G;

import SpiritEngine.God.Creation.Feats.S.ShieldFocus;
import SpiritEngine.God.Creation.Feats.S.ShieldProficiency;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.Type;
import SpiritEngine.Management.PlayerDataMgr;

public class GreaterShieldFocus extends Feat {
    public GreaterShieldFocus() {
        super("Greater Shield Focus", Type.COMBAT);
        setCanAcquire((PlayerDataMgr.getInstance().hasFeat(new ShieldFocus())) && (PlayerDataMgr.getInstance().hasFeat(new ShieldProficiency())) && (PlayerDataMgr.getInstance().player.info.pClass == Class.FIGHTER) && (PlayerDataMgr.getInstance().player.info.level >= 8));
    }
}
