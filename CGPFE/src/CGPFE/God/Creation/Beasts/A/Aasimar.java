package CGPFE.God.Creation.Beasts.A;

import CGPFE.Data.Storage.Equipment.Weapons.Weapons;
import CGPFE.God.Creation.Beasts._Beast.Beast;
import CGPFE.God.Creation.Beasts._Beast.Properties.*;
import CGPFE.God.Creation.Entity.Attributes;
import CGPFE.God.Creation.Importance.Constants.Alignment;
import CGPFE.God.Creation.Importance.Constants.Class;
import CGPFE.God.Creation.Importance.Constants.Race;
import CGPFE.God.Creation.Importance.Constants.Size;
import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Feat.GameFeats;
import CGPFE.God.Creation.Importance.Skill.GameSkills;
import CGPFE.God.Creation.Importance.Skill.Skill;

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
