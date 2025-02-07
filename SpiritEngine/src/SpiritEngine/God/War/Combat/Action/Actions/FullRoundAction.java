package SpiritEngine.God.War.Combat.Action.Actions;

import SpiritEngine.God.War.Combat.Action.CombatAction;
import SpiritEngine.God.War.Combat.Action.Type;

public class FullRoundAction extends CombatAction {

    public FullRoundAction(String name, boolean attackOfOpportunity) {
        super(name, Type.FULLROUND, attackOfOpportunity);
    }
}
