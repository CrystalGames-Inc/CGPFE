package Management.Player;

import God.Creation.Importance.Class;
import God.Creation.Importance.Race;

public class PlayerInfo {
    public String Name;
    public Race Race;
    public Class Class;
    public int Level;
    public int XP;
    public int MaxHealth;
    public int Health;

    public  PlayerInfo(String name, Race race, Class pClass, int level, int xp, int maxHealth, int health){
        Name = name;
        Race = race;
        Class = pClass;
        Level = level;
        XP = xp;
        MaxHealth = maxHealth;
        Health = health;
    }
}
