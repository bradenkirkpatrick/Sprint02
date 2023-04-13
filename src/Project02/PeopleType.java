package Project02;

public enum PeopleType
{
    wizard  ("wizard"),
    warrior ("warrior"),
    healer  ("healer");

    private String description;

    /**
     *
     * @param types
     * PeopleType constructor takes in a String called tyoes and sets it to the current description
     */
    PeopleType (String types)
    {
        description = types;
    }


    /**
     * getDescription method returns the Description of the PersonType
     * @return description
     */
    public String getDescription()
    {
        return description;
    }
}
