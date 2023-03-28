package Project02;

/**
 * the RobertWizard class extends the abstract People and contains a constructor and an override method for encounterLifePoints
 */
public class RobertWizard extends People{


    /**
     *
     * @param nation
     * @param tribe
     * @param lifePoints
     * @param strategy
     * The RobertWizard constructor takes in the parameters above and calls super() to initialize these variables
     * and it also sets the Description of the Warrior
     */
    public RobertWizard(String nation, String tribe, int lifePoints, Strategy strategy)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints, strategy);
        myDescription = "\tRobert Wizard";

    }

    /**
     *
     * @param me
     * @param otherPerson
     * @return int
     * The encounterLifePoints method takes in two people as parameters and returns there the remaining life points
     * after the encounterStrategy is performed
     */
    @Override
    public int encounterLifePoints(People me, People otherPerson)
    {
        return encounterStrategy.strategy(me, otherPerson);
    }
}
