package Project02;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;


public class Die {
    //private static final Random rand = new Random((int)(new Date().getTime() / 86400000));
    private static final Random rand = new Random();
    /**
     * Returns a random integer from 1 to faces
     * @return int
     */
    public static int roll(int faces) {
        return rand.nextInt(faces) + 1;
    }

    /**
     * Returns a random integer form 1 to 10
     * @return int
     */
    public static int distance() {
        return roll(10);
    }
    /**
     * shuffles list with seed
     */
    public static void shuffle(ArrayList<Integer> cards) {
        Collections.shuffle(cards, rand);
    }
}
