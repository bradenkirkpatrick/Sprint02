package Project02;

public class RobertGoodWarriorStrat implements Strategy{
    /**
     * the method strategy takes in two people as a paramter and when an encounter
     * occurs
     * these lines are executed to help determine each players life points based on
     * their strategy attack
     */
    public int strategy(People me, People otherPerson) {

        Die die = Die.getInstance(100);
        int lifePoints = 0;
        if (me.getNation() != otherPerson.getNation()) {
            if (otherPerson.getType() == PeopleType.wizard) {
                lifePoints = (int) (me.getLifePoints() / 2);
            } else if (otherPerson.getType() == PeopleType.warrior) {
                lifePoints = (int) (me.getLifePoints() + die.roll());
            } else if (otherPerson.getType() == PeopleType.healer) {
                if(die.roll() > 50){
                    lifePoints = (int) (me.getLifePoints() + die.roll());
                }
               int num = (int)(die.roll() / 2);
                lifePoints = (int) (me.getLifePoints() / num);
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

