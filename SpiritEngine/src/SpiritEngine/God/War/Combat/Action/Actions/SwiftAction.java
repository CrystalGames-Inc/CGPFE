package SpiritEngine.God.War.Combat.Action.Actions;

import SpiritEngine.God.War.Combat.Action.CombatAction;
import SpiritEngine.God.War.Combat.Action.Type;

public class SwiftAction extends CombatAction {
    public SwiftAction(String name, boolean attackOfOpportunity) {
        super(name, Type.SWIFT, attackOfOpportunity);
    }
}
