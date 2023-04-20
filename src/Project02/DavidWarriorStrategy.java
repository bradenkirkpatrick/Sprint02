package Project02;

public class DavidWarriorStrategy implements Strategy {

    /**
     * The strategy will take the life points, divide them by for if they are from the same trive, and by 2 if only from the same nation,
     * other wise the lifepoints will be equalled to one of the other person's life points.
     */
    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        if(me.getNation() == otherPerson.getNation())
        {
            if(otherPerson.getLifePoints() < me.getLifePoints())
            {
                if(otherPerson.getTribe() == me.getTribe())
                {
                    lifePoints = -((me.getLifePoints() /4 - otherPerson.getLifePoints() /4));
                }
                else
                {
                    lifePoints = -((me.getLifePoints() /2 - otherPerson.getLifePoints() /2));
                }
            }
        }
        else
        {
            int points;
            points = me.getLifePoints() - otherPerson.getLifePoints();
            if (points > 0)
            {
                lifePoints = otherPerson.getLifePoints();
            }
            else
            {
                lifePoints = me.getLifePoints();
            }
        }
        return lifePoints;
    }    
}