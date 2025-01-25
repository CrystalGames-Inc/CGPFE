package SpiritEngine.Data.Storage.Equipment.Armor;

import SpiritEngine.Data.Models.Items.Constants.Weight;
import SpiritEngine.Data.Models.Items.Equipment.Armor.Armor;

public final class Armors {

    //region Light Armor

    public final Armor paddedArmor = new Armor("Padded Armor", Weight.LIGHT,5, 1,8,0,5,new int[]{30, 20}, 10);
    public final Armor leatherArmor = new Armor("Leather Armor",Weight.LIGHT,10,2,6,0,10,new int[]{30,20},15);
    public final Armor studdedLeatherArmor = new Armor("Studded Leather Armor",Weight.LIGHT,25,3,5,-1,15, new int[]{30,20},20);
    public final Armor chainShirtArmor = new Armor("Chain Shirt Armor",Weight.LIGHT,100,4,4,-2,20,new int[]{30,20},25);

    public final Armor[] lightArmor = new Armor[]{
            paddedArmor,
            leatherArmor,
            studdedLeatherArmor,
            chainShirtArmor
    };

    //endregion

    //region Medium Armor

    public final Armor hideArmor = new Armor("Hide Armor",Weight.MEDIUM,15,4,4,-3,20,new int[]{20,15},25);
    public final Armor scaleMailArmor = new Armor("Scale Mail Armor",Weight.MEDIUM,50,5,3,-4,25,new int[]{20,15},30);
    public final Armor chainmailArmor = new Armor("Chainmail Armor",Weight.MEDIUM,150,6,2,-5,30, new int[]{20,15},40);
    public final Armor breastplate = new Armor("Breastplate",Weight.MEDIUM,200,6,3,-4,25,new int[]{20,15}, 30);

    public final Armor[] mediumArmor = new Armor[]{
            hideArmor,
            scaleMailArmor,
            chainmailArmor,
            breastplate
    };

    //endregion

    //region Heavy Armor

    public final Armor splintMail = new Armor("Splint Mail Armor",Weight.HEAVY, 200,7,0,-7,40,new int[]{20,15},45);
    public final Armor bandedMail = new Armor("Banded Mail Armor", Weight.HEAVY,250,7,1,-6,35,new int[]{20,15},35);
    public final Armor halfPlateArmor = new Armor("Half-Plate Armor", Weight.HEAVY,600,8,0,-7,40, new int[]{20,15}, 50);
    public final Armor fullPlateArmor = new Armor("Full Plate Armor", Weight.HEAVY,1500,9,1,-6,35,new int[]{20,15},50);

    public final Armor[] heavyArmor = new Armor[]{
            splintMail,
            bandedMail,
            halfPlateArmor,
            fullPlateArmor
    };

    //endregion

}
