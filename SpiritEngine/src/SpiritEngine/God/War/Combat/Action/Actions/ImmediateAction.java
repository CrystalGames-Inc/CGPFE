package SpiritEngine.God.War.Combat.Action.Actions;

import SpiritEngine.God.War.Combat.Action.CombatAction;
import SpiritEngine.God.War.Combat.Action.Type;

public class ImmediateAction extends CombatAction {
    public ImmediateAction(String name, boolean attackOfOpportunity) {
        super(name, Type.IMMEDIATE, attackOfOpportunity);
    }
}
