package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Constants.CMBCalcBonus;
import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.Type;
import CGPFE.Management.PlayerDataMgr;

public class AgileManeuvers extends Feat {
    public AgileManeuvers() {
        super("Agile Maneuvers", Type.COMBAT);
        setCanAcquire(true);
        if(PlayerDataMgr.getInstance().hasFeat(this)){
            PlayerDataMgr.getInstance().player.combatInfo.cmbCalcBonus = CMBCalcBonus.DEXTERITY;
        }
    }
}
