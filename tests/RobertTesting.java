import Project02.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobertTesting {
    //String nation, String tribe, int lifePoints, Strategy strategy
    @Test
    public void testNewPeople(){
        People RobWizard = new RobertWizard("RobNation", "RobTribe", 200, new RobertWizardStrategy());
        People RobWar = new RobertWarrior("BobbyNation", "BobbyTribe", 200, new RobertWarriorStrategy());
        System.out.println(RobWizard);
        System.out.println(RobWar);
    }

    @Test
    public void testLifePoints(){
        People RobWizard = new RobertWizard("RobNation", "RobTribe", 200, new RobertWizardStrategy());
        People RobWar = new RobertWarrior("BobbyNation", "BobbyTribe", 200, new RobertWarriorStrategy());
        assertEquals(200, RobWar.getLifePoints());
        assertEquals(200, RobWizard.getLifePoints());
        System.out.println(RobWizard.encounterLifePoints(RobWizard, RobWar));

    }
}
