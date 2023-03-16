package tests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Project02.DavidWarrior;
import Project02.DavidWarriorStrategy;
import Project02.DavidWizard;
import Project02.DavidWizardStrategy;

public class DavidTests {
    
    @Test
    public void pepegaDriving() {
        DavidWarrior dw = new DavidWarrior("Papal States", "Catholicism", 69, new DavidWarriorStrategy());
        DavidWizard dwz = new DavidWizard("DEVS VVLT", "iesus nazarenus rex iudeorum", 33, new DavidWizardStrategy());
        assertEquals(69, dw.getLifePoints());


    }
}

