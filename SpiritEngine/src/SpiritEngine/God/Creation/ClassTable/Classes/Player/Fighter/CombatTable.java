package SpiritEngine.God.Creation.ClassTable.Classes.Player.Fighter;

import SpiritEngine.God.Creation.ClassTable.Table;

public class CombatTable extends Table {
    public CombatTable(int level){
        super(level);
        setLevel1(1, 2, 0,0);
        setLevel2(2, 3, 0,0);
        setLevel3(3, 3, 1,1);
        setLevel4(4, 4, 1,1);
        setLevel5(5, 4, 1,1);
        setLevel6(6, 5, 2,2);
        setLevel7(7, 5, 2,2);
        setLevel8(8, 6, 2,2);
        setLevel9(9, 6, 3,3);
        setLevel10(10,7, 3,3);
        setLevel11(11,7, 3,3);
        setLevel12(12,8, 4,4);
        setLevel13(13,8, 4,4);
        setLevel14(14,9, 4,4);
        setLevel15(15,9, 5,5);
        setLevel16(16,10,5,5);
        setLevel17(17,10,5,5);
        setLevel18(18,11,6,6);
        setLevel19(19,11,6,6);
        setLevel20(20,12,6,6);
    }
}
