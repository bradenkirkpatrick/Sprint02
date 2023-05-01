package Project02;

public class BradenWarriorStrategy implements Strategy{
    /**
     * The braden warrior strategy is that of self sacrtifce. 
     * the braden warrior will transfer all of its health points to a wizard
     * of its own nation
     * @param me - person to get life points for.
     * @param otherPerson - the opponent of the encounter
     * @return - Life points to use in the encounter
     */
    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        if(me.getNation() == otherPerson.getNation()) {
            if(PeopleType.wizard == otherPerson.getType()){
                lifePoints = Math.min(me.getLifePoints() - 2, 98 - otherPerson.getLifePoints());
            } else {
                if(otherPerson.getLifePoints() > me.getLifePoints()) {
                    lifePoints = Math.min(me.getLifePoints() - 2, 98 - otherPerson.getLifePoints());
                }
            }
        } else {
            lifePoints = me.getLifePoints()/2;
        }
        return lifePoints;
    }

}
