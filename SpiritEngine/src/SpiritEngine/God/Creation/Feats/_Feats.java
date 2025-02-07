package SpiritEngine.God.Creation.Feats;

import SpiritEngine.Data.Models.Items.Equipment.Weapon.Weapon;
import SpiritEngine.Data.Storage.Equipment.Weapons.Weapons;
import SpiritEngine.God.Creation.Importance.Feat.Feat;
import SpiritEngine.God.Creation.Importance.Feat.WeaponProficiency;
import SpiritEngine.God.Creation.Skills._Skills;

public class _Feats {

    private static _Feats _instance;

    public static synchronized _Feats getInstance(){
        if (_instance == null) {
            _instance = new _Feats();
        }
        return _instance;
    }

    private  _Feats(){

    }

    public final Feat acrobatic = new Acrobatic();
    public final Feat acrobaticSteps = new AcrobaticSteps();
    public final Feat agileManeuvers = new AgileManeuvers();
    public final Feat alertness = new Alertness();
    public final Feat alignmentChannel = new AlignmentChannel();
    public final Feat animalAffinity = new AnimalAffinity();
    public final Feat arcaneArmorMastery = new ArcaneArmorMastery();
    public final Feat arcaneArmorTraining = new ArcaneArmorTraining();
    public final Feat arcaneStrike = new ArcaneStrike();
    public final Feat armorProficiencyH = new ArmorProficiencyHeavy();
    public final Feat armorProficiencyL = new ArmorProficiencyLight();
    public final Feat armorProficiencyM = new ArmorProficiencyMedium();
    public final Feat athletic = new Athletic();
    public final Feat augmentSummoning = new AugmentSummoning();
    public final Feat bleedingCritical = new BleedingCritical();
    public final Feat brewPotion = new BrewPotion();
    public final Feat catchOffGuard = new CatchOffGuard();
    public final Feat channelSmite = new ChannelSmite();
    public final Feat cleave = new Cleave();
    public final Feat combatCasting = new CombatCasting();
    public final Feat combatExpertise = new CombatExpertise();
    public final Feat combatReflexes = new CombatReflexes();
    public final Feat commandUndead = new CommandUndead();
    public final Feat craftMagicArmsArmor = new CraftMagicArmsArmor();
    public final Feat craftRod = new CraftRod();
    public final Feat craftStaff = new CraftStaff();
    public final Feat craftWand = new CraftWand();
    public final Feat craftWondrousItem = new CraftWondrousItem();
    public final Feat criticalFocus = new CriticalFocus();
    public final Feat criticalMastery = new CriticalMastery();
    public final Feat dazzlingDisplay = new DazzlingDisplay();
    public final Feat deadlyAim = new DeadlyAim();
    public final Feat deadlyStroke = new DeadlyStroke();
    public final Feat defeatingCritical = new DefeatingCritical();
    public final Feat deceitful = new Deceitful();
    public final Feat defensiveCombatTraining = new DefensiveCombatTraining();
    public final Feat deflectArrows = new DeflectArrows();
    public final Feat deftHands = new DeftHands();
    public final Feat diehard = new Diehard();
    public final Feat disruptive = new Disruptive();
    public final Feat dodge = new Dodge();
    public final Feat doubleSlice = new DoubleSlice();
    public final Feat elementalChannel = new ElementalChannel();
    public final Feat empowerSpell = new EmpowerSpell();
    public final Feat endurance = new Endurance();
    public final Feat enlargeSpell = new EnlargeSpell();
    public final Feat eschewMaterials = new EschewMaterials();
    public final Feat exhaustingCritical = new ExhaustingCritical();
    public final Feat exoticWeaponProficiency = new ExoticWeaponProficiency();
    public final Feat extendSpell = new ExtendSpell();
    public final Feat extraChannel = new ExtraChannel();
    public final Feat extraKi = new ExtraKi();
    public final Feat extraLayOnHands = new ExtraLayOnHands();
    public final Feat extraMercy = new ExtraMercy();
    public final Feat extraPerformance = new ExtraPerformance();
    public final Feat extraRage = new ExtraRage();
    public final Feat farShot = new FarShot();
    public final Feat fleet = new Fleet();
    public final Feat forgeRing = new ForgeRing();
    public final Feat gorgonsFist = new GorgonsFist();
    public final Feat greatCleave = new GreatCleave();
    public final Feat greatFortitude = new GreatFortitude();
    public final Feat greaterBullRush = new GreaterBullRush();
    public final Feat greaterDisarm = new GreaterDisarm();
    public final Feat greaterFeint = new GreaterFeint();
    public final Feat greaterGrapple = new GreaterGrapple();
    public final Feat greaterOverrun = new GreaterOverrun();
    public final Feat greaterPenetratingStrike = new GreaterPenetratingStrike();
    public final Feat greaterShieldFocus = new GreaterShieldFocus();
    public final Feat greaterSpellFocus = new GreaterSpellFocus();
    public final Feat greaterSpellPenetration = new GreaterSpellPenetration();
    public final Feat greaterSunder = new GreaterSunder();
    public final Feat greaterTrip = new GreaterTrip();
    public final Feat greaterTwoWeaponFighting = new GreaterTwoWeaponFighting();
    public final Feat greaterVitalStrike = new GreaterVitalStrike();
    public final Feat greaterWeaponFocus = new GreaterWeaponFocus();
    public final Feat greaterWeaponSpecialization = new GreaterWeaponSpecialization();
    public final Feat heightenSpell = new HeightenSpell();
    public final Feat improvedBullRush = new ImprovedBullRush();
    public final Feat improvedChannel = new ImprovedChannel();
    public final Feat improvedCounterspell = new ImprovedCounterspell();
    public final Feat improvedCritical = new ImprovedCritical();
    public final Feat improvedDisarm = new ImprovedDisarm();
    public final Feat improvedFamiliar = new ImprovedFamiliar();
    public final Feat improvedFeint = new ImprovedFeint();
    public final Feat improvedGrapple = new ImprovedGrapple();
    public final Feat improvedGreatFortitude = new ImprovedGreatFortitude();
    public final Feat improvedInitiative = new ImprovedInitiative();
    public final Feat improvedIronWill = new ImprovedIronWill();
    public final Feat improvedLightningReflexes = new ImprovedLightningReflexes();
    public final Feat improvedOverrun = new ImprovedOverrun();
    public final Feat improvedPreciseShot = new ImprovedPreciseShot();
    public final Feat improvedShieldBash = new ImprovedShieldBash();
    public final Feat improvedSunder = new ImprovedSunder();
    public final Feat improvedTrip = new ImprovedTrip();
    public final Feat improvedTwoWeaponFighting = new ImprovedTwoWeaponFighting();
    public final Feat improvedUnarmedStrike = new ImprovedUnarmedStrike();
    public final Feat improvedVitalStrike = new ImprovedVitalStrike();
    public final Feat improvisedWeaponMastery = new ImprovisedWeaponMastery();
    public final Feat intimidatingProwess = new IntimidatingProwess();
    public final Feat ironWill = new IronWill();
    public final Feat leadership = new Leadership();
    public final Feat lightningReflexes = new LightningReflexes();
    public final Feat lightningStance = new LightningStance();
    public final Feat lunge = new Lunge();
    public final Feat magicalAptitude = new MagicalAptitude();
    public final Feat manyshot = new Manyshot();
    public final Feat martialWeaponProficiency = new MartialWeaponProficiency();
    public final Feat masterCraftsman = new MasterCraftsman();
    public final Feat maximizeSpell = new MaximizeSpell();
    public final Feat medusasWrath = new MedusasWrath();
    public final Feat mobility = new Mobility();
    public final Feat mountedArchery = new MountedArchery();
    public final Feat mountedCombat = new MountedCombat();
    public final Feat naturalSpell = new NaturalSpell();
    public final Feat nimbleMoves = new NimbleMoves();
    public final Feat penetratingStrike = new PenetratingStrike();
    public final Feat persuasive = new Persuasive();
    public final Feat pinpointTargeting = new PinpointTargeting();
    public final Feat pointBlankShot = new PointBlankShot();
    public final Feat powerAttack = new PowerAttack();
    public final Feat preciseShot = new PreciseShot();
    public final Feat quickDraw = new QuickDraw();
    public final Feat quickenSpell = new QuickenSpell();
    public final Feat rapidReload = new RapidReload();
    public final Feat rapidShot = new RapidShot();
    public final Feat rideByAttack = new RideByAttack();
    public final Feat run = new Run();
    public final Feat scorpionStyle = new ScorpionStyle();
    public final Feat scribeScroll = new ScribeScroll();
    public final Feat selectiveChanneling = new SelectiveChanneling();
    public final Feat selfSufficient = new SelfSufficient();
    public final Feat shatterDefenses = new ShatterDefenses();
    public final Feat shieldFocus = new ShieldFocus();
    public final Feat shieldMaster = new ShieldMaster();
    public final Feat shieldProficiency = new ShieldProficiency();
    public final Feat shieldSlam = new ShieldSlam();
    public final Feat shotOnTheRun = new ShotOnTheRun();
    public final Feat sickeningCritical = new SickeningCritical();
    public final Feat silentSpell = new SilentSpell();
    public final Feat simpleWeaponProficiency = new SimpleWeaponProficiency();
    public final Feat skillFocus = new SkillFocus();
    public final Feat snatchArrows = new SnatchArrows();
    public final Feat spellFocus = new SpellFocus();
    public final Feat spellMastery = new SpellMastery();
    public final Feat spellPenetration = new SpellPenetration();
    public final Feat spellbreaker = new Spellbreaker();
    public final Feat spiritedCharge = new SpiritedCharge();
    public final Feat springAttack = new SpringAttack();
    public final Feat staggeringCritical = new StaggeringCritical();
    public final Feat standStill = new StandStill();
    public final Feat stealthy = new Stealthy();
    public final Feat stepUp = new StepUp();
    public final Feat stillSpell = new StillSpell();
    public final Feat strikeBack = new StrikeBack();
    public final Feat stunningCritical = new StunningCritical();
    public final Feat stunningFist = new StunningFist();
    public final Feat throwAnything = new ThrowAnything();
    public final Feat tiringCritical = new TiringCritical();
    public final Feat toughness = new Toughness();
    public final Feat towerShieldProficiency = new TowerShieldProficiency();
    public final Feat trample = new Trample();
    public final Feat turnUndead = new TurnUndead();
    public final Feat twoWeaponDefense = new TwoWeaponDefense();
    public final Feat twoWeaponFighting = new TwoWeaponFighting();
    public final Feat twoWeaponRend = new TwoWeaponRend();
    public final Feat unseat = new Unseat();
    public final Feat vitalStrike = new VitalStrike();
    public final Feat weaponFinesse = new WeaponFinesse();
    public final Feat weaponFocus = new WeaponFocus();
    public final Feat weaponSpecialization = new WeaponSpecialization();
    public final Feat whirlwindAttack = new WhirlwindAttack();
    public final Feat widenSpell = new WidenSpell();
    public final Feat windStance = new WindStance();

    Weapons weapons = Weapons.getInstance();

    //region PC Class Feats

    public final Feat[] alchemistFeats = new Feat[]{
            simpleWeaponProficiency,
            armorProficiencyL
    };

    public final Feat[] barbarianFeats = new Feat[]{
            simpleWeaponProficiency,
            martialWeaponProficiency,
            armorProficiencyL,
            armorProficiencyM,
            shieldProficiency
    };

    public final Feat[] bardFeats = new Feat[]{
            simpleWeaponProficiency,
            armorProficiencyL,
            shieldProficiency
    };

    public final Feat[] cavalierFeats = new Feat[]{
            simpleWeaponProficiency,
            martialWeaponProficiency,
            armorProficiencyL,
            armorProficiencyM,
            armorProficiencyH,
            shieldProficiency
    };

    public final Feat[] clericFeats = new Feat[]{
            simpleWeaponProficiency,
            armorProficiencyL,
            armorProficiencyM,
            shieldProficiency
    };

    public final Feat[] druidFeats = new Feat[]{
            armorProficiencyL,
            armorProficiencyM
    };

    public final Feat[] fighterFeats = new Feat[]{
            simpleWeaponProficiency,
            martialWeaponProficiency,
            armorProficiencyL,
            armorProficiencyM,
            armorProficiencyH,
            shieldProficiency,
            towerShieldProficiency
    };

    public final Feat[] inquisitorFeats = new Feat[]{
            simpleWeaponProficiency,
            new WeaponProficiency(new Weapon[]{
                    weapons.handCrossbow,
                    weapons.longbow,
                    weapons.repeatingLightCrossbow,
                    weapons.repeatingHeavyCrossbow,
                    weapons.shortbow
            }),
            armorProficiencyL,
            armorProficiencyM,
            shieldProficiency
    };

    public final Feat[] monkFeats = new Feat[]{
        new WeaponProficiency(new Weapon[]{
                weapons.club,
                weapons.lightCrossbow,
                weapons.heavyCrossbow,
                weapons.dagger,
                weapons.handaxe,
                weapons.javelin,
                weapons.kama,
                weapons.nunchaku,
                weapons.quarterstaff,
                weapons.sai,
                weapons.shortspear,
                weapons.shortSword,
                weapons.shuriken,
                weapons.siangham,
                weapons.sling,
                weapons.spear
        })
    };

    public final Feat[] oracleFeats = new Feat[]{
            simpleWeaponProficiency,
            armorProficiencyL,
            armorProficiencyM,
            shieldProficiency
    };

    public final Feat[] paladinFeats = new Feat[]{
            simpleWeaponProficiency,
            martialWeaponProficiency,
            armorProficiencyL,
            armorProficiencyM,
            armorProficiencyH,
            shieldProficiency
    };

    public final Feat[] rangerFeats = new Feat[]{
            simpleWeaponProficiency,
            martialWeaponProficiency,
            armorProficiencyL,
            armorProficiencyM,
            shieldProficiency
    };

    public final Feat[] rogueFeats = new Feat[]{
            simpleWeaponProficiency,
            new WeaponProficiency(new Weapon[]{
                    weapons.handCrossbow,
                    weapons.rapier,
                    weapons.sap,
                    weapons.shortbow,
                    weapons.shortSword
            }),
            armorProficiencyL
    };

    public final Feat[] sorcererFeats = new Feat[]{
            simpleWeaponProficiency
    };

    public final Feat[] summonerFeats = new Feat[]{
            simpleWeaponProficiency,
            armorProficiencyL
    };

    public final Feat[] witchFeats = new Feat[]{
            simpleWeaponProficiency
    };

    public final Feat[] wizardFeats = new Feat[]{
            new WeaponProficiency(new Weapon[]{
                weapons.club,
                weapons.dagger,
                weapons.heavyCrossbow,
                weapons.lightCrossbow,
                weapons.quarterstaff
            })
    };

    //endregion

    //region NPC Class Feats

    public final Feat[] adeptFeats = new Feat[]{
            simpleWeaponProficiency
    };

    public final Feat[] aristocratFeats = new Feat[]{
            simpleWeaponProficiency
    };

    public final Feat[] commonerFeats = new Feat[]{
            simpleWeaponProficiency
    };

    public final Feat[] expertFeats = new Feat[]{
            simpleWeaponProficiency,
            armorProficiencyL
    };

    public final Feat[] warriorFeats = new Feat[]{
            simpleWeaponProficiency,
            martialWeaponProficiency,
            armorProficiencyL,
            armorProficiencyM,
            armorProficiencyH,
            shieldProficiency,
            towerShieldProficiency
    };

    //endregion

}