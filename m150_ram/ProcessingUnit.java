package m150_ram;

import java.util.ArrayList;
import java.util.Random;

/**
 * The m150_ram.ProcessingUnit class represents a processing unit that can
 * initialize a program by generating a random array of integers.
 * @author Seya
 * @version 1.0
 */
public class ProcessingUnit {

    /**
     * Initializes a program by generating a random array of integers.
     *
     * @param size The size of the random array to be generated.
     */
    public void initializeProgram(int size) {
        ArrayList<Integer> randomArray = new ArrayList<>(size);
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            // Generate a random integer between 1 and 7 (inclusive)
            int randomNumber = random.nextInt(7) + 1;
            randomArray.add(randomNumber);
        }
    }
}
