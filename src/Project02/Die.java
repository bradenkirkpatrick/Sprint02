package Project02;
import java.util.Random;
import java.util.Date;


public class Die {
    private final int numFaces;
    private Random rand = new Random((int)(new Date().getTime() / 86400000));
    private static Die die;

    /**
     * The constructor takes a parameter as the number of faces on
     * a die, if that number is not between 2 and 20 inclusive,
     * the constructor will fall back to 6.
     * @param faces
     */
    private Die(int faces) {
        if (faces < 2)
            this.numFaces = 6;
        else 
            this.numFaces = faces;
    }

    /**
     * Used as the constuctor, for this class uses the Singleton design
     * pattern
     * @param faces
     * @return die
     */
    public static Die getInstance(int faces) {
        if(die == null)
            die = new Die(faces);
        return die;
    }

    /**
     * Returns a random integer, bounded to the number of faces
     * of the die.
     * @return integer
     */
    public int roll() {
        return rand.nextInt(numFaces) + 1;
    }

    /**
     * static method for instantiation(????)
     * @return integer
     */
    public static int roll(int faces) {
        return getInstance(faces).roll();
    }

    /**
     * in progress distance mechanism
     * @return double
     */
    public static double random() {
        return getInstance(6).rand.nextDouble();
    }

}
