import java.util.ArrayList;

/**
 * The Memory class represents a simple memory storage with the ability to store and retrieve values in cells.
 */
public class Memory
{
    double value;
    int size;
    ArrayList<Double> memory;


    /**
     * initializes the memory
     */
    public void initialize()
    {
        memory.add(0, 0.0);
    }

    public void clear()
    {
        memory.clear();
    }

    /**
     * @return returns the size of the memory
     */
    public int getSize() {
        size = memory.size();
        return size;
    }

    /**
     * @param pos defines from which cell the value should be retrieved
     * @return returns the value from a specific "cell"
     */
    public double getValue(int pos) {
        return value;
    }


    /**
     * @param value declares the value in a specific "cell"
     * @param pos defines which cell of the memory is getting updated with a new value
     */
    public void setValue(double value, int pos) {
        this.value = value;
    }
}
