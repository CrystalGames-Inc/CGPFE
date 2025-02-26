package CGPFE.God.War.Combat.Action.Actions;

import CGPFE.God.War.Combat.Action.CombatAction;
import CGPFE.God.War.Combat.Action.Type;

public class FreeAction extends CombatAction {
    public FreeAction(String name, boolean attackOfOpportunity) {
        super(name, Type.FREE, attackOfOpportunity);
    }
}