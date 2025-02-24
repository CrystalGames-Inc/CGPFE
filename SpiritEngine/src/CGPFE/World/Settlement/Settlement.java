package CGPFE.World.Settlement;

import CGPFE.God.Creation.Importance.Constants.Alignment;
import CGPFE.World.Location;

public class Settlement extends Location{
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

    public boolean hasQuality(Quality quality){
        for (Quality q: qualities){
            if(q == quality)
                return true;
        }
        return false;
    }

    public Disadvantage[] getDisadvantages() {
        return disadvantages;
    }

    public boolean hasDisadvantage(Disadvantage disadvantage){
        for (Disadvantage d: disadvantages){
            if(d == disadvantage)
                return true;
        }
        return false;
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
        calculateQualityModifiers();
        calculateDisadvantageModifiers();
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
                    purchaseLimit *= 1.5;
                }
                case ANIMAL_POLYGLOT -> {
                    economy -= 1;
                    lore += 1;
                    spellcasting += 1;
                }
                case ARTIFACTGATHERER -> {
                    economy += 2;
                    baseValue /= 2;
                }
                case ARTISTCOLONY -> {
                    economy += 1;
                    society += 1;
                }
                case ASYLUM -> {
                    lore += 1;
                    society -= 2;
                }
                case BROADMINDED -> {
                    lore += 1;
                    society += 1;
                }
                case DEADCITY -> {
                    economy -= 2;
                    lore += 2;
                    law += 1;
                }
                case CRUELWATCH -> {
                    corruption += 1;
                    law = 2;
                    crime -= 3;
                    society -= 2;
                }
                case CULTURED -> {
                    society += 1;
                    law -= 1;
                }
                case DARKVISION -> {
                    economy += 1;
                    crime -= 1;
                }
                case DECADENT -> {
                    corruption += 1;
                    crime += 1;
                    economy += 1;
                    society += 1;
                    danger += 10;
                    purchaseLimit *= 1.25;
                }
                case DEEPTRADITIONS -> {
                    law += 2;
                    crime -= 2;
                    society -= 2;
                }
                case DEFENSIBLE -> {
                    corruption += 1;
                    crime += 1;
                    economy += 2;
                    society -= 1;
                }
                case DEFIANT -> {
                    society += 1;
                    law -= 1;
                }
                case ELDRITCH -> {
                    lore += 2;
                    danger += 13;
                    spellcasting += 2;
                }
                case FAMEDBREEDERS -> {
                    economy += 1;
                    baseValue *= 1.2;
                    purchaseLimit *= 1.2;
                }
                case FINANCIALCENTER -> {
                    economy += 2;
                    law += 1;
                    baseValue *= 1.4;
                    purchaseLimit *= 1.4;
                }
                case FREECITY -> {
                    crime += 2;
                    danger += 5;
                    law -= 2;
                }
                case GAMBLING -> {
                    crime += 2;
                    corruption += 2;
                    economy += 2;
                    law -= 1;
                    purchaseLimit *= 1.1;
                }
                case GODRULED -> {
                    corruption -= 2;
                    society -= 2;
                }
                case GOODROADS -> {
                    economy += 2;
                }
                case GUILDS -> {
                    corruption += 1;
                    economy += 1;
                    lore -= 1;
                }
                case HOLYSITE -> {
                    corruption -= 2;
                    spellcasting += 2;
                }
                case INSULAR -> {
                    law += 1;
                    crime -= 1;
                }
                case LEGENDARYMARKETPLACE -> {
                    if(type == Type.METROPOLIS){
                        baseValue *= 2;
                        purchaseLimit *= 2;
                    }
                    economy += 2;
                    crime += 2;
                }
                case LIVINGFOREST -> {
                    lore += 1;
                    society += 2;
                    crime -= 2;
                    economy -= 4;
                    spellcasting += 4;
                }
                case MAGICALLYATTUNED -> {
                    baseValue *= 1.2;
                    purchaseLimit *= 1.2;
                    spellcasting += 2;
                }
                case MAGICALPOLYGLOT -> {
                    economy += 1;
                    lore += 1;
                    society += 1;
                }
                case MAJESTIC -> {
                    spellcasting += 1;
                }
                case MILITARIZED -> {
                    law += 4;
                    society -= 4;
                }
                case MOBILEFRONTLINES -> {
                    corruption -= 1;
                    economy -= 1;
                    society -= 1;
                    baseValue *= 1.25;
                    purchaseLimit *= 1.25;
                }
                case MOBILESANCTUARY -> {
                    economy += 1;
                    society -= 1;
                }
                case MORALLYPERMISSIVE -> {
                    corruption += 1;
                    economy += 1;
                    spellcasting -= 1;
                }
                case MYTHICSANCTUM -> {
                    corruption -= 2;
                }
                case NOQUESTIONSASKED -> {
                    society += 1;
                    lore -= 1;
                }
                case NOTORIOUS -> {
                    crime += 1;
                    danger += 10;
                    law -= 1;
                    baseValue *= 1.3;
                    purchaseLimit *= 1.5;
                }
                case PEACEBONDING -> {
                    law += 1;
                    crime -= 1;
                }
                case PHANTASMAL -> {
                    economy -= 2;
                    society -= 2;
                    spellcasting += 2;
                }
                case PIOUS -> {
                    spellcasting += 1;
                }
                case PLANARCROSSROADS -> {
                    crime += 3;
                    economy += 2;
                    danger += 20;
                    spellcasting += 2;
                    purchaseLimit *= 1.25;
                }
                case PLANNEDCOMMUNITY -> {
                    economy += 1;
                    crime -= 1;
                    society -= 1;
                }
                case POCKETUNIVERSE -> {
                    spellcasting += 2;
                    economy -= 2;
                }
                case POPULATIONSURGE -> {
                    crime += 1;
                    society += 2;
                }
                case PROSPEROUS -> {
                    economy += 1;
                    baseValue *= 1.3;
                    purchaseLimit *= 1.5;
                }
                case RACIALENCLAVE -> {
                    society -= 1;
                }
                case RESETTLEDRUINS -> {
                    economy += 1;
                    lore += 1;
                }
                case RELIGIOUSTOLERANCE -> {
                    lore += 1;
                    society += 1;
                    spellcasting += 2;
                }
                case RESTRICTIVE -> {
                    corruption -= 1;
                    lore -= 1;
                }
                case ROMANTIC -> {
                    society += 1;
                }
                case ROYALACCOMMODATIONS -> {
                    economy += 1;
                    law += 2;
                    society -= 1;
                }
                case RULEOFMIGHT -> {
                    law += 2;
                    society -= 2;
                }
                case RUMORMONGERINGCITIZENS -> {
                    lore += 1;
                    society -= 1;
                }
                case RURAL -> {
                    economy -= 1;
                    crime -= 1;
                    danger -= 5;
                }
                case SACREDANIMALS -> {
                    lore += 1;
                    corruption -= 1;
                    economy -= 1;
                }
                case SEXIST -> {
                    society -= 2;
                }
                case SLUMBERINGMONSTER -> {
                    lore += 2;
                    society += 1;
                    spellcasting += 2;
                }
                case SMALLFOLKSETTLEMENT -> {
                    law += 1;
                    lore += 1;
                }
                case STRATEGICLOCATION -> {
                    economy += 1;
                    baseValue *= 1.1;
                }
                case SUBTERRANEAN -> {
                    law += 1;
                    lore -= 1;
                    danger -= 5;
                }
                case SUPERSTITIOUS -> {
                    law += 2;
                    society += 2;
                    crime -= 4;
                    spellcasting -= 2;
                }
                case SUPPORTIVE -> {
                    society += 2;
                }
                case TIMIDCITIZENS -> {
                    crime += 2;
                    lore -= 2;
                }
                case THERAPEUTIC -> {
                    economy += 1;
                    lore += 1;
                }
                case TRADINGPOST -> {
                    purchaseLimit *= 2;
                }
                case TOURISTATTRACTION -> {
                    economy += 1;
                    baseValue *= 1.2;
                }
                case UNAGING -> {
                    lore += 4;
                    society -= 3;
                    spellcasting += 1;
                }
                case UNDERCITY -> {
                    lore += 1;
                    danger += 20;
                }
                case UNHOLYSITE -> {
                    corruption += 2;
                    spellcasting += 2;
                }
                case WELLEDUCATED -> {
                    lore += 1;
                    society += 2;
                }
                case WEALTHDISPARITY -> {
                    //TODO Add poor/rich districts
                }
            }
        }
    }

    void calculateDisadvantageModifiers(){
        for(Disadvantage d: disadvantages){
            switch (d){
                case ANARCHY -> {
                    crime += 4;
                    economy -= 4;
                    society -= 4;
                    law -= 6;
                }
                case BUREAUCRATICNIGHTMARE -> {
                    economy -= 2;
                    crime += 2;
                    corruption += 2;
                }
                case FASCISTIC -> {
                    law += 4;
                    society -= 4;
                }
                case HEAVILYTAXED -> {
                    society -= 2;
                    baseValue *= 0.9;
                    purchaseLimit /= 2;
                    spellcasting -= 2;
                }
                case HUNTED -> {
                    economy -= 4;
                    law -= 4;
                    society -= 4;
                    danger += 20;
                    baseValue *= 0.8;
                }
                case IGNORANT -> {
                    economy -= 3;
                    lore -= 6;
                    society -= 3;
                }
                case IMPOVERISHED -> {
                    corruption += 1;
                    crime += 1;
                    baseValue /= 2;
                    purchaseLimit /= 2;
                }
                case MAGICALLYDEADENED -> {
                    lore -= 1;
                    economy -= 1;
                    spellcasting -= 4;
                }
                case MAGICALDEADZONE -> {
                    spellcasting = 0;
                }
                case MARTIALLAW -> {
                    law += 2;
                    corruption -= 4;
                    crime -= 2;
                    economy -= 4;
                    danger += 10;
                }
                case OPPRESSED -> {
                    lore -= 6;
                    society -= 6;
                }
                case PLAGUED -> {
                    corruption -= 2;
                    crime -= 2;
                    economy -= 2;
                    law -= 2;
                    lore -= 2;
                    society -= 2;
                    baseValue *= 0.8;
                }
                case RAMPANTINFLATION -> {
                    economy -= 4;
                    corruption += 2;
                    crime += 4;
                }
                case POLLUTED -> {
                    corruption += 2;
                    economy += 4;
                }
                case WILDMAGICZONE -> {
                    spellcasting -= 2;
                }
            }
        }
    }

    //endregion
}