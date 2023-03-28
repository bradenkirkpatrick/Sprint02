package Project02;

import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import Project02.Tribe;
import Project02.People;


public class Nation
{
    /**
     * @param nationLifePoints
     * @param  nationName
     * @param tribes
     * @param population
     * @param livingPopulation
     */
    private int nationLifePoints;
    private String nationName;
    private ArrayList<Tribe> tribes = new ArrayList<>();
    private ArrayList<People> population = new ArrayList<>();
    private ArrayList<People> livingPopulation = new ArrayList<>();

    /**
     *
     * @param name
     * @param lifePoints
     * The Nation constructor takes in two params and sets the nationName and nationLifePoints.
     * It then loops through and adds a new tribe with a nationName and nationLifePoints that were specified above.
     * After it adds the tribes to the population and then adds the population to the living population
     *
     */
    public Nation(String name, int lifePoints)
    {
        nationName = name;
        nationLifePoints = lifePoints;
        for(int i = 0; i < 5; i++)
        {
            this.tribes.add(new Tribe(nationName, "Tribe" + i, nationLifePoints / 5));
        }
        population.addAll(getNationPopulation());
        livingPopulation.addAll(population);
    }


    /**
     *
     * @return Arraylist of type people
     * the getNationPopulation method loops through the tribes to see if they are still alive and returns the living population
     *
     */
    public ArrayList<People> getNationPopulation()
    {
        nationLifePoints = 0;
        livingPopulation.clear();
        for(int tribe = 0; tribe < this.tribes.size(); tribe++)
        {
            if(tribes.get(tribe).isTribeAlive())
            {
                //System.out.println(tribes.get(tribe));
                livingPopulation.addAll(tribes.get(tribe).getLivingTribeMembers());
                //System.out.println(tribes.get(tribe).getLivingTribeMembers());
                nationLifePoints += tribes.get(tribe).getTribeLifePoints();
            }
        }
        return livingPopulation;
    }


    /**
     *
     * @returns nationName
     */
    public String getNationName()
    {
        return nationName;
    }


    /**
     * printTribesStatus is a void method that prints out the alive tribe and shows how many members remain.
     * if the tribe is not alive it will print out that the tribe is dead
     */
    public void printTribesStatus()
    {
        for(int tribe = 0; tribe < 1; tribe++)
        {
            if(tribes.get(tribe).isTribeAlive())
            {
                System.out.print(tribes.get(tribe).getTribeName() + " is alive and has ");
                System.out.println(tribes.get(tribe).getTribeSize() + " members.");
            }
            else
            {
                System.out.println(tribes.get(tribe).getTribeName() + " is dead.");
            }
        }
    }

    /**
     *
     *
     * the toString Method loops through the tribes and appends all the tribes info to the result string
     * @returns result
     */
    public String toString()
    {
        String result = "\0";
        result = nationName;
        for(int i = 0; i < tribes.size(); i++)
        {
            result = result + '\n' + tribes.get(i).toString();

        }
        result = result + '\n';
        return result;
    }
}
