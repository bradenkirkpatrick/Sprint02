package Project02;

public class DavidHealer extends People {
    public DavidHealer(String nation, String tribe, int lifePoints, Strategy strategy) {
        super(nation, tribe, PeopleType.healer, lifePoints, strategy);
        myDescription = "Jahwol!";
    }

    public int encounterLifePoints(People me, People otherPerson) {
        return encounterStrategy.strategy(me, otherPerson);
    }
}
