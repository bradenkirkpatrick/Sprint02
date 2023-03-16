package Project02;

public class DavidWarriorStrategy implements Strategy {
    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        if(me.getNation() == otherPerson.getNation())
        {
            if(otherPerson.getLifePoints() < me.getLifePoints())
            {
                if(otherPerson.getTribe() == me.getTribe())
                {
                    lifePoints = -((me.getLifePoints() - otherPerson.getLifePoints()));
                }
                else
                {
                    lifePoints = -((me.getLifePoints() - otherPerson.getLifePoints()));
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