package CGPFE.God.War.Combat.Action.Actions;

import CGPFE.God.War.Combat.Action.CombatAction;
import CGPFE.God.War.Combat.Action.Type;

public class NoAction extends CombatAction {
    public NoAction(String name, boolean attackOfOpportunity) {
        super(name, Type.NONE, attackOfOpportunity);
    }
}
