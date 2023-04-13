package Project02;

public class Tribe extends AbstractTribe{
    public Tribe(String nation, String tribe, int lifePoints){
        nationName = nation;
        tribeName = tribe;
        tribeLifePoints = lifePoints / 2;
        // each tribe gets two people
        if(nationName == "Minions"){
            members.add(new SchaperWarrior(nationName, tribeName, tribeLifePoints, new WizardStrategy()));
            members.add(new SchaperWizard(nationName, tribeName, tribeLifePoints, new WarriorStrategy()));
        }
        else if (nationName == "Sussy Impostors") {
            members.add(new DavidWarrior(nationName, tribeName, tribeLifePoints, new DavidWarriorStrategy()));
            members.add(new DavidWizard(nationName, tribeName, tribeLifePoints, new DavidWizardStrategy()));
        }
        else if(nationName == "Robs Nation"){
            members.add(new RobertWarrior(nationName, tribeName, tribeLifePoints, new RobertWarriorStrategy()));
            members.add(new RobertWizard(nationName, tribeName, tribeLifePoints, new RobertWizardStrategy()));
        }
        else if (nationName == "Braden Nation"){
            members.add(new BradenWarrior(nationName, tribeName, tribeLifePoints, new BradenWarriorStrategy()));
            members.add(new BradenWizard(nationName, tribeName, tribeLifePoints, new BradenWizardStrategy()));
        }
        for(int i = 0; i < members.size(); i++)
            livingMembers.addAll(members);
    }
}
