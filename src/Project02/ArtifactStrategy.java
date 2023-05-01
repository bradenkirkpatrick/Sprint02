package Project02;

public class ArtifactStrategy implements Strategy {
    public int strategy(People me, People otherPerson){
        return me.encounterLifePoints(me, otherPerson);
    }
}
