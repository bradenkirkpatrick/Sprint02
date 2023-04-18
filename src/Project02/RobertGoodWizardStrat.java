package Project02;

import java.util.Random;

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
                lifePoints = (int) (me.getLifePoints() / 2);
            } else if (otherPerson.getType() == PeopleType.wizard) {
                // attack wizard
            } else if (otherPerson.getType() == PeopleType.healer) {
                // destroy a healer
            }
        } else {
            if (otherPerson.getLifePoints() > me.getLifePoints()) // -- steal from friend
            {
                lifePoints = (int) (me.getLifePoints() + otherPerson.getLifePoints() / 2);
            } else {
                lifePoints = 0;
            }
        }
        return lifePoints;
    }
}
