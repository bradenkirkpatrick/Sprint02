package Project02;

public class DavidWizard extends People {
    public DavidWizard(String nation, String tribe, int lifePoints, Strategy strategy)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints, strategy);
        myDescription = "\tTV ES PETRVS ET SVPER HANC PETRAM AEDIFICABO ECCLESIAM MEAM";

    }

    @Override
    public int encounterLifePoints(People me, People otherPerson)
    {
        return encounterStrategy.strategy(me, otherPerson);
    }

}
