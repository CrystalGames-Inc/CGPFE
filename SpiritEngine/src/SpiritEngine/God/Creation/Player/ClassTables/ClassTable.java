package SpiritEngine.God.Creation.Player.ClassTables;

public class ClassTable {
    ClassTableRow level;
    ClassTableRow level1;
    ClassTableRow level2;
    ClassTableRow level3;
    ClassTableRow level4;
    ClassTableRow level5;
    ClassTableRow level6;
    ClassTableRow level7;
    ClassTableRow level8;
    ClassTableRow level9;
    ClassTableRow level10;
    ClassTableRow level11;
    ClassTableRow level12;
    ClassTableRow level13;
    ClassTableRow level14;
    ClassTableRow level15;
    ClassTableRow level16;
    ClassTableRow level17;
    ClassTableRow level18;
    ClassTableRow level19;
    ClassTableRow level20;

    public ClassTable(int level){
        switch (level){
            case 1 -> this.level = getLevel1();
            case 2 -> this.level = getLevel2();
            case 3 -> this.level = getLevel3();
            case 4 -> this.level = getLevel4();
            case 5 -> this.level = getLevel5();
            case 6 -> this.level = getLevel6();
            case 7 -> this.level = getLevel7();
            case 8 -> this.level = getLevel8();
            case 9 -> this.level = getLevel9();
            case 10 -> this.level = getLevel10();
            case 11 -> this.level = getLevel11();
            case 12 -> this.level = getLevel12();
            case 13 -> this.level = getLevel13();
            case 14 -> this.level = getLevel14();
            case 15 -> this.level = getLevel15();
            case 16 -> this.level = getLevel16();
            case 17 -> this.level = getLevel17();
            case 18 -> this.level = getLevel18();
            case 19 -> this.level = getLevel19();
            case 20 -> this.level = getLevel20();
        }
    }

    public void setLevel1(int BAB, int fortSave, int refSave, int willSave) {
        this.level1 = new ClassTableRow(BAB, fortSave, refSave, willSave);
    }

    public void setLevel2(int BAB, int fortSave, int refSave, int willSave) {
        this.level2 = new ClassTableRow(BAB, fortSave, refSave, willSave);
    }

    public void setLevel3(int BAB, int fortSave, int refSave, int willSave) {
        this.level3 = new ClassTableRow(BAB, fortSave, refSave, willSave);
    }

    public void setLevel4(int BAB, int fortSave, int refSave, int willSave) {
        this.level4 = new ClassTableRow(BAB, fortSave, refSave, willSave);
    }

    public void setLevel5(int BAB, int fortSave, int refSave, int willSave) {
        this.level5 = new ClassTableRow(BAB, fortSave, refSave, willSave);
    }

    public void setLevel6(int BAB, int fortSave, int refSave, int willSave) {
        this.level6 = new ClassTableRow(BAB, fortSave, refSave, willSave);
    }

    public void setLevel7(int BAB, int fortSave, int refSave, int willSave) {
        this.level7 = new ClassTableRow(BAB, fortSave, refSave, willSave);
    }

    public void setLevel8(int BAB, int fortSave, int refSave, int willSave) {
        this.level8 = new ClassTableRow(BAB, fortSave, refSave, willSave);
    }

    public void setLevel9(int BAB, int fortSave, int refSave, int willSave) {
        this.level9 = new ClassTableRow(BAB, fortSave, refSave, willSave);
    }

    public void setLevel10(int BAB, int fortSave, int refSave, int willSave) {
        this.level10 = new ClassTableRow(BAB, fortSave, refSave, willSave);
    }

    public void setLevel11(int BAB, int fortSave, int refSave, int willSave) {
        this.level11 = new ClassTableRow(BAB, fortSave, refSave, willSave);
    }

    public void setLevel12(int BAB, int fortSave, int refSave, int willSave) {
        this.level12 = new ClassTableRow(BAB, fortSave, refSave, willSave);
    }

    public void setLevel13(int BAB, int fortSave, int refSave, int willSave) {
        this.level13 = new ClassTableRow(BAB, fortSave, refSave, willSave);
    }

    public void setLevel14(int BAB, int fortSave, int refSave, int willSave) {
        this.level14 = new ClassTableRow(BAB, fortSave, refSave, willSave);
    }

    public void setLevel15(int BAB, int fortSave, int refSave, int willSave) {
        this.level15 = new ClassTableRow(BAB, fortSave, refSave, willSave);
    }

    public void setLevel16(int BAB, int fortSave, int refSave, int willSave) {
        this.level16 = new ClassTableRow(BAB, fortSave, refSave, willSave);
    }

    public void setLevel17(int BAB, int fortSave, int refSave, int willSave) {
        this.level17 = new ClassTableRow(BAB, fortSave, refSave, willSave);
    }

    public void setLevel18(int BAB, int fortSave, int refSave, int willSave) {
        this.level18 = new ClassTableRow(BAB, fortSave, refSave, willSave);
    }

    public void setLevel19(int BAB, int fortSave, int refSave, int willSave) {
        this.level19 = new ClassTableRow(BAB, fortSave, refSave, willSave);
    }

    public void setLevel20(int BAB, int fortSave, int refSave, int willSave) {
        this.level20 = new ClassTableRow(BAB, fortSave, refSave, willSave);
    }

    public ClassTableRow getLevel(int level){
        switch (level){
            case 1 -> {
                return getLevel1();
            }
            case 2 -> {
                return getLevel2();
            }
            case 3 -> {
                return getLevel3();
            }
            case 4 -> {
                return getLevel4();
            }
            case 5 -> {
                return getLevel5();
            }
            case 6 -> {
                return getLevel6();
            }
            case 7 -> {
                return getLevel7();
            }
            case 8 -> {
                return getLevel8();
            }
            case 9 -> {
                return getLevel9();
            }
            case 10 -> {
                return getLevel10();
            }
            case 11 -> {
                return getLevel11();
            }
            case 12 -> {
                return getLevel12();
            }
            case 13 -> {
                return getLevel13();
            }
            case 14 -> {
                return getLevel14();
            }
            case 15 -> {
                return getLevel15();
            }
            case 16 -> {
                return getLevel16();
            }
            case 17 -> {
                return getLevel17();
            }
            case 18 -> {
                return getLevel18();
            }
            case 19 -> {
                return getLevel19();
            }
            case 20 -> {
                return getLevel20();
            }
        }
        return null;
    }

    public ClassTableRow getLevel1() {
        return level1;
    }

    public ClassTableRow getLevel2() {
        return level2;
    }

    public ClassTableRow getLevel3() {
        return level3;
    }

    public ClassTableRow getLevel4() {
        return level4;
    }

    public ClassTableRow getLevel5() {
        return level5;
    }

    public ClassTableRow getLevel6() {
        return level6;
    }

    public ClassTableRow getLevel7() {
        return level7;
    }

    public ClassTableRow getLevel8() {
        return level8;
    }

    public ClassTableRow getLevel9() {
        return level9;
    }

    public ClassTableRow getLevel10() {
        return level10;
    }

    public ClassTableRow getLevel11() {
        return level11;
    }

    public ClassTableRow getLevel12() {
        return level12;
    }

    public ClassTableRow getLevel13() {
        return level13;
    }

    public ClassTableRow getLevel14() {
        return level14;
    }

    public ClassTableRow getLevel15() {
        return level15;
    }

    public ClassTableRow getLevel16() {
        return level16;
    }

    public ClassTableRow getLevel17() {
        return level17;
    }

    public ClassTableRow getLevel18() {
        return level18;
    }

    public ClassTableRow getLevel19() {
        return level19;
    }

    public ClassTableRow getLevel20() {
        return level20;
    }
}