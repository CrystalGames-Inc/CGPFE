package CGPFE.Data.Storage.World;

import CGPFE.Data.Models.Items.GoodsServices.*;
import CGPFE.Data.Models.Items.GoodsServices.Types.*;

public class Goods {

    //region Adventuring Gear

    public final AdventuringGear backpack = new AdventuringGear("Backpack",0,2,2);
    public final AdventuringGear barrel = new AdventuringGear("Barrel",1,2,30);
    public final AdventuringGear basket = new AdventuringGear("Basket",2,2,1);
    public final AdventuringGear bedroll = new AdventuringGear("Bedroll",3,0.1,5);
    public final AdventuringGear bell = new AdventuringGear("Bell",4,1, 0);
    public final AdventuringGear winterBlanket = new AdventuringGear("Winter Blanket",5,0.5,3);
    public final AdventuringGear blockAndTackle = new AdventuringGear("Block And Tackle",6,5,5);
    public final AdventuringGear glassBottle = new AdventuringGear("Glass Bottle",7,2,1);
    public final AdventuringGear bucket = new AdventuringGear("Bucket",8,0.5,2);
    public final AdventuringGear caltrops = new AdventuringGear("Caltrops",9,1,2);
    public final AdventuringGear candle = new AdventuringGear("Candle",10,0.01,0);
    public final AdventuringGear canvas = new AdventuringGear("Canvas",11,0.1,1);
    public final AdventuringGear CMP = new AdventuringGear("Case, Map Or Scroll",12,1,0.5);
    public final AdventuringGear chain = new AdventuringGear("Chain",13,30,2);
    public final AdventuringGear chalk = new AdventuringGear("Chalk",14,1,0);
    public final AdventuringGear chest = new AdventuringGear("Chest",15,2,25);
    public final AdventuringGear crowbar = new AdventuringGear("Crowbar",16,2,5);
    public final AdventuringGear firewood = new AdventuringGear("Firewood",17,1,20);
    public final AdventuringGear fishhook = new AdventuringGear("Fishhook",18,0.1,0);
    public final AdventuringGear fishingNet = new AdventuringGear("Fishing Net",19,4,5);
    public final AdventuringGear flask = new AdventuringGear("Flask",20,3,0.5);
    public final AdventuringGear flintAndSteel = new AdventuringGear("Flint And Steel",21,1,0);
    public final AdventuringGear grapplingHook = new AdventuringGear("Grappling Hook",22,1,4);
    public final AdventuringGear hammer = new AdventuringGear("Hammer", 23,0.5,2);
    public final AdventuringGear hourglass = new AdventuringGear("Hourglass",24,25,1);
    public final AdventuringGear inkVial = new AdventuringGear("Ink Vial",25,8,0);
    public final AdventuringGear inkPen = new AdventuringGear("Ink Pen",26,0.1,0);
    public final AdventuringGear clayJug = new AdventuringGear("Clay Jug",27,0.03,9);
    public final AdventuringGear ladder = new AdventuringGear("Ladder",28,0.2,20);
    public final AdventuringGear commonLamp = new AdventuringGear("Common Lamp",29,0.1,1);
    public final AdventuringGear bullseyeLantern = new AdventuringGear("Bullseye Lantern", 30,12,3);
    public final AdventuringGear hoodedLantern = new AdventuringGear("Hooded Lantern",31,7,2);
    public final AdventuringGear simpleLock = new AdventuringGear("Lock (Simple)",32,20,1);
    public final AdventuringGear averageLock = new AdventuringGear("Lock (Average)",33,20,1);
    public final AdventuringGear goodLock = new AdventuringGear("Lock (Good)",34,20,1);
    public final AdventuringGear superiorLock = new AdventuringGear("Lock (Superior)",35,20,1);
    public final AdventuringGear manacles = new AdventuringGear("Manacles",36,15,2);
    public final AdventuringGear masterworkManacles = new AdventuringGear("Manacles (Masterwork)",37,50,2);
    public final AdventuringGear smallSteelMirror = new AdventuringGear("Small Steel Mirror",38,10,0.5);
    public final AdventuringGear clayMug = new AdventuringGear("ClayMug",39,0.02,1);
    public final AdventuringGear oil = new AdventuringGear("Oil",40,.01,1);
    public final AdventuringGear paperSheet = new AdventuringGear("Paper (Sheet)",41,0.4,0);
    public final AdventuringGear parchmentPaper = new AdventuringGear("Parchment (Sheet)",42,0.2,0);
    public final AdventuringGear minersPick = new AdventuringGear("Miner's Pick",43,3,10);
    public final AdventuringGear clayPitcher = new AdventuringGear("Clay Pitcher",44,0.02,5);
    public final AdventuringGear piton = new AdventuringGear("Piton",45,0.1,0.5);
    public final AdventuringGear pole = new AdventuringGear("Pole (10ft)",46,0.05,8);
    public final AdventuringGear ironPot = new AdventuringGear("Iron Pot",47,0.8,4);
    public final AdventuringGear beltPouch = new AdventuringGear("Belt Pouch",48,1,0.5);
    public final AdventuringGear portableRam = new AdventuringGear("Portable Ram",49,10,20);
    public final AdventuringGear trailRations = new AdventuringGear("Trail Rations",50,0.5,1);
    public final AdventuringGear hempRope = new AdventuringGear("Rope Hemp",51,1,10);
    public final AdventuringGear silkRope = new AdventuringGear("Silk Rope",52,10,5);
    public final AdventuringGear sack = new AdventuringGear("Sack",53,0.1,0.5);
    public final AdventuringGear sealingWax = new AdventuringGear("Sealing Wax",54,1,1);
    public final AdventuringGear sewingNeedle = new AdventuringGear("Sewing Needle",55,0.5,0);
    public final AdventuringGear shovelSpade = new AdventuringGear("ShovelOrSpade",56,2,8);
    public final AdventuringGear signalWhistle = new AdventuringGear("Signal Whistle",57,0.8,0);
    public final AdventuringGear signetRing = new AdventuringGear("Signet Ring",58,5,0);
    public final AdventuringGear sledge = new AdventuringGear("Sledge",59,1,10);
    public final AdventuringGear soap = new AdventuringGear("Soap",60,0.5,1);
    public final AdventuringGear spyglass = new AdventuringGear("Spyglass",61,1000,1);
    public final AdventuringGear tent = new AdventuringGear("Tent", 62,10,20);
    public final AdventuringGear torch = new AdventuringGear("Torch",63,0.01,1);
    public final AdventuringGear vial = new AdventuringGear("Vial (Ink Or Potion)",64,1,0);
    public final AdventuringGear waterClock = new AdventuringGear("Water Clock",65,1000,200);
    public final AdventuringGear waterskin = new AdventuringGear("Waterskin",66,1,4);
    public final AdventuringGear whetstone = new AdventuringGear("Whetstone",67,0.02,1);

    //endregion

    //region Substances and Items

    public final SubstanceItem acidFlask = new SubstanceItem("Flask (Acid)",68,10,1);
    public final SubstanceItem alchemistsFireFlask = new SubstanceItem("Alchemist's Fire (Flask)",69,20,1);
    public final SubstanceItem antitoxinVial = new SubstanceItem("Antitoxin (Vial)",70,50,0);
    public final SubstanceItem everburningTorch = new SubstanceItem("Everburning Torch",71,110,1);
    public final SubstanceItem holyWaterFlask = new SubstanceItem("Holy Water (Flask)",72,25,1);
    public final SubstanceItem smokestick = new SubstanceItem("Smokestick",73,20,0.5);
    public final SubstanceItem sunrod = new SubstanceItem("Sunrod",74,2,1);
    public final SubstanceItem tanglefootBag = new SubstanceItem("Tanglefoot Bag",75,50,4);
    public final SubstanceItem thunderstone = new SubstanceItem("Thunderstone",76,30,1);
    public final SubstanceItem tinderwig = new SubstanceItem("Tinderwig",77,1,0);

    //endregion

    //region Tools and Skill Kits

    public final ToolSkillKit alchemistsLab = new ToolSkillKit("Alchemist's Lab",78,200,40);
    public final ToolSkillKit artisansTools = new ToolSkillKit("Artisan's Tools",79,5,5);
    public final ToolSkillKit masterworkArtisanTools = new ToolSkillKit("Masterwork Artisan's Tools",80,55,5);
    public final ToolSkillKit climbersKit = new ToolSkillKit("Climber's Kit",81,80,5);
    public final ToolSkillKit disguiseKit = new ToolSkillKit("Disguise Kit",82,50,8);
    public final ToolSkillKit healersKit = new ToolSkillKit("Healer's Kit",83,50,1);
    public final ToolSkillKit hollyAndMistletoe = new ToolSkillKit("Holly And Mistletoe",84,0,0);
    public final ToolSkillKit woodenHolySymbol = new ToolSkillKit("Wooden Holy Symbol",85,1,0);
    public final ToolSkillKit silverHolySymbol = new ToolSkillKit("Silver Holy Symbol",86,25,1);
    public final ToolSkillKit magnifyingGlass = new ToolSkillKit("Magnifying Glass",87,100,0);
    public final ToolSkillKit commonMusicalInstrument = new ToolSkillKit("Common Musical Instrument",88,5,3);
    public final ToolSkillKit masterworkMusicalInstrument = new ToolSkillKit("Masterwork Musical Instrument",89,100,3);
    public final ToolSkillKit merchantsScale = new ToolSkillKit("Merchant's Scale",90,2,1);
    public final ToolSkillKit spellComponentPouch = new ToolSkillKit("Spell Component Pouch",91,5,2);
    public final ToolSkillKit wizardsSpellbook = new ToolSkillKit("Wizard's Spellbook",92,15,3);
    public final ToolSkillKit thievesTools = new ToolSkillKit("Thieves' Tools",93,30,1);
    public final ToolSkillKit masterworkThievesTools = new ToolSkillKit("Masterwork Thieves' Tools",94,100,2);
    public final ToolSkillKit masterworkTool = new ToolSkillKit("Masterwork Tool",95,50,1);

    //endregion

    //region Clothing

    public final Clothing artisansOutfit = new Clothing("Artisan's Outfit",96,1,4);
    public final Clothing clericsVestments = new Clothing("Cleric's Vestments",97,5,6);
    public final Clothing coldWeatherOutfit = new Clothing("Cold-Weather Outfit",98,8,7);
    public final Clothing courtiersOutfit = new Clothing("Courtier’s Outfit",99,30,6);
    public final Clothing entertainersOutfit = new Clothing("Entertainer’s Outfit",100,3,4);
    public final Clothing explorersOutfit = new Clothing("Explorer's Outfit",101,10,8);
    public final Clothing monksOutfit = new Clothing("Monk's Outfit",102,5,2);
    public final Clothing noblesOutfit = new Clothing("Noble's Outfit",103,75,10);
    public final Clothing peasantsOutfit = new Clothing("Peasant's Outfit",104,0.1,2);
    public final Clothing royalOutfit = new Clothing("Royal Outfit",105,200,15);
    public final Clothing scholarsOutfit = new Clothing("Scholar's Outfit",106,5,6);
    public final Clothing travelersOutfit = new Clothing("Traveler's Outfit",107,1,5);

    //endregion

    //region Food, Drink, and Lodging

    public final Drink aleGallon = new Drink("Ale (Gallon)",108,0.2,8);
    public final Drink aleMug = new Drink("Ale (Mug)",109,0.04,1);
    public final Food banquet = new Food("Banquet",110,10,0);
    public final Food breadLoad = new Food("Loaf Of Bread",111,0.02,0.5);
    public final Food cheeseHunk = new Food("Hunk Of Cheese",112,0.1,0.5);
    public final Lodging poorInn = new Lodging("Inn Stay (Poor)",113,0.2);
    public final Lodging commonInn = new Lodging("Inn Stay (Common)",114,0.5);
    public final Lodging goodInn = new Lodging("Inn Stay (Good)",115,2);
    public final Lodging poorMeal = new Lodging("Meal (Poor)",113,0.1);
    public final Lodging commonMeal = new Lodging("Meal (Common)",114,0.3);
    public final Lodging goodMeal = new Lodging("Meal (Good)",115,5);
    public final Food meatChunk = new Food("Chunk Of Meat",116,0.3,0.5);
    public final Drink commonWinePitcher = new Drink("Common Wine (Pitcher)",117,0.2,6);
    public final Drink fineWineBottle = new Drink("Fine Wine (Bottle)",118,10,1);

    //endregion

    //region Mounts and Related Gear

    public final MountGear medBarding = new MountGear("Med. Creature Barding",119,2,1);
    public final MountGear larBarding = new MountGear("Large Creature Barding",120,4,2);
    public final MountGear bitBridle = new MountGear("Bit And Bridle",121,2,1);
    public final Mount guardDog = new Mount("Guard Dog",122,25);
    public final Mount ridingDog = new Mount("Riding Dog",123,150);
    public final Mount donkeyMule = new Mount("Donkey / Mule",124,8);
    public final Food feed = new Food("Feed",125,0.05,10);
    public final Mount heavyHorse = new Mount("Heavy Horse",126,200);
    public final Mount heavyHorseCT = new Mount("Heavy Horse (Combat Trained",127,300);
    public final Mount lightHorse = new Mount("Light Horse",128,75);
    public final Mount lightHorseCT = new Mount("Light Horse (Combat Trained)",129,110);
    public final Mount pony = new Mount("Pony",130,30);
    public final Mount ponyCT = new Mount("Pont (Combat Trained)",131,45);
    public final MountGear militarySaddle = new MountGear("Military Saddle",132,20,30);
    public final MountGear packSaddle = new MountGear("Pack Saddle",133,5,15);
    public final MountGear ridingSaddle = new MountGear("Riding Saddle",134,10,25);
    public final MountGear militaryExoticSaddle = new MountGear("Military Exotic Saddle",135,60,40);
    public final MountGear packExoticSaddle = new MountGear("Pack Exotic Saddle",136,15,20);
    public final MountGear ridingExoticSaddle = new MountGear("Riding Exotic Saddle",137,30,30);
    public final MountGear saddlebags = new MountGear("Saddlebags",138,4,8);
    public final Service stabling = new Service("Stabling",139,0.5);

    //endregion

    //region Transport

    public final Transport carriage = new Transport("Carriage",140,100,600);
    public final Transport cart = new Transport("Cart",141,15,200);
    public final Transport galley = new Transport("Galley",142,30000,0);
    public final Transport keelboat = new Transport("Keelboat",143,3000,0);
    public final Transport longship = new Transport("Longship",144,10000,0);
    public final Transport rowboat = new Transport("Rowboat",145,50,100);
    public final Transport oar = new Transport("Oar",146,2,10);
    public final Transport sailingShip = new Transport("Sailing Ship",147,10000,0);
    public final Transport sled = new Transport("Sled",148,20,300);
    public final Transport wagon = new Transport("Wagon",149,35,400);
    public final Transport warship = new Transport("Warship",150,25000,0);

    //endregion

    //region Spellcasting and Services

    public final SpellcastingService coachCab = new SpellcastingService("Coach Cab",151,3);
    public final SpellcastingService trainedHireling = new SpellcastingService("Trained Hireling",152,0.3);
    public final SpellcastingService untrainedHireling = new SpellcastingService("Untrained Hireling",153,0.1);
    public final SpellcastingService messenger = new SpellcastingService("Messenger",154,0.02);
    public final SpellcastingService roadGateToll = new SpellcastingService("Road / Gate Toll",155,0.01);
    public final SpellcastingService shipPassage = new SpellcastingService("Ship's Passage",156,0.1);
    public final SpellcastingService spellcasting = new SpellcastingService("Spellcasting",157, 10);

    //endregion

}