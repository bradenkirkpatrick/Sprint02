package Project02;

public class DavidGoodWizardStrategy implements Strategy {
    /**
     * The strategy will take negative the amount of lifepoints if the two people are from different nations. Otherwise it will divide the lifepoints by 1.5
     * if they are from the same nation, and multiplies them if they have the same amount of life points.
     */
    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        if (me.getNation().equals(otherPerson.getNation())) {
            if (otherPerson.getType().equals(PeopleType.healer)) {
                // maybe the wizard gives some health to the healer
                if (Die.roll(2) == 1) {
                    lifePoints = 0;
                }
                else {
                    int givePoints = Die.roll(10);
                    lifePoints = (int) (otherPerson.getLifePoints()) + givePoints;
                }
            }
        }
        else {
            // generic attack
            int takePoints = Die.roll(35);
            lifePoints = (int) (otherPerson.getLifePoints() -  takePoints);
        }
        return lifePoints + 5;
    }
}
