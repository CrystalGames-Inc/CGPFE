package SpiritEngine.God.War.Combat.Action.Actions;

import SpiritEngine.God.War.Combat.Action.CombatAction;
import SpiritEngine.God.War.Combat.Action.Type;

public class FreeAction extends CombatAction {
    public FreeAction(String name, boolean attackOfOpportunity) {
        super(name, Type.FREE, attackOfOpportunity);
    }
}