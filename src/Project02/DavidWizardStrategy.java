package Project02;

public class DavidWizardStrategy implements Strategy {
    /**
     * The strategy will take negative the amount of lifepoints if the two people are from different nations. Otherwise it will divide the lifepoints by 1.5
     * if they are from the same nation, and multiplies them if they have the same amount of life points.
     */
    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        if (me.getNation() != otherPerson.getNation())
        {
            if (otherPerson.getLifePoints() < me.getLifePoints())
            {
                if (otherPerson.getType() == PeopleType.warrior) // run away
                {
                    lifePoints = -me.getLifePoints();
                }
                else // attack a wizard
                {
                    lifePoints = (int) (me.getLifePoints()/2.1);
                }
            }
        }
        else
        {
            if (otherPerson.getLifePoints() < me.getLifePoints()) // heal a friend
            {
                lifePoints = (int) (me.getLifePoints() - otherPerson.getLifePoints() / 1.5);
            }
            else if (otherPerson.getLifePoints() == me.getLifePoints()) {
                //something stupid
                lifePoints *= (me.getLifePoints() / otherPerson.getLifePoints());
            }
            else
            {
                lifePoints = 0;
            }
        }
        return lifePoints;
    }
}
