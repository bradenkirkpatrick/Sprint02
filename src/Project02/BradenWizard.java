package Project02;
/**
 * The braden wizard strategy is that of self sacrtifce. 
 * the braden wizard will transfer all of its health points to a wizard
 * of its own nation that has more health points than it.
 * @param me - person to get life points for.
 * @param otherPerson - the opponent of the encounter
 * @return - Life points to use in the encounter
 */
public class BradenWizard extends People{
    public BradenWizard(String nation, String tribe, int lifePoints, Strategy strategy) {
        super(nation, tribe, PeopleType.wizard, lifePoints, strategy);
        myDescription = "Beep boop beep boop";
    }

    /*
     * implements the braden wizard strategy
     * @param me People
     * @param otherPerson People
     */
    @Override
    public int encounterLifePoints(People me, People otherPerson) {
        return encounterStrategy.strategy(me, otherPerson);
    }
}
