package Engine.God.Creation.Player;

import Engine.Game.Data.Models.God.Creation.Skill.Skill;
import Engine.God.Creation.Importance.Constants.Class;
import Engine.God.Creation.Importance.Constants.*;

public class PlayerInfo {
    public String name;
    public Gender gender;
    public Alignment alignment;
    public int age;
    public Race race;
    public Class pClass;
    public int level;
    public int xp;
    public int maxHealth;
    public int health;
    public Skill[] skills;

    public PlayerInfo(String name, Gender gender, Alignment alignment, int age, Race race, Class pClass, int level, int xp, int maxHealth, int health, Skill[] skills){
        this.name = name;
        this.gender = gender;
        this.alignment = alignment;
        this.age = age;
        this.race = race;
        this.pClass = pClass;
        this.level = level;
        this.xp = xp;
        this.maxHealth = maxHealth;
        this.health = health;
        this.skills = skills;
    }
}
