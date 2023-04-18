package Project02;
import java.util.ArrayList;

public abstract class AbstractTribe {
    protected String nationName;
    protected String tribeName;
    protected int tribeLifePoints;
    protected ArrayList<People> members = new ArrayList<>();
    protected ArrayList<People> livingMembers = new ArrayList<>();

    public ArrayList<People> getLivingTribeMembers() {
        livingMembers.clear();
        tribeLifePoints = 0;
        for(int person = 0; person < members.size(); person++) {
            if(members.get(person).isPersonAlive()) {
                livingMembers.add(members.get(person));
                tribeLifePoints += members.get(person).getLifePoints();
            } else {
                if(!(members.get(person).getDead())) {
                    members.get(person).setDead();
                    System.out.println("\t\t" + members.get(person) + " is dead!");
                }
            }
        }
        return livingMembers;
    }

    public int getTribeSize() {
        return livingMembers.size();
    }

    public Boolean isTribeAlive() {
        return (tribeLifePoints > 0);
    }


    public int getTribeLifePoints() {
        return tribeLifePoints;
    }

    public String getTribeName() {
        return tribeName;
    }

    public String toString() {
        String result = "\0";

        result = tribeName;
        for(int i = 0; i < members.size(); i++) {
            result = result + '\n' + members.get(i).toString();
        }
        result = result + '\n';
        return result;
    }
}
