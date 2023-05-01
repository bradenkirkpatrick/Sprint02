package Project02;

public class HolyGrail extends People{
    /*
        * implements a death trap that kills anyone that encounters it.
        */
    @Override
    public int encounterLifePoints(People me, People otherPerson){
        otherPerson.setLifePoints(World.MaximumLifePoints);
        return 0;
    }
    public HolyGrail() {
        super("", "The Holy Grail", PeopleType.artifact, 100, new ArtifactStrategy());
        myDescription = "What is your favorite color?";
    }
    @Override
    public Boolean isPersonAlive(){
        return false;
    }
}
