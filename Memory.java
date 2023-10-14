import java.util.ArrayList;

/**
 * The Memory class represents a simple memory storage with the ability to store and retrieve values in cells.
 */
public class Memory {
    double value;
    int size;
    ArrayList<Double> memory;

    /**
     * Initializes the memory by adding a default value (0.0) to the first memory cell.
     */
    public void initialize() {
        memory.add(0, 0.0);
    }

    /**
     * Clears the memory by removing all stored values.
     */
    public void clear() {
        memory.clear();
    }

    /**
     * Get the current size of the memory.
     *
     * @return The size of the memory as the number of cells.
     */
    public int getSize() {
        size = memory.size();
        return size;
    }

    /**
     * Get the value stored in a specific memory cell.
     *
     * @param pos The position (cell index) from which to retrieve the value.
     * @return The value stored in the specified memory cell.
     */
    public double getValue(int pos) {
        return memory.get(pos);
    }

    /**
     * Set the value in a specific memory cell.
     *
     * @param value The value to be stored in the memory cell.
     * @param pos   The position (cell index) at which to store the value.
     */
    public void setValue(double value, int pos) {
        this.value = value;
    }
}
