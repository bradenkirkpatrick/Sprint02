package Project02;
public class RobertHealerStrategy extends Die implements Strategy {


    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        int intendedHealingPoints = 100;
        if (me.getNation() != otherPerson.getNation()) {
            lifePoints = -me.getLifePoints();// - run away
        }
        else
        {
            if (otherPerson.getType() == PeopleType.warrior) {
                Die die = new Die(intendedHealingPoints);
                int actualHealPoints = die.getRand();
                lifePoints = (int) (otherPerson.getLifePoints() + actualHealPoints);
            }
            else if (otherPerson.getType() == PeopleType.wizard) {

            }
            else if(otherPerson.getType() == PeopleType.healer) {

            }
        }
        return lifePoints;
    }
}
