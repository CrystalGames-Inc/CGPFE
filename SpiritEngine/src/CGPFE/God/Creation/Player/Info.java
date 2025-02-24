package CGPFE.God.Creation.Player;

import CGPFE.God.Creation.Importance.Feat.Feat;
import CGPFE.God.Creation.Importance.Constants.Class;
import CGPFE.God.Creation.Importance.Constants.*;

import java.util.ArrayList;
import java.util.List;

public class Info {
    public String name;
    public Gender gender;
    public Alignment alignment;
    public int age;
    public Race race;
    public Size size;
    public int sizeMod;
    public Class pClass;
    public int level;
    public int xp;
    public int maxHealth;
    public int health;
    public PlayerSkill[] playerSkills;
    public List<Feat> feats = new ArrayList<>();

    public Info(String name, Gender gender, Alignment alignment, int age, Race race, Size size, Class pClass, int level, int xp, int maxHealth, int health, PlayerSkill[] playerSkills){
        this.name = name;
        this.gender = gender;
        this.alignment = alignment;
        this.age = age;
        this.race = race;
        this.size = size;
        this.pClass = pClass;
        this.level = level;
        this.xp = xp;
        this.maxHealth = maxHealth;
        this.health = health;
        this.playerSkills = playerSkills;
    }
}
