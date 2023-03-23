package Project02;

public class BradenWarrior extends People {
    public BradenWarrior(String nation, String tribe, int lifePoints, Strategy strategy) {
        super(nation, tribe, PeopleType.wizard, lifePoints, strategy);
        myDescription = "Now i am become death, destroyer of worlds";

    }
    @Override
    public int encounterLifePoints(People me, People otherPerson) {
        return encounterStrategy.strategy(me, otherPerson);
    }
}
