package Project02;

public class DavidWarrior extends People {
    public DavidWarrior(String nation, String tribe, int lifePoints, Strategy warriorStrategy) {
        super(nation, tribe, PeopleType.warrior, lifePoints, warriorStrategy);
        myDescription = "\tsussy warrior";
    }
    @Override
    public int encounterLifePoints(People me, People otherPerson) {
        return encounterStrategy.strategy(me, otherPerson);
    }
    
}
