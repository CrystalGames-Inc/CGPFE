package God.Creation.Entity.Mandatory;

public class EntityInfo {
    public String Name;
    public int Level;
    public int MaxHealth;
    public int Health;

    public EntityInfo(String name, int level, int maxHealth, int health){
        Name = name;
        Level = level;
        MaxHealth = maxHealth;
        Health = health;
    }
}
