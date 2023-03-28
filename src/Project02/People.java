package Project02;

import Project02.PeopleType;

public abstract class People
{
    /**
     * @param personName;
     * @param myNation;
     * @param myTribe;
     * @param me;
     * @param myDescription;
     * @param myLifePoints;
     * @param dead;
     * @param encounterStrategy;
     */

    private String personName;
    private String myNation;
    private String myTribe;
    private PeopleType me;
    protected String myDescription;
    private int myLifePoints;
    private boolean dead;

    protected Strategy encounterStrategy;


    /**
     *
     * @param nation
     * @param tribe
     * @param person
     * @param lifePoints
     * @param strategy
     * The People Constructor takes in the params above and initializes them
     */
    public People(String nation, String tribe, PeopleType person, int lifePoints, Strategy strategy)
    {
        myNation = nation;
        myTribe = tribe;
        me = person;
        myDescription = me.getDescription();
        myLifePoints = lifePoints;
        dead = false;
        encounterStrategy = strategy;
    }


    /**
     * the setDead method is a void function that sets the dead variable to true
     */
    public void setDead()
    {
        dead = true;
    }

    /**
     * the getDead function returns a boolean based on if the person is dead or not
     * @returns boolean
     */
    public boolean getDead()
    {
        return dead;
    }

    /**
     * the getType method returns the Type that the person is
     * @returns PeopleType
     */
    public PeopleType getType()
    {
        return me;
    }

    /**
     * getTribe method returns the name of the Person Tribe
     * @returns myTribe
     */
    public String getTribe()
    {
        return myTribe;
    }

    /**
     * getNation method returns the name of the Person Nation as a string
     * @return myNation
     */
    public String getNation()
    {
        return myNation;
    }

    /**
     * the isPersonAlive method returns true or false depending on whether the Person is alive or not
     * @return Boolean
     */
    public Boolean isPersonAlive()
    {
        return (myLifePoints > 0);
    }

    /**
     * the getLifePoints method returns the current lifePoints for a Person
     * @return lifePoints
     */
    public int getLifePoints()
    {
        return myLifePoints;
    }

    /**
     *
     * @param points
     * the modifyLifePoints method is a void method that adds the param points to the active lifePoints a Person has
     */
    public void modifyLifePoints(int points)
    {
        myLifePoints += points;
    }

    /**
     *
     * @param s
     * the changeStrategy method takes in a strategy as a param and sets the encounter strategy to it
     */
    public void changeStrategy(Strategy s)
    {
        encounterStrategy = s;
    }

    /**
     *
     * @param me
     * @param otherPerson
     * the encounterLifePoints method takes two people as params performs and encounter and returns there remaining lidePoints
     * @return int
     */
    public abstract int encounterLifePoints(People me, People otherPerson);

    /**
     *  The toString Method appends the nationName, tribeName, person, description, and lifePoints to the String result
     * @return result
     */
    public String toString()
    {
        String result = new String( myNation + "\t" +  myTribe + "\t" + me + "\t" + myDescription + "\t" + myLifePoints);
        return result;
    }
}

