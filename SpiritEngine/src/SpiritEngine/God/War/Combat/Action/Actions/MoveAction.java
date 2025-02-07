package SpiritEngine.God.War.Combat.Action.Actions;

import SpiritEngine.God.War.Combat.Action.CombatAction;
import SpiritEngine.God.War.Combat.Action.Type;

public class MoveAction extends CombatAction {
    public MoveAction(String name, boolean attackOfOpportunity) {
        super(name, Type.MOVE, attackOfOpportunity);
    }
}
