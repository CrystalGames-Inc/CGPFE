package SpiritEngine.God.Creation.Feats;

import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.Management.PlayerDataMgr;

public class ImprovedGreatFortitude extends Feat {
    public ImprovedGreatFortitude() {
        super("Improved Great Fortitude");
        setCanAcquire(PlayerDataMgr.getInstance().hasFeat(new GreatFortitude()));
    }
}
