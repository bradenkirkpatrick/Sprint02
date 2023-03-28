import Project02.*;

import org.junit.jupiter.api.Test;
public class BradenTests {
    //String nation, String tribe, int lifePoints, Strategy strategy
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

    @Test
    public static void testDifferentNation(){
        World world = new World();
        People wiz1 = new BradenWizard("Eins", "A", 20, new BradenWizardStrategy());
        People wiz2 = new BradenWarrior("Zwei", "B", 20, new BradenWizardStrategy());
        assert(wiz1.encounterLifePoints(wiz1, wiz2) == 20);
        assert(wiz2.encounterLifePoints(wiz2, wiz1) == 20);
        world.encounter(wiz1.encounterLifePoints(wiz1, wiz2), wiz2.encounterLifePoints(wiz2, wiz1));
        assert(wiz1.getLifePoints() < 20);
        assert(wiz2.getLifePoints() < 20);
    }
}
