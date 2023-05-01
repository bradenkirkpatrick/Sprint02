package Project02;
public class HealerStrategy implements Strategy {
    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        if (me.getNation() == otherPerson.getNation()) {
            lifePoints = -10;
        }
        return lifePoints;
    }
}
