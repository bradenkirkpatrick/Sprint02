package Project02;
public class RobertHealer extends People {
    RobertHealer(String nation, String tribe, int lifePoints, Strategy RobertHealerStrategy) {
        super(nation, tribe, PeopleType.healer, lifePoints, RobertHealerStrategy);
        myDescription = "Robert Healer";
    }
    @Override
    public int encounterLifePoints(People me, People otherPerson) {
        return encounterStrategy.strategy(me, otherPerson);
    }

}
