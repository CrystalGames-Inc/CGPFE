package Game.Data.Storage.World;

import Game.Data.Models.ItemTypes.Goods.Good;

public class Goods {

    //region Adventuring Gear

    public Good backpack = new Good("Backpack",0,2,2);
    public Good barrel = new Good("Barrel",1,2,30);
    public Good basket = new Good("Basket",2,2,1);
    public Good bedroll = new Good("Bedroll",3,0.1,5);
    public Good bell = new Good("Bell",4,1, 0);
    public Good winterBlanket = new Good("Winter Blanket",5,0.5,3);
    public Good blockAndTackle = new Good("Block And Tackle",6,5,5);
    public Good glassBottle = new Good("Glass Bottle",7,2,1);
    public Good bucket = new Good("Bucket",8,0.5,2);
    public Good caltrops = new Good("Caltrops",9,1,2);
    public Good candle = new Good("Candle",10,0.01,0);
    public Good canvas = new Good("Canvas",11,0.1,1);
    public Good CMP = new Good("Case, Map Or Scroll",12,1,0.5);
    public Good chain = new Good("Chain",13,30,2);
    public Good chalk = new Good("Chalk",14,1,0);
    public Good chest = new Good("Chest",15,2,25);
    public Good crowbar = new Good("Crowbar",16,2,5);
    public Good firewood = new Good("Firewood",17,1,20);
    public Good fishhook = new Good("Fishhook",18,0.1,0);
    public Good fishingNet = new Good("Fishing Net",19,4,5);
    public Good flask = new Good("Flask",20,3,0.5);
    public Good flintAndSteel = new Good("Flint And Steel",21,1,0);
    public Good grapplingHook = new Good("Grappling Hook",22,1,4);
    public Good hammer = new Good("Hammer", 23,0.5,2);
    public Good hourglass = new Good("Hourglass",24,25,1);
    public Good inkVial = new Good("Ink Vial",25,8,0);
    public Good inkPen = new Good("Ink Pen",26,0.1,0);
    public Good clayJug = new Good("Clay Jug",27,0.03,9);
    public Good ladder = new Good("Ladder",28,0.2,20);
    public Good commonLamp = new Good("Common Lamp",29,0.1,1);
    public Good bullseyeLantern = new Good("Bullseye Lantern", 30,12,3);
    public Good hoodedLantern = new Good("Hooded Lantern",31,7,2);
    public Good simpleLock = new Good("Lock (Simple)",32,20,1);
    public Good averageLock = new Good("Lock (Average)",33,20,1);
    public Good goodLock = new Good("Lock (Good)",34,20,1);
    public Good superiorLock = new Good("Lock (Superior)",35,20,1);
    public Good manacles = new Good("Manacles",36,15,2);
    public Good masterworkManacles = new Good("Manacles (Masterwork)",37,50,2);
    public Good smallSteelMirror = new Good("Small Steel Mirror",38,10,0.5);
    public Good clayMug = new Good("ClayMug",39,0.02,1);
    public Good oil = new Good("Oil",40,.01,1);
    public Good paperSheet = new Good("Paper (Sheet)",41,0.4,0);
    public Good parchmentPaper = new Good("Parchment (Sheet)",42,0.2,0);
    public Good minersPick = new Good("Miner's Pick",43,3,10);
    public Good clayPitcher = new Good("Clay Pitcher",44,0.02,5);
    public Good piton = new Good("Piton",45,0.1,0.5);
    public Good pole = new Good("Pole (10ft)",46,0.05,8);
    public Good ironPot = new Good("Iron Pot",47,0.8,4);
    public Good beltPouch = new Good("Belt Pouch",48,1,0.5);
    public Good portableRam = new Good("Portable Ram",49,10,20);
    public Good trailRations = new Good("Trail Rations",50,0.5,1);
    public Good hempRope = new Good("Rope Hemp",51,1,10);
    public Good silkRope = new Good("Silk Rope",52,10,5);
    public Good sack = new Good("Sack",53,0.1,0.5);
    public Good sealingWax = new Good("Sealing Wax",54,1,1);
    public Good sewingNeedle = new Good("Sewing Needle",55,0.5,0);
    public Good shovelSpade = new Good("ShovelOrSpade",56,2,8);
    public Good signalWhistle = new Good("Signal Whistle",57,0.8,0);
    public Good signetRing = new Good("Signet Ring",58,5,0);
    public Good sledge = new Good("Sledge",59,1,10);
    public Good soap = new Good("Soap",60,0.5,1);
    public Good spyglass = new Good("Spyglass",61,1000,1);
    public Good tent = new Good("Tent", 62,10,20);
    public Good torch = new Good("Torch",63,0.01,1);
    public Good vial = new Good("Vial (Ink Or Potion)",64,1,0);
    public Good waterClock = new Good("Water Clock",65,1000,200);
    public Good waterskin = new Good("Waterskin",66,1,4);
    public Good whetstone = new Good("Whetstone",67,0.02,1);

    //endregion

    //region Substances and Items

    public Good acidFlask = new Good("Flask (Acid)",68,10,1);
    public Good alchemistsFireFlask = new Good("Alchemist's Fire (Flask)",69,20,1);
    public Good antitoxinVial = new Good("Antitoxin (Vial)",70,50,0);
    public Good everburningTorch = new Good("Everburning Torch",71,110,1);
    public Good holyWaterFlask = new Good("Holy Water (Flask)",72,25,1);
    public Good smokestick = new Good("Smokestick",73,20,0.5);
    public Good sunrod = new Good("Sunrod",74,2,1);
    public Good tanglefootBag = new Good("Tanglefoot Bag",75,50,4);
    public Good thunderstone = new Good("Thunderstone",76,30,1);
    public Good tinderwig = new Good("Tinderwig",77,1,0);

    //endregion

    //region Tools and Skill Kits

    public Good alchemistsLab = new Good("Alchemist's Lab",78,200,40);
    public Good artisansTools = new Good("Artisan's Tools",79,5,5);
    public Good masterworkArtisanTools = new Good("Masterwork Artisan's Tools",80,55,5);
    public Good climbersKit = new Good("Climber's Kit",81,80,5);
    public Good disguiseKit = new Good("Disguise Kit",82,50,8);
    public Good healersKit = new Good("Healer's Kit",83,50,1);
    public Good hollyAndMistletoe = new Good("Holly And Mistletoe",84,0,0);
    public Good woodenHolySymbol = new Good("Wooden Holy Symbol",85,1,0);
    public Good silverHolySymbol = new Good("Silver Holy Symbol",86,25,1);
    public Good magnifyingGlass = new Good("Magnifying Glass",87,100,0);
    public Good commonMusicalInstrument = new Good("Common Musical Instrument",88,5,3);
    public Good masterworkMusicalInstrument = new Good("Masterwork Musical Instrument",89,100,3);
    public Good merchantsScale = new Good("Merchant's Scale",90,2,1);
    public Good spellComponentPouch = new Good("Spell Component Pouch",91,5,2);
    public Good wizardsSpellbook = new Good("Wizard's Spellbook",92,15,3);
    public Good thievesTools = new Good("Thieves' Tools",93,30,1);
    public Good masterworkThievesTools = new Good("Masterwork Thieves' Tools",94,100,2);
    public Good masterworkTool = new Good("Masterwork Tool",95,50,1);

    //endregion

}