import Project02.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobertTesting {
    //String nation, String tribe, int lifePoints, Strategy strategy
    @Test
    public void testNewPeople() {
        People RobWizard = new RobertWizard("RobNation", "RobTribe", 200, new RobertWizardStrategy());
        People RobWar = new RobertWarrior("BobbyNation", "BobbyTribe", 200, new RobertWarriorStrategy());
        System.out.println(RobWizard);
        System.out.println(RobWar);
    }

    @Test
    public void testLifePoints() {
        People RobWizard = new RobertWizard("RobNation", "RobTribe", 200, new RobertWizardStrategy());
        People RobWar = new RobertWarrior("BobbyNation", "BobbyTribe", 200, new RobertWarriorStrategy());
        assertEquals(200, RobWar.getLifePoints());
        assertEquals(200, RobWizard.getLifePoints());
    }

    @Test
    public void ManipulateTheLifePoints() {
        People RobWizard = new RobertWizard("RobNation", "RobTribe", 200, new RobertWizardStrategy());
        People RobWar = new RobertWarrior("BobbyNation", "BobbyTribe", 200, new RobertWarriorStrategy());
        RobWizard.encounterLifePoints(RobWizard, RobWar);
        System.out.println(RobWizard.getLifePoints());
        System.out.println(RobWar.getLifePoints());
    }

    @Test
    public void testEncounter() {
        World w = new World();
        RobertWarrior wiz = new RobertWarrior("Bruh", "A tribe", 100, new RobertWarriorStrategy());
        RobertWarrior wiz2 = new RobertWarrior("BRUHHHH", "B tribe", 100, new RobertWarriorStrategy());
        w.encounter(wiz.getLifePoints(), wiz2.getLifePoints());
        System.out.println(wiz.getLifePoints());
        System.out.println(wiz2.getLifePoints());
    }
}
