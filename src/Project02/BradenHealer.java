package Project02;

public class BradenHealer extends People{

    BradenHealer(String nation, String tribe, int lifePoints, Strategy BradenHealerStrategy) {
        super(nation, tribe, PeopleType.healer, lifePoints, BradenHealerStrategy);
        myDescription = "Braden Healer";
    }
    @Override
    public int encounterLifePoints(People me, People otherPerson) {
        return encounterStrategy.strategy(me, otherPerson);
    }

}
