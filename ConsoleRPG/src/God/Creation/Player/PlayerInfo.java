package God.Creation.Player;

import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Constants.Race;
import God.Creation.Importance.Skills.Skill;

public class PlayerInfo {
    public String Name;
    public Race Race;
    public Class Class;
    public int Level;
    public int XP;
    public int MaxHealth;
    public int Health;
    public Skill[] Skills;

    public  PlayerInfo(String name, Race race, Class pClass, int level, int xp, int maxHealth, int health, Skill[] skills){
        Name = name;
        Race = race;
        Class = pClass;
        Level = level;
        XP = xp;
        MaxHealth = maxHealth;
        Health = health;
        Skills = skills;
    }
}
