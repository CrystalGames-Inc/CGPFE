package Game.Data.Storage.World;

import Game.Data.Models.Items.GoodsServices.*;
import Game.Data.Models.Items.GoodsServices.Types.*;

public class Goods {

    //region Adventuring Gear

    public AdventuringGear backpack = new AdventuringGear("Backpack",0,2,2);
    public AdventuringGear barrel = new AdventuringGear("Barrel",1,2,30);
    public AdventuringGear basket = new AdventuringGear("Basket",2,2,1);
    public AdventuringGear bedroll = new AdventuringGear("Bedroll",3,0.1,5);
    public AdventuringGear bell = new AdventuringGear("Bell",4,1, 0);
    public AdventuringGear winterBlanket = new AdventuringGear("Winter Blanket",5,0.5,3);
    public AdventuringGear blockAndTackle = new AdventuringGear("Block And Tackle",6,5,5);
    public AdventuringGear glassBottle = new AdventuringGear("Glass Bottle",7,2,1);
    public AdventuringGear bucket = new AdventuringGear("Bucket",8,0.5,2);
    public AdventuringGear caltrops = new AdventuringGear("Caltrops",9,1,2);
    public AdventuringGear candle = new AdventuringGear("Candle",10,0.01,0);
    public AdventuringGear canvas = new AdventuringGear("Canvas",11,0.1,1);
    public AdventuringGear CMP = new AdventuringGear("Case, Map Or Scroll",12,1,0.5);
    public AdventuringGear chain = new AdventuringGear("Chain",13,30,2);
    public AdventuringGear chalk = new AdventuringGear("Chalk",14,1,0);
    public AdventuringGear chest = new AdventuringGear("Chest",15,2,25);
    public AdventuringGear crowbar = new AdventuringGear("Crowbar",16,2,5);
    public AdventuringGear firewood = new AdventuringGear("Firewood",17,1,20);
    public AdventuringGear fishhook = new AdventuringGear("Fishhook",18,0.1,0);
    public AdventuringGear fishingNet = new AdventuringGear("Fishing Net",19,4,5);
    public AdventuringGear flask = new AdventuringGear("Flask",20,3,0.5);
    public AdventuringGear flintAndSteel = new AdventuringGear("Flint And Steel",21,1,0);
    public AdventuringGear grapplingHook = new AdventuringGear("Grappling Hook",22,1,4);
    public AdventuringGear hammer = new AdventuringGear("Hammer", 23,0.5,2);
    public AdventuringGear hourglass = new AdventuringGear("Hourglass",24,25,1);
    public AdventuringGear inkVial = new AdventuringGear("Ink Vial",25,8,0);
    public AdventuringGear inkPen = new AdventuringGear("Ink Pen",26,0.1,0);
    public AdventuringGear clayJug = new AdventuringGear("Clay Jug",27,0.03,9);
    public AdventuringGear ladder = new AdventuringGear("Ladder",28,0.2,20);
    public AdventuringGear commonLamp = new AdventuringGear("Common Lamp",29,0.1,1);
    public AdventuringGear bullseyeLantern = new AdventuringGear("Bullseye Lantern", 30,12,3);
    public AdventuringGear hoodedLantern = new AdventuringGear("Hooded Lantern",31,7,2);
    public AdventuringGear simpleLock = new AdventuringGear("Lock (Simple)",32,20,1);
    public AdventuringGear averageLock = new AdventuringGear("Lock (Average)",33,20,1);
    public AdventuringGear goodLock = new AdventuringGear("Lock (Good)",34,20,1);
    public AdventuringGear superiorLock = new AdventuringGear("Lock (Superior)",35,20,1);
    public AdventuringGear manacles = new AdventuringGear("Manacles",36,15,2);
    public AdventuringGear masterworkManacles = new AdventuringGear("Manacles (Masterwork)",37,50,2);
    public AdventuringGear smallSteelMirror = new AdventuringGear("Small Steel Mirror",38,10,0.5);
    public AdventuringGear clayMug = new AdventuringGear("ClayMug",39,0.02,1);
    public AdventuringGear oil = new AdventuringGear("Oil",40,.01,1);
    public AdventuringGear paperSheet = new AdventuringGear("Paper (Sheet)",41,0.4,0);
    public AdventuringGear parchmentPaper = new AdventuringGear("Parchment (Sheet)",42,0.2,0);
    public AdventuringGear minersPick = new AdventuringGear("Miner's Pick",43,3,10);
    public AdventuringGear clayPitcher = new AdventuringGear("Clay Pitcher",44,0.02,5);
    public AdventuringGear piton = new AdventuringGear("Piton",45,0.1,0.5);
    public AdventuringGear pole = new AdventuringGear("Pole (10ft)",46,0.05,8);
    public AdventuringGear ironPot = new AdventuringGear("Iron Pot",47,0.8,4);
    public AdventuringGear beltPouch = new AdventuringGear("Belt Pouch",48,1,0.5);
    public AdventuringGear portableRam = new AdventuringGear("Portable Ram",49,10,20);
    public AdventuringGear trailRations = new AdventuringGear("Trail Rations",50,0.5,1);
    public AdventuringGear hempRope = new AdventuringGear("Rope Hemp",51,1,10);
    public AdventuringGear silkRope = new AdventuringGear("Silk Rope",52,10,5);
    public AdventuringGear sack = new AdventuringGear("Sack",53,0.1,0.5);
    public AdventuringGear sealingWax = new AdventuringGear("Sealing Wax",54,1,1);
    public AdventuringGear sewingNeedle = new AdventuringGear("Sewing Needle",55,0.5,0);
    public AdventuringGear shovelSpade = new AdventuringGear("ShovelOrSpade",56,2,8);
    public AdventuringGear signalWhistle = new AdventuringGear("Signal Whistle",57,0.8,0);
    public AdventuringGear signetRing = new AdventuringGear("Signet Ring",58,5,0);
    public AdventuringGear sledge = new AdventuringGear("Sledge",59,1,10);
    public AdventuringGear soap = new AdventuringGear("Soap",60,0.5,1);
    public AdventuringGear spyglass = new AdventuringGear("Spyglass",61,1000,1);
    public AdventuringGear tent = new AdventuringGear("Tent", 62,10,20);
    public AdventuringGear torch = new AdventuringGear("Torch",63,0.01,1);
    public AdventuringGear vial = new AdventuringGear("Vial (Ink Or Potion)",64,1,0);
    public AdventuringGear waterClock = new AdventuringGear("Water Clock",65,1000,200);
    public AdventuringGear waterskin = new AdventuringGear("Waterskin",66,1,4);
    public AdventuringGear whetstone = new AdventuringGear("Whetstone",67,0.02,1);

    //endregion

    //region Substances and Items

    public SubstanceItem acidFlask = new SubstanceItem("Flask (Acid)",68,10,1);
    public SubstanceItem alchemistsFireFlask = new SubstanceItem("Alchemist's Fire (Flask)",69,20,1);
    public SubstanceItem antitoxinVial = new SubstanceItem("Antitoxin (Vial)",70,50,0);
    public SubstanceItem everburningTorch = new SubstanceItem("Everburning Torch",71,110,1);
    public SubstanceItem holyWaterFlask = new SubstanceItem("Holy Water (Flask)",72,25,1);
    public SubstanceItem smokestick = new SubstanceItem("Smokestick",73,20,0.5);
    public SubstanceItem sunrod = new SubstanceItem("Sunrod",74,2,1);
    public SubstanceItem tanglefootBag = new SubstanceItem("Tanglefoot Bag",75,50,4);
    public SubstanceItem thunderstone = new SubstanceItem("Thunderstone",76,30,1);
    public SubstanceItem tinderwig = new SubstanceItem("Tinderwig",77,1,0);

    //endregion

    //region Tools and Skill Kits

    public ToolSkillKit alchemistsLab = new ToolSkillKit("Alchemist's Lab",78,200,40);
    public ToolSkillKit artisansTools = new ToolSkillKit("Artisan's Tools",79,5,5);
    public ToolSkillKit masterworkArtisanTools = new ToolSkillKit("Masterwork Artisan's Tools",80,55,5);
    public ToolSkillKit climbersKit = new ToolSkillKit("Climber's Kit",81,80,5);
    public ToolSkillKit disguiseKit = new ToolSkillKit("Disguise Kit",82,50,8);
    public ToolSkillKit healersKit = new ToolSkillKit("Healer's Kit",83,50,1);
    public ToolSkillKit hollyAndMistletoe = new ToolSkillKit("Holly And Mistletoe",84,0,0);
    public ToolSkillKit woodenHolySymbol = new ToolSkillKit("Wooden Holy Symbol",85,1,0);
    public ToolSkillKit silverHolySymbol = new ToolSkillKit("Silver Holy Symbol",86,25,1);
    public ToolSkillKit magnifyingGlass = new ToolSkillKit("Magnifying Glass",87,100,0);
    public ToolSkillKit commonMusicalInstrument = new ToolSkillKit("Common Musical Instrument",88,5,3);
    public ToolSkillKit masterworkMusicalInstrument = new ToolSkillKit("Masterwork Musical Instrument",89,100,3);
    public ToolSkillKit merchantsScale = new ToolSkillKit("Merchant's Scale",90,2,1);
    public ToolSkillKit spellComponentPouch = new ToolSkillKit("Spell Component Pouch",91,5,2);
    public ToolSkillKit wizardsSpellbook = new ToolSkillKit("Wizard's Spellbook",92,15,3);
    public ToolSkillKit thievesTools = new ToolSkillKit("Thieves' Tools",93,30,1);
    public ToolSkillKit masterworkThievesTools = new ToolSkillKit("Masterwork Thieves' Tools",94,100,2);
    public ToolSkillKit masterworkTool = new ToolSkillKit("Masterwork Tool",95,50,1);

    //endregion

    //region Clothing

    public Clothing artisansOutfit = new Clothing("Artisan's Outfit",96,1,4);
    public Clothing clericsVestments = new Clothing("Cleric's Vestments",97,5,6);
    public Clothing coldWeatherOutfit = new Clothing("Cold-Weather Outfit",98,8,7);
    public Clothing courtiersOutfit = new Clothing("Courtier’s Outfit",99,30,6);
    public Clothing entertainersOutfit = new Clothing("Entertainer’s Outfit",100,3,4);
    public Clothing explorersOutfit = new Clothing("Explorer's Outfit",101,10,8);
    public Clothing monksOutfit = new Clothing("Monk's Outfit",102,5,2);
    public Clothing noblesOutfit = new Clothing("Noble's Outfit",103,75,10);
    public Clothing peasantsOutfit = new Clothing("Peasant's Outfit",104,0.1,2);
    public Clothing royalOutfit = new Clothing("Royal Outfit",105,200,15);
    public Clothing scholarsOutfit = new Clothing("Scholar's Outfit",106,5,6);
    public Clothing travelersOutfit = new Clothing("Traveler's Outfit",107,1,5);

    //endregion

    //region Food, Drink, and Lodging

    public Drink aleGallon = new Drink("Ale (Gallon)",108,0.2,8);
    public Drink aleMug = new Drink("Ale (Mug)",109,0.04,1);
    public Food banquet = new Food("Banquet",110,10,0);
    public Food breadLoad = new Food("Loaf Of Bread",111,0.02,0.5);
    public Food cheeseHunk = new Food("Hunk Of Cheese",112,0.1,0.5);
    public Lodging poorInn = new Lodging("Inn Stay (Poor)",113,0.2);
    public Lodging commonInn = new Lodging("Inn Stay (Common)",114,0.5);
    public Lodging goodInn = new Lodging("Inn Stay (Good)",115,2);
    public Lodging poorMeal = new Lodging("Meal (Poor)",113,0.1);
    public Lodging commonMeal = new Lodging("Meal (Common)",114,0.3);
    public Lodging goodMeal = new Lodging("Meal (Good)",115,5);
    public Food meatChunk = new Food("Chunk Of Meat",116,0.3,0.5);
    public Drink commonWinePitcher = new Drink("Common Wine (Pitcher)",117,0.2,6);
    public Drink fineWineBottle = new Drink("Fine Wine (Bottle)",118,10,1);

    //endregion

    //region Mounts and Related Gear

    public MountGear medBarding = new MountGear("Med. Creature Barding",119,2,1);
    public MountGear larBarding = new MountGear("Large Creature Barding",120,4,2);
    public MountGear bitBridle = new MountGear("Bit And Bridle",121,2,1);
    public Mount guardDog = new Mount("Guard Dog",122,25);
    public Mount ridingDog = new Mount("Riding Dog",123,150);
    public Mount donkeyMule = new Mount("Donkey / Mule",124,8);
    public Food feed = new Food("Feed",125,0.05,10);
    public Mount heavyHorse = new Mount("Heavy Horse",126,200);
    public Mount heavyHorseCT = new Mount("Heavy Horse (Combat Trained",127,300);
    public Mount lightHorse = new Mount("Light Horse",128,75);
    public Mount lightHorseCT = new Mount("Light Horse (Combat Trained)",129,110);
    public Mount pony = new Mount("Pony",130,30);
    public Mount ponyCT = new Mount("Pont (Combat Trained)",131,45);
    public MountGear militarySaddle = new MountGear("Military Saddle",132,20,30);
    public MountGear packSaddle = new MountGear("Pack Saddle",133,5,15);
    public MountGear ridingSaddle = new MountGear("Riding Saddle",134,10,25);
    public MountGear militaryExoticSaddle = new MountGear("Military Exotic Saddle",135,60,40);
    public MountGear packExoticSaddle = new MountGear("Pack Exotic Saddle",136,15,20);
    public MountGear ridingExoticSaddle = new MountGear("Riding Exotic Saddle",137,30,30);
    public MountGear saddlebags = new MountGear("Saddlebags",138,4,8);
    public Service stabling = new Service("Stabling",139,0.5);

    //endregion

    //region Transport

    public Transport carriage = new Transport("Carriage",140,100,600);
    public Transport cart = new Transport("Cart",141,15,200);
    public Transport galley = new Transport("Galley",142,30000,0);
    public Transport keelboat = new Transport("Keelboat",143,3000,0);
    public Transport longship = new Transport("Longship",144,10000,0);
    public Transport rowboat = new Transport("Rowboat",145,50,100);
    public Transport oar = new Transport("Oar",146,2,10);
    public Transport sailingShip = new Transport("Sailing Ship",147,10000,0);
    public Transport sled = new Transport("Sled",148,20,300);
    public Transport wagon = new Transport("Wagon",149,35,400);
    public Transport warship = new Transport("Warship",150,25000,0);

    //endregion

    //region Spellcasting and Services

    public SpellcastingService coachCab = new SpellcastingService("Coach Cab",151,3);
    public SpellcastingService trainedHireling = new SpellcastingService("Trained Hireling",152,0.3);
    public SpellcastingService untrainedHireling = new SpellcastingService("Untrained Hireling",153,0.1);
    public SpellcastingService messenger = new SpellcastingService("Messenger",154,0.02);
    public SpellcastingService roadGateToll = new SpellcastingService("Road / Gate Toll",155,0.01);
    public SpellcastingService shipPassage = new SpellcastingService("Ship's Passage",156,0.1);
    public SpellcastingService spellcasting = new SpellcastingService("Spellcasting",157, 10);

    //endregion

}