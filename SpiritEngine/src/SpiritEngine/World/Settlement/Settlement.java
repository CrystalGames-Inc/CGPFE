package SpiritEngine.World.Settlement;

import SpiritEngine.God.Creation.Importance.Constants.Alignment;
import SpiritEngine.World.Location;

public class Settlement {
    private String name;
    private String nickname;
    private Type type;
    private Alignment alignment;
    private int danger;

    //region Modifiers

    private int corruption;
    private int crime;
    private int economy;
    private int law;
    private int lore;
    private int society;

    private Quality[] qualities;
    public Disadvantage[] disadvantages;

    //endregion

    //region Demographics

    private Government government;
    private int population;

    //endregion

    //region Marketplace

    private int baseValue;
    private int purchaseLimit;
    private int spellcasting;

    //TODO add magic items

    //endregion

    Location[] locations;

    public Settlement(String name, Type type, Alignment alignment){
        this.name = name;
        this.type = type;
        this.alignment = alignment;
    }


    //region Setters

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setQualities(Quality[] qualities) {
        this.qualities = qualities;
    }

    public void setDisadvantages(Disadvantage[] disadvantages) {
        this.disadvantages = disadvantages;
    }

    public void setGovernment(Government government) {
        this.government = government;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }

    //endregion

    //region Getters

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public Type getType() {
        return type;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public int getDanger() {
        return danger;
    }

    public int getCorruption() {
        return corruption;
    }

    public int getCrime() {
        return crime;
    }

    public int getEconomy() {
        return economy;
    }

    public int getLaw() {
        return law;
    }

    public int getLore() {
        return lore;
    }

    public int getSociety() {
        return society;
    }

    public Quality[] getQualities() {
        return qualities;
    }

    public Disadvantage[] getDisadvantages() {
        return disadvantages;
    }

    public Government getGovernment() {
        return government;
    }

    public int getPopulation() {
        return population;
    }

    public int getBaseValue() {
        return baseValue;
    }

    public int getPurchaseLimit() {
        return purchaseLimit;
    }

    public int getSpellcasting() {
        return spellcasting;
    }

    public Location[] getLocations() {
        return locations;
    }

    //endregion

    //region Data Calculations

    public void calculateSettlementData(){
        calculateDanger();
        calculateQualitySize();
        calculateBaseValue();
        calculatePurchaseLimit();
        calculateSpellcasting();
        calculateModifiers();
    }

    void calculateDanger(){
        switch (type){
            case THORPE -> danger = -4;
            case HAMLET -> danger = -5;
            case VILLAGE, S_TOWN -> danger = 0;
            case L_TOWN, S_CITY -> danger = 5;
            case L_CITY, METROPOLIS -> danger = 10;
        }
    }

    void calculateQualitySize(){
        switch (type){
            case THORPE, HAMLET -> qualities = new Quality[1];
            case VILLAGE, S_TOWN -> qualities = new Quality[2];
            case L_TOWN -> qualities = new Quality[3];
            case S_CITY -> qualities = new Quality[4];
            case L_CITY -> qualities = new Quality[5];
            case METROPOLIS -> qualities = new Quality[6];
        }
    }

    void calculateBaseValue(){
        switch (type){
            case THORPE -> baseValue = 50;
            case HAMLET -> baseValue = 200;
            case VILLAGE -> baseValue = 500;
            case S_TOWN -> baseValue = 1000;
            case L_TOWN -> baseValue = 2000;
            case S_CITY -> baseValue = 4000;
            case L_CITY -> baseValue = 8000;
            case METROPOLIS -> baseValue = 16000;
        }
    }

    void calculatePurchaseLimit(){
        switch (type){
            case THORPE -> purchaseLimit = 500;
            case HAMLET -> purchaseLimit = 1000;
            case VILLAGE -> purchaseLimit = 2500;
            case S_TOWN -> purchaseLimit = 5000;
            case L_TOWN -> purchaseLimit = 10000;
            case S_CITY -> purchaseLimit = 25000;
            case L_CITY -> purchaseLimit = 50000;
            case METROPOLIS -> purchaseLimit = 100000;
        }
    }

    void calculateSpellcasting(){
        switch (type){
            case THORPE -> spellcasting = 1;
            case HAMLET -> spellcasting = 2;
            case VILLAGE -> spellcasting = 3;
            case S_TOWN -> spellcasting = 4;
            case L_TOWN -> spellcasting = 5;
            case S_CITY -> spellcasting = 6;
            case L_CITY -> spellcasting = 7;
            case METROPOLIS -> spellcasting = 8;
        }
    }

    void calculateModifiers(){
        calculateGovernmentModifiers();
    }

    void calculateGovernmentModifiers(){
        switch (government){
            case COLONIAL -> {
                corruption += 2;
                economy += 1;
                law += 1;
            }
            case COUNCIL -> {
                society += 4;
                law -= 2;
                lore -= 2;
            }
            case DYNASTY -> {
                corruption += 1;
                law += 1;
                society -= 2;
            }
            case MAGICAL -> {
                lore += 2;
                corruption -= 2;
                society -= 2;
                spellcasting -= 1;
            }
            case MILITARY -> {
                law += 3;
                corruption -= 1;
                society -= 1;
            }
            case OVERLORD -> {
                corruption += 2;
                law += 2;
                crime -= 2;
                society -= 2;
            }
            case SECRET_SYNDICATE -> {
                corruption += 2;
                economy += 2;
                crime += 2;
                law -= 6;
            }
            case PLUTOCRACY -> {
                corruption += 2;
                crime += 2;
                economy += 3;
                society -= 2;
            }
            case UTOPIA -> {
                society += 2;
                lore += 1;
                corruption -= 2;
                crime -= 1;
            }
        }
    }

    void calculateQualityModifiers(){
        for(Quality q: qualities){
            switch (q){
                case ABUNDANT -> {
                    economy += 1;
                }
                case ABSTINENT -> {
                    corruption += 2;
                    law += 1;
                    society -= 2;
                }
                case ACADEMIC -> {
                    lore += 1;
                    spellcasting += 1;
                }
                case ADVENTURESITE -> {
                    society += 2;
                    purchaseLimit *= (int) 1.5;
                }
                case ANIMAL_POLYGLOT -> {
                    economy -= 1;
                    lore += 1;
                    spellcasting += 1;
                }
                
            }
        }
    }

    //endregion
}