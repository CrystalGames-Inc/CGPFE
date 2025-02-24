package CGPFE.God.War.Combat.Action.Actions;

import CGPFE.God.War.Combat.Action.CombatAction;
import CGPFE.God.War.Combat.Action.Type;

public class ImmediateAction extends CombatAction {
    public ImmediateAction(String name, boolean attackOfOpportunity) {
        super(name, Type.IMMEDIATE, attackOfOpportunity);
    }
}
