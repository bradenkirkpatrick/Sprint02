package Project02;
/*
 * Braden warrior is a class used to implement 
 * the braden warrior strategy into a people
 */
public class BradenWarrior extends People {
    public BradenWarrior(String nation, String tribe, int lifePoints, Strategy strategy) {
        super(nation, tribe, PeopleType.warrior, lifePoints, strategy);
        myDescription = ". . .";
    }

    /*
     * implements the braden warrior strategy
     */
    @Override
    public int encounterLifePoints(People me, People otherPerson) {
        return encounterStrategy.strategy(me, otherPerson);
    }
}
