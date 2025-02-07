package SpiritEngine.God.War.Combat.Action.Actions;

import SpiritEngine.God.War.Combat.Action.CombatAction;
import SpiritEngine.God.War.Combat.Action.Type;

public class StandardAction extends CombatAction {
    public StandardAction(String name, boolean attackOfOpportunity){
        super(name, Type.STANDARD, attackOfOpportunity);
    }
}