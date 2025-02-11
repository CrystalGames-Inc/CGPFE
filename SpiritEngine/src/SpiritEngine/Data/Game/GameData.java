package SpiritEngine.Data.Game;

import SpiritEngine.World.World;
import SpiritEngine.Data.Game.StoryModifiers.AbilityScoreType;
import SpiritEngine.Data.Game.StoryModifiers.Fantasty;
import SpiritEngine.Data.Game.StoryModifiers.GameSpeed;

/**
 * @param gameFantasty     Fantasty level point distribution:
 *                         Low - 10 points
 *                         Standard - 15 points
 *                         High - 20 points
 *                         Epic - 20 points
 * @param abilityScoreType Determines how Ability Points are distributed in the beginning of the game (when creating a character)
 * @param gameSpeed        Determines how much XP is needed to level up
 */
public record GameData(Fantasty gameFantasty, AbilityScoreType abilityScoreType, GameSpeed gameSpeed, World gameWorld) {

}