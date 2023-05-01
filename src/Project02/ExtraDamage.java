package Project02;
/**
 * decorator object that adds 5 damage to a People
 */
public class ExtraDamage implements Strategy {
    People person;
    public ExtraDamage(People person) {
        this.person = person;
    }
    public int strategy(People me, People otherPerson) {
        int lifePoints = this.person.encounterLifePoints(me, otherPerson);
        if(lifePoints > 0)
            lifePoints += 5;
        return lifePoints;
    }
}
