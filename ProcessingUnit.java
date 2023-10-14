import java.util.ArrayList;
import java.util.Random;

public class ProcessingUnit
{
    public void initializeProgram(int size)
    {
        ArrayList<Integer> randomArray = new ArrayList<>(size);
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            // Generate a random integer between 1 and 7 (inclusive)
            int randomNumber = random.nextInt(7) + 1;
            randomArray.add(randomNumber);
        }
    }
}
