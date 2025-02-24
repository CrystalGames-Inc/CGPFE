package CGPFE.God.Creation.Beasts._Beast.Properties;

import CGPFE.God.Creation.Importance.Constants.Language;
import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Skill.Skill;

public class Statistics {
    public int bab; //Base Attack Bonus
    public int cmb; //Combat Maneuver Bonus
    public int cmd; //Combat Maneuver Defense
    public Feat[] feats;
    public Skill[] skills;
    public Language[] languages;

    public final Ecology ecology;

    public Statistics(int bab, int cmb, int cmd, Ecology ecology) {
        this.bab = bab;
        this.cmb = cmb;
        this.cmd = cmd;
        this.ecology = ecology;
    }
}
