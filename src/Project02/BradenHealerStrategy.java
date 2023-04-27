package Project02;

public class BradenHealerStrategy implements Strategy {
    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        int intendedHealingPoints = 100;
        if (me.getNation() == otherPerson.getNation()) {
            Die die = Die.getInstance(intendedHealingPoints);
            int actualHealPoints = die.roll();
            if (otherPerson.getType() == PeopleType.wizard) {
                lifePoints = (int) (otherPerson.getLifePoints() + (actualHealPoints / 2));
            } else if (otherPerson.getType() == PeopleType.warrior) {
                lifePoints = (int) (otherPerson.getLifePoints() + actualHealPoints);
            }
            lifePoints = -me.getLifePoints();// - run away
        }
        return lifePoints;
    }
}
