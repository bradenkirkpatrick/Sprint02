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
        
    }
}

