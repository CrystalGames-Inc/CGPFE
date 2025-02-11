package SpiritEngine.God.Creation.Beasts.A;

import SpiritEngine.Data.Models.Items.Equipment.Weapon.Weapon;
import SpiritEngine.God.Creation.Beasts._Beast.Beast;
import SpiritEngine.God.Creation.Beasts._Beast.Properties.*;
import SpiritEngine.God.Creation.Entity.Attributes;
import SpiritEngine.God.Creation.Importance.Constants.Alignment;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Race;
import SpiritEngine.God.Creation.Importance.Constants.Size;

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
            new Offense(
              null,
              null
            ),
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

    }
}
