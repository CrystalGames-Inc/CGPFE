package CGPFE.God.Creation.Beasts.A;

import CGPFE.God.Creation.Beasts._Beast.Beast;
import CGPFE.God.Creation.Beasts._Beast.Properties.*;
import CGPFE.God.Creation.Entity.Attributes;
import CGPFE.God.Creation.Importance.Constants.Alignment;
import CGPFE.God.Creation.Importance.Constants.Class;
import CGPFE.God.Creation.Importance.Constants.Race;
import CGPFE.God.Creation.Importance.Constants.Size;

public class Aboleth extends Beast {
    public Aboleth() {
        super(
                new Info(
                        "Aboleth",
                        7,
                        3200,
                        Race.NONE,
                        Class.NONE,
                        10,
                        Alignment.LAWFULEVIL,
                        Size.HUGE,
                        Type.ABERRATION,
                        5
                ),
                new Defense(
                        20,
                        9,
                        19,
                        84,
                        8,
                        5,
                        11
                ),
                new Offense(
                        null,
                        null
                ),
                new Statistics(
                        6,
                        13,
                        24,
                        new Ecology(
                                Terrain.ANY
                        )
                ),
                new Attributes(
                        20,
                        12,
                        22,
                        15,
                        17,
                        17,
                        10
                )
        );
    }
}
