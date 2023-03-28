import Project02.*;

import org.junit.jupiter.api.Test;
public class BradenTests {
    /*
     * testSameNationWarxWiz is a test that checks the functionality when
     * encounters are between a bradenwarrior and a bradenwizard of the same nation 
     */
    @Test
    public static void testSameNationWarxWiz(){
        World world = new World();
        People wiz = new BradenWizard("Eins", "A", 20, new BradenWizardStrategy());
        People war = new BradenWarrior("Eins", "B", 20, new BradenWarriorStrategy());
        assert(wiz.encounterLifePoints(wiz, war) == 0);
        assert(war.encounterLifePoints(war, wiz) == 19);
        world.encounter(war.encounterLifePoints(war, wiz), wiz.encounterLifePoints(wiz, war));
        assert(war.isPersonAlive() == false);
        
    }

    /*
     * testSameNationWarxWiz is a test that checks the functionality when
     * encounters are between 2 bradenwizards of the same nation 
     */
    @Test
    public static void testSameNationWizxWiz(){
        World world = new World();
        People wiz1 = new BradenWizard("Eins", "A", 20, new BradenWizardStrategy());
        People wiz2 = new BradenWarrior("Eins", "B", 20, new BradenWizardStrategy());
        assert(wiz1.encounterLifePoints(wiz1, wiz2) == 0);
        assert(wiz2.encounterLifePoints(wiz2, wiz1) == 0);
        world.encounter(wiz1.encounterLifePoints(wiz1, wiz2), wiz2.encounterLifePoints(wiz2, wiz1));
        assert(wiz1.getLifePoints() == 20);
        assert(wiz2.getLifePoints() == 20);
    }

    /*
     * testSameNationWarxWiz is a test that checks the functionality when
     * encounters are between 2 bradenwizards of the different nation 
     */
    @Test
    public static void testWizDifferentNation(){
        World world = new World();
        People wiz1 = new BradenWizard("Eins", "A", 20, new BradenWizardStrategy());
        People wiz2 = new BradenWizard("Zwei", "B", 20, new BradenWizardStrategy());
        assert(wiz1.encounterLifePoints(wiz1, wiz2) == 20);
        assert(wiz2.encounterLifePoints(wiz2, wiz1) == 20);
        world.encounter(wiz1.encounterLifePoints(wiz1, wiz2), wiz2.encounterLifePoints(wiz2, wiz1));
        assert(wiz1.getLifePoints() < 20);
        assert(wiz2.getLifePoints() < 20);
    }

    /*
     * testSameNationWarxWiz is a test that checks the functionality when
     * encounters are between 2 bradenwarriors of the different nation 
     */
    @Test
    public static void testWarDifferentNation(){
        World world = new World();
        People war1 = new BradenWizard("Eins", "A", 20, new BradenWizardStrategy());
        People war2 = new BradenWizard("Zwei", "B", 20, new BradenWizardStrategy());
        assert(war1.encounterLifePoints(war1, war2) == 20);
        assert(war2.encounterLifePoints(war2, war1) == 20);
        world.encounter(war1.encounterLifePoints(war1, war2), war2.encounterLifePoints(war2, war1));
        assert(war1.getLifePoints() < 20);
        assert(war2.getLifePoints() < 20);
    }
}
