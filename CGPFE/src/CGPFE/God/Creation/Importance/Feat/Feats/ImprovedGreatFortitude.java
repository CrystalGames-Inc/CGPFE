package CGPFE.God.Creation.Importance.Feat.Feats;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.Management.PlayerDataMgr;

public class ImprovedGreatFortitude extends Feat {
    public ImprovedGreatFortitude() {
        super("Improved Great Fortitude");
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new GreatFortitude()));
    }
}
