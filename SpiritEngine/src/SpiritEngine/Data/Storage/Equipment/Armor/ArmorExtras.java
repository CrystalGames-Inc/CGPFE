package SpiritEngine.Data.Storage.Equipment.Armor;

import SpiritEngine.Data.Models.Items.Equipment.Armor.ArmorExtra;

public final class ArmorExtras {

    private static ArmorExtras _instance;

    public static synchronized ArmorExtras getInstance(){
        if (_instance == null) {
            _instance = new ArmorExtras();
        }
        return _instance;
    }

    private ArmorExtras(){

    }

    public final ArmorExtra armorSpikes = new ArmorExtra("Armor Spikes", 50, 0,0,10);
    public final ArmorExtra lockedGauntlet = new ArmorExtra("Locked Gauntlet", 8,0,0,5);
    public final ArmorExtra shieldSpikes = new ArmorExtra("Shield Spikes", 10,0,0,5);
}
