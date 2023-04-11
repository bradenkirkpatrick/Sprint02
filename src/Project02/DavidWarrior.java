package Project02;

/*
 * This class implements a distinct Warrior with its own unique strategy.
 */
public class DavidWarrior extends People {
    public DavidWarrior(String nation, String tribe, int lifePoints, Strategy warriorStrategy) {
        super(nation, tribe, PeopleType.warrior, lifePoints, warriorStrategy);
        myDescription = "\tDEVS VVLT";
    }

    /**
     * Implements DavidWarriorStrategy.
     */
    @Override
    public int encounterLifePoints(People me, People otherPerson) {
        return encounterStrategy.strategy(me, otherPerson);
    }
    
}
