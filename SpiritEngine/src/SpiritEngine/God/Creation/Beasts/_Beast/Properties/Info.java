package SpiritEngine.God.Creation.Beasts._Beast.Properties;

import SpiritEngine.God.Creation.Importance.Constants.Alignment;
import SpiritEngine.God.Creation.Importance.Constants.Class;
import SpiritEngine.God.Creation.Importance.Constants.Race;
import SpiritEngine.God.Creation.Importance.Constants.Size;

/**
 * @param cr Challenge Rating
 */
public record Info(String name, double cr, int xp, Race race, Class bClass, int level, Alignment alignment, Size size,
                   Type type, int initMod) {
}