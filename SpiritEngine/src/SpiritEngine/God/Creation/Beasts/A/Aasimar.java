package SpiritEngine.God.Creation.Beasts.A;

import SpiritEngine.Data.Storage.Equipment.Weapons.Weapons;
import SpiritEngine.God.Creation.Beasts._Beast.Beast;
import SpiritEngine.God.Creation.Beasts._Beast.Properties.*;
import SpiritEngine.God.Creation.Entity.Attributes;
import SpiritEngine.God.Creation.Importance.Constants.Alignment;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Race;
import SpiritEngine.God.Creation.Importance.Constants.Size;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.GameFeats;
import SpiritEngine.God.Creation.Importance.Skill.GameSkills;
import SpiritEngine.God.Creation.Importance.Skill.Skill;

public class Aasimar extends Beast {
    public Aasimar() {
        super(
            new Info(
                "Aasimar",
                0.5,
                200,
                Race.HUMAN,
                Class.CLERIC,
                1,
                Alignment.NEUTRALGOOD,
                Size.MEDIUM,
                Type.OUTSIDER,
                0
            ),
            new Defense(
            15,
            10,
            15,
            11,
            4,
            0,
            5
            ),
            new Offense(Weapons.heavyMace, Weapons.lightCrossbow),
            new Statistics(
                    0,
                    -1,
                    9,
                    new Ecology(Terrain.ANY)
            ),
            new Attributes(
                    8,
                    10,
                    14,
                    13,
                    17,
                    14,
                    30
            )
        );


        info.skills = new Skill[]{
                GameSkills.diplomacy,
                GameSkills.heal,
                GameSkills.knowReligion
        };

        info.feats = new Feat[]{
                GameFeats.turnUndead
        };

    }
}
