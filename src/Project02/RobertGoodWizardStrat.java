package Project02;

/**
 * The RobertWizardStrategy class implements the Strategy interface and
 * implimenrts
 * the strategy method
 */
public class RobertGoodWizardStrat implements Strategy {

    /**
     * the method strategy takes in two people as a paramter and when an encounter
     * occurs
     * these lines are executed to help determine each players life points based on
     * their strategy attack
     */
    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        if (me.getNation() != otherPerson.getNation()) {
            if (otherPerson.getType() == PeopleType.warrior) {
                lifePoints = me.getLifePoints() / 2;
            } else if (otherPerson.getType() == PeopleType.wizard) {
                lifePoints = me.getLifePoints() + Die.roll(100);
            } else if (otherPerson.getType() == PeopleType.healer) {
                if(Die.roll(2) == 1){
                    lifePoints = Die.roll(me.getLifePoints());
                }
                int num = Die.roll(50);
                lifePoints = me.getLifePoints() / num;
            }
        } else {
            if (otherPerson.getLifePoints() > me.getLifePoints()) // -- steal from friend
            {
                lifePoints = (me.getLifePoints() + otherPerson.getLifePoints()) / 2;
            } else {
                lifePoints = 0;
            }
        }
        return lifePoints;
    }
}
