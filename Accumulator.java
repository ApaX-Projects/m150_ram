/**
 * The Accumulator class represents a simple accumulator that can load and store values from/to a Memory object.
 */
public class Accumulator {

    double currentValue;

    /**
     * Load a value from a specified memory cell.
     *
     * @param mem The Memory object from which to load the value.
     * @param pos The position (cell index) from which to load the value.
     * @return The value loaded from the memory cell.
     */
    public double load(Memory mem, int pos) {
        currentValue = mem.getValue(pos);
        return mem.getValue(pos);
    }

    /**
     * Store a value in a specified memory cell.
     *
     * @param mem   The Memory object in which to store the value.
     * @param pos   The position (cell index) at which to store the value.
     * @param value The value to be stored in the memory cell.
     */
    public void store(Memory mem, int pos, double value) {
        mem.setValue(value, pos);
    }
    public double getCurrentValue()
    {
        return currentValue;
    }

    public void clear()
    {
        currentValue = Double.parseDouble(null);
    }
}