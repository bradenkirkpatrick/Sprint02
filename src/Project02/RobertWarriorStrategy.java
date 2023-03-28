package Project02;

/**
 * The RobertWizardStrategy class implements the Strategy interface and implements
 * the strategy method
 */
public class RobertWarriorStrategy implements Strategy {


    /**
     * the method strategy takes in two people as a parameter and when an encounter occurs
     * these lines are executed to help determine each players life points based on their strategy attack
     */
    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        if (me.getNation() == otherPerson.getNation()) {
            if (otherPerson.getTribe() != me.getTribe()) { // if tribe is not mine attack
                lifePoints = (int) (me.getLifePoints() / 2);
            } else {
                lifePoints = (int) (me.getLifePoints() / 4); //still attack because why not
            }
        }
        return lifePoints;
    }
}

//no healing for warriors because warriors are to tough to heal