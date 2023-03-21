package Project02;

public class RobertWarriorStrategy implements Strategy {


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