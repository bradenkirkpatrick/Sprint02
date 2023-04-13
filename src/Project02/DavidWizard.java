package Project02;

/*
 * This class implements a distinct Wizard with its own unique strategy
 */
public class DavidWizard extends People {
    public DavidWizard(String nation, String tribe, int lifePoints, Strategy strategy)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints, strategy);
        myDescription = "\tsussy";

    }

    /**
     * Implements DavidWizardStrategy
     */
    @Override
    public int encounterLifePoints(People me, People otherPerson)
    {
        return encounterStrategy.strategy(me, otherPerson);
    }

}
