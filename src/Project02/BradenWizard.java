package Project02;

public class BradenWizard extends People{
    public BradenWizard(String nation, String tribe, int lifePoints, Strategy strategy) {
        super(nation, tribe, PeopleType.wizard, lifePoints, strategy);
        myDescription = "Beep boop beep boop, must win game.";
    }
    @Override
    public int encounterLifePoints(People me, People otherPerson) {
        return encounterStrategy.strategy(me, otherPerson);
    }
}
