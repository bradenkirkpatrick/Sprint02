package Project02;

public class BradenHealerStrategy implements Strategy {
    public int strategy(People me, People otherPerson) {
        int lifePoints = -1;
        if (me.getNation() == otherPerson.getNation()) {
            if (otherPerson.getType() == PeopleType.wizard) {
                lifePoints = Die.roll(me.getLifePoints());
            } else if (otherPerson.getType() == PeopleType.warrior) {
                lifePoints = Die.roll(me.getLifePoints());
            }
            lifePoints = 0;// - run away
        }
        return lifePoints;
    }
}
