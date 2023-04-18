package Project02;
import java.util.Random;
import java.util.Date;


public class Die {
    private final int numFaces;
    private Random rand = new Random((int)(new Date().getTime() / 86400000));

    /**
     * The constructor takes a parameter as the number of faces on
     * a die, if that number is not between 2 and 20 inclusive,
     * the constructor will fall back to 6.
     * @param faces
     */
    public Die(int faces) {
        if (faces >= 2) {
            this.numFaces = faces;
        }
        else {
            this.numFaces = 6;
        }
    }

    // This might not be used, just a fallback just in case ;)
    public Die() {
        this.numFaces = 6;
    }

    /**
     * Returns a random integer, bounded to the number of faces
     * of the die.
     * @return integer
     */
    public int roll() {
        return rand.nextInt(numFaces) + 1;
    }

}
