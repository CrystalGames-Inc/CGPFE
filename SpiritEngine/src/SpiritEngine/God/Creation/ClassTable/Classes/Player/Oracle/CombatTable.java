package SpiritEngine.God.Creation.ClassTable.Classes.Player.Oracle;

import SpiritEngine.God.Creation.ClassTable.Table;

public class CombatTable extends Table {
    public CombatTable(int level) {
        super(level);
        setLevel1( 1, 0, 0,2);
        setLevel2( 2, 0, 0,3);
        setLevel3( 3, 1, 1,3);
        setLevel4( 3, 1, 1,4);
        setLevel5( 4, 1, 1,4);
        setLevel6( 5, 2, 2,5);
        setLevel7( 6, 2, 2,5);
        setLevel8( 6, 2, 2,6);
        setLevel9( 7, 3, 3,6);
        setLevel10(8,3, 3,7);
        setLevel11(9,3, 3,7);
        setLevel12(9,4, 4,8);
        setLevel13(10,4, 4,8);
        setLevel14(11,4, 4,9);
        setLevel15(11,5, 5,9);
        setLevel16(12,5,5,10);
        setLevel17(12,5,5,10);
        setLevel18(13,6,6,11);
        setLevel19(14,6,6,11);
        setLevel20(15,6,6,12);
    }
}
