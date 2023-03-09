package Project02;

public class BradenWizardStrategy extends People{
    public BradenWizardStrategy(String nation, String tribe, int lifePoints, Strategy warriorStrategy) {
        super(nation, tribe, PeopleType.wizard, lifePoints, warriorStrategy);
        myDescription = "\tBraden Warrior";
    }
    @Override
    public int encounterLifePoints(People me, People otherPerson) {
        return encounterStrategy.strategy(me, otherPerson);
    }

}
