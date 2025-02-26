package CGPFE.God.War.Combat.Action.Actions;

import CGPFE.God.War.Combat.Action.CombatAction;
import CGPFE.God.War.Combat.Action.Type;

public class MoveAction extends CombatAction {
    public MoveAction(String name, boolean attackOfOpportunity) {
        super(name, Type.MOVE, attackOfOpportunity);
    }
}
