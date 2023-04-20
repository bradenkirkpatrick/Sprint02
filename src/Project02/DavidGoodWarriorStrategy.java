package Project02;

public class DavidGoodWarriorStrategy implements Strategy {
    // TODO
    public int strategy(People me, People otherPerson) {
        int lifePoints = 0;
        if (!(me.getNation().equals(otherPerson.getNation()))) {
            if (otherPerson.getType().equals(PeopleType.wizard)) {
                Die d = Die.getInstance(100);
                int takePoints = d.roll();
                lifePoints = (int) (otherPerson.getLifePoints() - takePoints);
            }
            else if (otherPerson.getType().equals(PeopleType.warrior))  {
                Die d = Die.getInstance(50);
                int takePoints = d.roll() * 2;
                lifePoints = (int) (otherPerson.getLifePoints() - takePoints);
            }
            else {
                Die d = Die.getInstance(25);
                int takePoints = d.roll() * 4;
                lifePoints = (int) (otherPerson.getLifePoints() - takePoints);
            }
        }
        return lifePoints;
    }
}