package Project02;

import java.util.Random;

public class RobertWizardStrategy {


    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        Random rand = new Random();
        int attack =  rand.nextInt(0,1);

        if (me.getNation() != otherPerson.getNation())
        {
            if (otherPerson.getLifePoints() < me.getLifePoints())
            {
                if (otherPerson.getType() == PeopleType.warrior) // run away from warrior
                {
                    lifePoints = -me.getLifePoints();
                }
                // attack a wizard
                else if (otherPerson.getType() == PeopleType.wizard)
                {
                    if(attack == 1) {
                        lifePoints = (int) (me.getLifePoints() / 2);
                    }
                    else{
                        lifePoints = -me.getLifePoints();
                    }
                }
            }
        }
        else
        {
            if (otherPerson.getLifePoints() < me.getLifePoints()) // heals me instead of healing them
            {
                lifePoints = (int) (otherPerson.getLifePoints() + me.getLifePoints() / 2);
            }
            else
            {
                lifePoints = 0;
            }
        }
        return lifePoints;
    }
}

