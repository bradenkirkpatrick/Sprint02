package Project02;
import java.util.Random;

public class DavidGoodWarriorStrategy implements Strategy {
    private Random rand = new Random();

    /**
     * The strategy will take the life points, divide them by for if they are from the same tribe, and by 2 if only from the same nation,
     * other wise the lifepoints will be equalled to one of the other person's life points.
     */
    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        if (!(me.getNation().equals(otherPerson.getNation()))) {
            if (otherPerson.getType().equals(PeopleType.wizard)) {
                Die d = new Die(99);
                int takePoints = d.roll();
                lifePoints = (int) (otherPerson.getLifePoints() - takePoints);
            }
            else if (otherPerson.getType().equals(PeopleType.warrior))  {
                Die d = new Die(49);
                int takePoints = d.roll() * 2;
                lifePoints = (int) (otherPerson.getLifePoints() - takePoints);
            }
            else {
                Die d = new Die(24);
                int takePoints = d.roll() * 4;
                lifePoints = (int) (otherPerson.getLifePoints() - takePoints);
            }
        }
        return lifePoints;
    }
}