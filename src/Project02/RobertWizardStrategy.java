package Project02;

/**
 * The RobertWizardStrategy class implements the Strategy interface and implimenrts 
 * the strategy method
 */
public class RobertWizardStrategy implements Strategy {


    /**
     * the method strategy takes in two people as a paramter and when an encounter occurs
     * these lines are executed to help determine each players life points based on their strategy attack
     */
    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        if (me.getNation() != otherPerson.getNation())
        {
            if (otherPerson.getLifePoints() < me.getLifePoints())
            {
                if (otherPerson.getType() == PeopleType.wizard)
                    if(otherPerson.getLifePoints() > me.getLifePoints()){
                        // attack wizard
                        lifePoints = (int) (me.getLifePoints() / 4);
                    }
                else if(otherPerson.getLifePoints() < me.getLifePoints()) {
                        lifePoints = -me.getLifePoints();// - run away
                    }
                else // attack a warrior
                {
                    lifePoints = (int) (me.getLifePoints()/2);
                }
            }
        }
        else
        {
            if (otherPerson.getLifePoints() > me.getLifePoints())  //-- steal from friend
            {
                lifePoints = (int) (me.getLifePoints() + otherPerson.getLifePoints() / 2);
            }
            else
            {
                lifePoints = 0;
            }
        }
        return lifePoints;
    }
}

