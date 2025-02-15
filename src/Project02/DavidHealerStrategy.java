package Project02;
/*
The DavidHealerStrategy is an implementation of the Strategy interface for healers
 */

/**
 * The strategy limits a healer to healing only a member of his nation, randomly using the Die class, it is not
 * programmed to attack an enemy, it will simply run away.
 */
public class DavidHealerStrategy implements Strategy {
    @Override
    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        int maxPoints = 20;
        if (!(me.getNation().equals(otherPerson.getNation()))) {
            lifePoints = -me.getLifePoints();// - run away
        }
        else {
            int healPoints = Die.roll(maxPoints/2);
            lifePoints = -Die.roll(healPoints - otherPerson.getLifePoints());
        }
        return lifePoints;
    }
}
