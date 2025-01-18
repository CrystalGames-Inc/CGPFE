package SpiritEngine.God.Creation.ClassTable.Classes.Player.Paladin;

import SpiritEngine.God.Creation.ClassTable.Table;

public class CombatTable extends Table {
    public CombatTable(int level){
        super(level);
        setLevel1(1,2,0,2);
        setLevel2(2,3,0,3);
        setLevel3(3,3,1,3);
        setLevel4(4,4,1,4);
        setLevel5(5,4,1,4);
        setLevel6(6,5,2,5);
        setLevel7(7,5,2,5);
        setLevel8(8,6,2,6);
        setLevel9(9,6,3,6);
        setLevel10(10,7,3,7);
        setLevel11(11,7,3,7);
        setLevel12(12,8,4,8);
        setLevel13(13,8,4,8);
        setLevel14(14,9,4,9);
        setLevel15(15,9,5,9);
        setLevel16(16,10,5,10);
        setLevel17(17,10,5,10);
        setLevel18(18,11,6,11);
        setLevel19(19,11,6,11);
        setLevel20(20,12,6,12);
    }
}