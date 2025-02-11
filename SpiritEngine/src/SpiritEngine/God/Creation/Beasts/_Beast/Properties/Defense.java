package SpiritEngine.God.Creation.Beasts._Beast.Properties;

public class Defense {
    public final int ac; //Armor Class
    public final int touch;
    public final int flatFooted;
    public final int maxHp;
    public int hp;

    public final int fort; //Fortitude
    public final int ref; //Reflex
    public final int will;

    public Defense(int ac, int touch, int flatFooted, int maxHp, int fort, int ref, int will) {
        this.ac = ac;
        this.touch = touch;
        this.flatFooted = flatFooted;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.fort = fort;
        this.ref = ref;
        this.will = will;
    }
}