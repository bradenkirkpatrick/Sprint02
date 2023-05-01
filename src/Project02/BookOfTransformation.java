package Project02;

public class BookOfTransformation extends People {
    /*
     * a book of transformation that transforms an person that touches it into a healer.
     */
    @Override
    public int encounterLifePoints(People me, People otherPerson){
        otherPerson.changeStrategy(new HealerStrategy());
        return 0;
    }
    public BookOfTransformation() {
        super("", "Book of Transformation", PeopleType.artifact, 100, new ArtifactStrategy());
        myDescription = "An ancient magic";
    }
    @Override
    public Boolean isPersonAlive(){
        return false;
    }
}