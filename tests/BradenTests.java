import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;;

public class BradenTests {
    /*
     * testSameNationWarxWiz is a test that checks the functionality when
     * encounters are between a bradenwarrior and a bradenwizard of the same nation 
     */
    @Test
    public void testSameNationWarxWiz(){
        World world = new World();
        People wiz = new BradenWizard("Eins", "A", 20, new BradenWizardStrategy());
        People war = new BradenWarrior("Eins", "B", 20, new BradenWarriorStrategy());
        assertTrue(wiz.encounterLifePoints(wiz, war) == 0);
        assertTrue(war.encounterLifePoints(war, wiz) == -19);
        
    }

    /*
     * testSameNationWarxWiz is a test that checks the functionality when
     * encounters are between 2 bradenwizards of the same nation 
     */
    @Test
    public void testSameNationWizxWiz(){
        World world = new World();
        People wiz1 = new BradenWizard("Eins", "A", 20, new BradenWizardStrategy());
        People wiz2 = new BradenWizard("Eins", "B", 20, new BradenWizardStrategy());
        assertTrue(wiz1.encounterLifePoints(wiz1, wiz2) == 0);
        assertTrue(wiz2.encounterLifePoints(wiz2, wiz1) == 0);
        world.encounter(wiz1.encounterLifePoints(wiz1, wiz2), wiz2.encounterLifePoints(wiz2, wiz1));
        assertTrue(wiz1.getLifePoints() == 20);
        assertTrue(wiz2.getLifePoints() == 20);
    }

    /*
     * testSameNationWarxWiz is a test that checks the functionality when
     * encounters are between 2 bradenwizards of the different nation 
     */
    @Test
    public void testWizDifferentNation(){
        World world = new World();
        People wiz1 = new BradenWizard("Eins", "A", 20, new BradenWizardStrategy());
        People wiz2 = new BradenWizard("Zwei", "B", 20, new BradenWizardStrategy());
        assertTrue(wiz1.encounterLifePoints(wiz1, wiz2) == 20);
        assertTrue(wiz2.encounterLifePoints(wiz2, wiz1) == 20);
    }

    /*
     * testSameNationWarxWiz is a test that checks the functionality when
     * encounters are between 2 bradenwarriors of the different nation 
     */
    @Test
    public void testWarDifferentNation(){
        World world = new World();
        People war1 = new BradenWarrior("Eins", "A", 20, new BradenWarriorStrategy());
        People war2 = new BradenWarrior("Zwei", "B", 20, new BradenWarriorStrategy());
        assertTrue(war1.encounterLifePoints(war1, war2) == 20);
        assertTrue(war2.encounterLifePoints(war2, war1) == 20);
    }
}
