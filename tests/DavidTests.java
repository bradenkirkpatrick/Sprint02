import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DavidTests {
    
    @Test
    public void pepegaDriving() {
        DavidWarrior dw = new DavidWarrior("Papal States", "Catholicism", 69, new DavidWarriorStrategy());
        DavidWizard dwz = new DavidWizard("DEVS VVLT", "iesus nazarenus rex iudeorum", 33, new DavidWizardStrategy());
        assertEquals(69, dw.getLifePoints());


    }
}

