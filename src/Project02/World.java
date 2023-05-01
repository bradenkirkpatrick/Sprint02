package Project02;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class World {
    private final int worldLifePoints = 1200;
    private final int numberOfRounds = 40;
    public static final int MaximumLifePoints = 100;
    private ArrayList<Nation> allNations = new ArrayList<>();

    private ArrayList<People> worldCreatedPeople = new ArrayList<>();

    
    public World() {
        createWorld();
        worldCreatedPeople.addAll(getWorldCreatedPopulation());
    }

    public void war(){
        ArrayList<Integer> worldSurvivingPeople = new ArrayList<>();

        for(int round = 1; round <= numberOfRounds; round++) {
            Set<String> survivingNations = new HashSet<>();
            System.out.println("Round number: " + round);
            worldSurvivingPeople.clear();
            worldSurvivingPeople.addAll(getWorldSurvivingPeople());
            if(round == 5) {
                worldSurvivingPeople.add(0);
            } else if(round == 10) {
                worldSurvivingPeople.add(1);
            } else if(round == 15) {
                worldSurvivingPeople.add(2);
            } else if(round == 20) {
                worldSurvivingPeople.add(3);
            }
            survivingNations.addAll(getSurvivingNations());
            if (survivingNations.size() > 1)
                playOneRound(worldSurvivingPeople);
            else {
                System.out.print("Game is over! Winning Nation is: ");
                if (survivingNations.size() == 0)
                    System.out.println("All Nations Destroyed.");
                else {
                    System.out.println(survivingNations);
                    System.out.println("The survivors are:");
                    for (int i = 0; i < worldSurvivingPeople.size(); i++)
                        System.out.println(worldCreatedPeople.get(worldSurvivingPeople.get(i)));
                }
                break;
            }
        }
    }

    public void createWorld() {   
        String[] nation_names = {"Robs Nation", "Braden Nation", "Sussy Impostors"};
        int number_of_nations = nation_names.length;
        for(String nation_name : nation_names)
            allNations.add(new Nation(nation_name, worldLifePoints / number_of_nations));
    }


    public ArrayList<People> getWorldCreatedPopulation() {
        ArrayList<People> livingPeople = new ArrayList<>();
        livingPeople.add(new DeathTrap());
        livingPeople.add(new HolyGrail());
        livingPeople.add(new BookOfTransformation());
        livingPeople.add(new Excalibur());
        // add all living people from allNations to livingPeople
        for(int nation = 0; nation < allNations.size(); nation++)
            livingPeople.addAll(allNations.get(nation).getNationPopulation());
        return livingPeople;
    }


    public ArrayList<Integer> getWorldSurvivingPeople() {
        ArrayList<Integer> survivors = new ArrayList<>();
        for (Integer i = 0; i < worldCreatedPeople.size(); i++)
            if(worldCreatedPeople.get(i).isPersonAlive())
                survivors.add(i);
        return survivors;
    }


    public Set<String> getSurvivingNations() {
        Set<String> survivingNations = new HashSet<>();

        for (Integer i = 0; i < worldCreatedPeople.size(); i++) {
            if(worldCreatedPeople.get(i).isPersonAlive())
                survivingNations.add(worldCreatedPeople.get(i).getNation());
        }
        return survivingNations;
    }


    public void encounter(Integer person1postion, Integer person2postion){
        People person1 = worldCreatedPeople.get(person1postion);
        People person2 = worldCreatedPeople.get(person2postion);
        System.out.println("Encounter: "+ person1 + " | " + person2);

        //if lifePointsToUse is negative, then person is either running away in a hostile encounter
        // or person is giving life points to another person from same nation
        int person1LifePointsToUse = person1.encounterLifePoints(person2, person1);
        int person2LifePointsToUse = person2.encounterLifePoints(person1, person2);

        if(person1.getNation().equals(person2.getNation()))
            freindlyEncounter(person1, person2, person1LifePointsToUse, person2LifePointsToUse);
        else
            hostileEncounter(person1, person2, person1LifePointsToUse, person2LifePointsToUse);
    }

    public void freindlyEncounter(People person1, People person2, Integer heal1, Integer heal2){
        // freindly encounter, each player gains 1 life
        person1.modifyLifePoints((1));
        person2.modifyLifePoints((1));
        // each player has chance to heal each other
        person1.modifyLifePoints(-heal1);
        person2.modifyLifePoints(-heal2);
    }

    public void hostileEncounter(People person1, People person2, Integer damage1, Integer damage2) {
        // Both people lose 1 life point per encounter due to aging
        person1.modifyLifePoints((-1));
        person2.modifyLifePoints((-1));
        
        int p1damage =  0;
        int p2damage =  0;
        if (p1damage > 0 && p2damage > 0){
            // person 1  and person 2 are fighting and inflicting damage
            p1damage =  Die.roll(damage1);
            p2damage =  Die.roll(damage2);
        } else if (p1damage <= 0 && p2damage <= 0){ 
            //cowards encounter: nothing happens
        } else if (p1damage > 0) {
            // person 1 is fighting and person 2 is running
            p1damage = Die.roll(damage1)/2;
        } else {
            // person 2 is fighting and person 1 is running
            p2damage = Die.roll(damage2)/2;
        }

        // modify health: subtracts damage from person's lifePoints
        person1.modifyLifePoints((-p2damage - Die.distance()));
        person2.modifyLifePoints((-p1damage - Die.distance()));
    }

    public void playOneRound(ArrayList<Integer> combatants) {
        Integer numberOfCombatants;
        Die.shuffle(combatants);
        numberOfCombatants = combatants.size() - 1;
        Integer combatantIndex = 0;
        while(combatantIndex < numberOfCombatants) {
            encounter(combatants.get(combatantIndex), combatants.get(combatantIndex+1));
            combatantIndex = combatantIndex + 2;
        }

        // makes sure that all peoples can never have greater than the maximum life points 
        for(People person: worldCreatedPeople)
            person.setLifePoints(Math.min(person.getLifePoints(), MaximumLifePoints));
    }
}
