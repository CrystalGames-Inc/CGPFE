package Engine.Game.Data.Storage.God.Creation.GameFeats;

import Engine.Game.Data.Models.God.Creation.Feat.Feat;

public class ArcaneArmorTraining extends Feat {
    public ArcaneArmorTraining(){
        setName("Arcane Armor Training");
        setCombatFeat(true);
        setDepFeat(new ArmorProficiencyL());
    }
}
