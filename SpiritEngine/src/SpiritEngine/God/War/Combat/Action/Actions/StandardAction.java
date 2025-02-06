package SpiritEngine.God.War.Combat.Action.Actions;

import SpiritEngine.God.War.Combat.Action.Action;
import SpiritEngine.God.War.Combat.Action.Type;

public class StandardAction extends Action {
    public StandardAction(String name, boolean attackOfOpportunity) {
        super(name, Type.STANDARD, attackOfOpportunity);
    }
}
