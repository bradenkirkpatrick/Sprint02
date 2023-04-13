package Project02;
public class RobertHealerStrategy implements Strategy {


    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        if (me.getNation() != otherPerson.getNation()) {
            lifePoints = -me.getLifePoints();// - run away
        }
        else
        {
            if (otherPerson.getType() == PeopleType.warrior) {

            }
            else if (otherPerson.getType() == PeopleType.wizard) {

            }
            else if(otherPerson.getType() == PeopleType.healer) {

            }
        }
        return lifePoints;
    }
}
