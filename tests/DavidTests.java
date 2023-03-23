import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DavidTests {
    
    @Test
    public void testPeople() {
        DavidWarrior dw = new DavidWarrior("Papal States", "Catholicism", 69, new DavidWarriorStrategy());
        DavidWizard dwz = new DavidWizard("DEVS VVLT", "iesus nazarenus rex iudeorum", 33, new DavidWizardStrategy());
        assertEquals(69, dw.getLifePoints());
        assertEquals(33, dwz.getLifePoints());
    }

    @Test
    public void testEncounter() {
        World w = new World();
        DavidWizard wiz = new DavidWizard("the moon", "a tribe", 87, new DavidWizardStrategy());
        DavidWizard wiz2 = new DavidWizard("the moon", "a tribe", 87 , new DavidWizardStrategy());
        w.encounter(wiz.getLifePoints(), wiz2.getLifePoints());
        assertEquals(87, wiz.getLifePoints());

    }

    @Test
    public void testNumberTheNumberValveNeverReachesLol() {
        World w = new World();
        DavidWizard dwiz = new DavidWizard("Israel", "Dan",  100, new DavidWizardStrategy());
        DavidWizard dwar = new DavidWizard("Edom", "lol idk", 80, new DavidWarriorStrategy());
        w.encounter(dwiz.getLifePoints(), dwar.getLifePoints());

    }
}

