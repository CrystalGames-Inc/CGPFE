package CGPFE.God.Creation.ClassTable.Classes.Player.Inquisitor;

import CGPFE.God.Creation.ClassTable.Table;

public class CombatTable extends Table {
    public CombatTable(int level) {
        super(level);
        setLevel1( 1, 2, 0,2);
        setLevel2( 2, 3, 0,3);
        setLevel3( 3, 3, 1,3);
        setLevel4( 3, 4, 1,4);
        setLevel5( 4, 4, 1,4);
        setLevel6( 5, 5, 2,5);
        setLevel7( 6, 5, 2,5);
        setLevel8( 6, 6, 2,6);
        setLevel9( 7, 6, 3,6);
        setLevel10(8,7, 3,7);
        setLevel11(9,7, 3,7);
        setLevel12(9,8, 4,8);
        setLevel13(10,8, 4,8);
        setLevel14(11,9, 4,9);
        setLevel15(11,9, 5,9);
        setLevel16(12,10,5,10);
        setLevel17(12,10,5,10);
        setLevel18(13,11,6,11);
        setLevel19(14,11,6,11);
        setLevel20(15,12,6,12);
    }
}
