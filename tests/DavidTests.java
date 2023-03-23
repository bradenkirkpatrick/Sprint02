import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DavidTests {
    
    @Test
    public void testPeople() {
        DavidWarrior dw = new DavidWarrior("Papal States", "Catholic Church", 69, new DavidWarriorStrategy());
        DavidWizard dwz = new DavidWizard("DEVS VVLT", "iesus nazarenus rex iudeorum", 33, new DavidWizardStrategy());
        assertEquals("DEVS VVLT", dwz.getNation());
        assertEquals(33, dwz.getLifePoints());
        assertEquals("Papal States", dw.getNation());
        assertEquals("Catholic Church", dw.getTribe());
    }

    @Test
    public void testEncounter() {
        World w = new World();
        DavidWizard wiz = new DavidWizard("the moon", "a tribe", 87, new DavidWizardStrategy());
        DavidWizard wiz2 = new DavidWizard("the moon", "a tribe", 87 , new DavidWizardStrategy());
        DavidWizardStrategy wizstrat = new DavidWizardStrategy();
        DavidWarriorStrategy warstrat = new DavidWarriorStrategy();
        assertEquals(87, wiz.getLifePoints());
        assertEquals(87, wiz2.getLifePoints());
        wizstrat.strategy(wiz, wiz2);
        w.encounter(wiz.getLifePoints(), wiz2.getLifePoints());
        System.out.println(wiz.getLifePoints());        

    }

    @Test
    public void testNumberTheNumberValveNeverReachesLol() {
        World w = new World();
        Nation i = new Nation("Israel", 1000);
        DavidWizard dwiz = new DavidWizard("Israel", "Dan",  100, new DavidWizardStrategy());
        DavidWizard dwar = new DavidWizard("Edom", "huh", 80, new DavidWarriorStrategy());
        w.encounter(dwiz.getLifePoints(), dwar.getLifePoints());
    }
}

