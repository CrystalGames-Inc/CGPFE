package CGPFE.God.War.Combat.Action.Actions;

import CGPFE.God.War.Combat.Action.CombatAction;
import CGPFE.God.War.Combat.Action.Type;

public class SwiftAction extends CombatAction {
    public SwiftAction(String name, boolean attackOfOpportunity) {
        super(name, Type.SWIFT, attackOfOpportunity);
    }
}
