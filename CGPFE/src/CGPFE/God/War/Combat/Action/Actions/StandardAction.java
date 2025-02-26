package CGPFE.God.War.Combat.Action.Actions;

import CGPFE.God.War.Combat.Action.CombatAction;
import CGPFE.God.War.Combat.Action.Type;

public class StandardAction extends CombatAction {
    public StandardAction(String name, boolean attackOfOpportunity){
        super(name, Type.STANDARD, attackOfOpportunity);
    }
}