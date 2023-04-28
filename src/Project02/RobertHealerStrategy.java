package Project02;

public class RobertHealerStrategy implements Strategy {

    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        int intendedHealingPoints = 100;
        if (me.getNation() == otherPerson.getNation()) {
            int actualHealPoints = Die.roll(intendedHealingPoints);
            lifePoints = (int) (otherPerson.getLifePoints() + actualHealPoints);
        } else {
            lifePoints = -me.getLifePoints();// - run away
        }
        return lifePoints;
    }
}
