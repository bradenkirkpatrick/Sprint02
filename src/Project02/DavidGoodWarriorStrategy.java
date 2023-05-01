package Project02;

public class DavidGoodWarriorStrategy implements Strategy {
    // TODO
    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        if (!(me.getNation().equals(otherPerson.getNation()))) {
            if (otherPerson.getType().equals(PeopleType.wizard)) {
                int takePoints = Die.roll(100);
                lifePoints = otherPerson.getLifePoints() - takePoints;
            }
            else if (otherPerson.getType().equals(PeopleType.warrior))  {
                int takePoints = Die.roll(50) * 2;
                lifePoints = otherPerson.getLifePoints() - takePoints;
            }
            else {
                int takePoints = Die.roll(25) * 4;
                lifePoints = otherPerson.getLifePoints() - takePoints;
            }
        }
        return lifePoints;
    }
}