package Project02;

/**
 * the RobertWarrior class extends the abstract People and contains a constructor and an override method for encounterLifePoints
 */
public class RobertWarrior extends People{
    /**
     *
     * @param nation
     * @param tribe
     * @param lifePoints
     * @param warriorStrategy
     * The RobertWarrior constructor takes in the parameters above and calls super() to initialize these variables
     * and it also sets the Description of the Warrior
     */
    public RobertWarrior(String nation, String tribe, int lifePoints, Strategy warriorStrategy) {
        super(nation, tribe, PeopleType.warrior, lifePoints, warriorStrategy);
        myDescription = "\tRobert Warrior";
    }

    /**
     *
     * @param me
     * @param otherPerson
     * @return int
     * The encounterLifePoints method takes in two people as parameters and and returns there the remaining life points
     * after the encounterStrategy is performed
     */
    @Override
    public int encounterLifePoints(People me, People otherPerson) {
        return encounterStrategy.strategy(me, otherPerson);
    }
}
