package CGPFE.God.Creation.Beasts._Beast;

import CGPFE.God.Creation.Beasts._Beast.Properties.*;
import CGPFE.God.Creation.Entity.Attributes;

public class Beast {

    public final Info info;


    public Defense defense;

    public Offense offense;

    public Statistics statistics;

    public Attributes attributes;

    public Beast(Info info, Defense defense, Offense offense, Statistics statistics, Attributes attributes) {
        this.info = info;
        this.defense = defense;
        this.offense = offense;
        this.statistics = statistics;
        this.attributes = attributes;
    }

    //Its size is equal to the number of skills the entity has
    int[] setSkillBonuses(int[] bonuses){
        return bonuses;
    }
}