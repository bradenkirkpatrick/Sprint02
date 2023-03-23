import Project02.*;
import org.junit.jupiter.api.Test;
public class BradenTests {
    public static void main(String[] args) {
        testNewPeople();
    }
    //String nation, String tribe, int lifePoints, Strategy strategy
    @Test
    public static void testNewPeople(){
        World america = new World();

        Tribe bulgarians = new Tribe("Bulgaria", "Soyia", 1000);
        People Wiz = new BradenWizard("Eins", "A", 200, new BradenWizardStrategy());
        People War = new BradenWarrior("Zwei", "B", 200, new BradenWarriorStrategy());
        System.out.println(bulgarians);
        System.out.println(Wiz);
        System.out.println(War);
    }

    @Test
    public static void testLifePoints(){

    }
}
