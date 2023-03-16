package Project02;

public class BradenWizardStrategy implements Strategy{
    /**
     * Warrior strategy is generally aggressive and returns maximum amount of life
     * points if players are from different nations. If from the same nation then
     * player will transfer life points.
     * @param me - person to get life points for.
     * @param otherPerson - the opponent of the encounter
     * @return - Life points to use in the encounter
     */
    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        if(me.getNation() == otherPerson.getNation()) {
            if(PeopleType.wizard == otherPerson.getType()){
                if(otherPerson.getLifePoints() < me.getLifePoints()) {
                    lifePoints = 0;
                } else {
                    lifePoints = Math.min(me.getLifePoints() - 1, 100 - otherPerson.getLifePoints());
                }
            } else {
                lifePoints = 0;
            }
        } else {
            lifePoints = me.getLifePoints();
        }
        return lifePoints;
    }
}