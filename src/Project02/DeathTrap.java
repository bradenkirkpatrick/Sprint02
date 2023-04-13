package Project02;
public class DeathTrap extends People{
    /*
     * implements a death trap that kills anyone that encounters it.
     */
    @Override
    public int encounterLifePoints(People me, People otherPerson){
        return 307000000;
    }
    public DeathTrap() {
        super("artifacts", "artifacts", PeopleType.artifact, 0, new ArtifactStrategy());
        myDescription = "Not much is know about it.";
    }
}
