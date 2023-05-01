package Project02;
public class Excalibur extends People{
    /*
     * excalibur is a sword that makes anyone using it do 5 more damage.
     */
    @Override
    public int encounterLifePoints(People me, People otherPerson){
        otherPerson.changeStrategy(new ExtraDamage(otherPerson));
        return 0;
    }
    public Excalibur() {
        super("", "The Sword Excalibur", PeopleType.artifact, 100, new ArtifactStrategy());
        myDescription = "King Author\'s sword";
    }
    @Override
    public Boolean isPersonAlive(){
        return false;
    }
}
