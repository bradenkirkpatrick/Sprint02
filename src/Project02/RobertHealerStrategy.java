package Project02;

public class RobertHealerStrategy extends Die implements Strategy {

    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        int intendedHealingPoints = 100;
        if (me.getNation() == otherPerson.getNation()) {
            Die die = new Die(intendedHealingPoints);
            int actualHealPoints = die.roll();
            lifePoints = (int) (otherPerson.getLifePoints() + actualHealPoints);
        } else {
            lifePoints = -me.getLifePoints();// - run away
        }
        return lifePoints;
    }
}
