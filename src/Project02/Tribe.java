package Project02;

public class Tribe extends AbstractTribe{
    public Tribe(String nation, String tribe, int lifePoints){
        nationName = nation;
        tribeName = tribe;
        tribeLifePoints = lifePoints / 3;
        // each tribe gets two people
        if(nationName == "Minions"){
            members.add(new SchaperWarrior(nationName, tribeName, tribeLifePoints, new WizardStrategy()));
            members.add(new SchaperWizard(nationName, tribeName, tribeLifePoints, new WarriorStrategy()));
        }
        else if (nationName == "Sussy Impostors") {
            members.add(new DavidWarrior(nationName, tribeName, tribeLifePoints, new DavidGoodWarriorStrategy()));
            members.add(new DavidWizard(nationName, tribeName, tribeLifePoints, new DavidGoodWizardStrategy()));
            members.add(new DavidHealer(nationName, tribeName, tribeLifePoints, new DavidHealerStrategy()));
        }
        else if(nationName == "Robs Nation"){
            members.add(new RobertWarrior(nationName, tribeName, tribeLifePoints, new RobertGoodWarriorStrat()));
            members.add(new RobertWizard(nationName, tribeName, tribeLifePoints, new RobertGoodWizardStrat()));
            members.add(new RobertHealer(nationName, tribeName, tribeLifePoints, new RobertHealerStrategy()));
        }
        else if (nationName == "Braden Nation"){
            members.add(new BradenWarrior(nationName, tribeName, tribeLifePoints, new BradenWarriorStrategy()));
            members.add(new BradenWizard(nationName, tribeName, tribeLifePoints, new BradenWizardStrategy()));
            members.add(new BradenHealer(nationName, tribeName, tribeLifePoints, new BradenHealerStrategy()));
        }
        for(int i = 0; i < members.size(); i++)
            livingMembers.addAll(members);
    }
}
