package test_cases;

import m150_ram.Accumulator;
import m150_ram.Memory;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test cases for the m150_ram.Accumulator class, which represents a simple accumulator
 * that can load and store values from/to a m150_ram.Memory object.
 */
public class TestAccumulator {
    private Accumulator accumulator;
    private Memory memory;

    /**
     * Set up the test environment by creating an m150_ram.Accumulator and m150_ram.Memory instance.
     */
    @Before
    public void setUp() {
        accumulator = new Accumulator();
        memory = new Memory();
    }

    /**
     * Test the load() method of the m150_ram.Accumulator class, which loads a value from
     * m150_ram.Memory and stores it in the accumulator. It checks if the loaded value
     * matches the expected value and if the accumulator's current value is updated accordingly.
     */
    @Test
    public void testLoad() {
        memory.setValue(42.0, 0);
        double loadedValue = accumulator.load(memory, 0);
        assertEquals(42.0, loadedValue, 0.01);
        assertEquals(42.0, accumulator.getCurrentValue(), 0.01);
    }

    /**
     * Test the store() method of the m150_ram.Accumulator class, which stores a value in
     * m150_ram.Memory. It checks if the stored value in memory matches the expected value.
     */
    @Test
    public void testStore() {
        accumulator.store(memory, 0, 17.5);
        assertEquals(17.5, memory.getValue(0), 0.01);
    }

    /**
     * Test the clear() method of the m150_ram.Accumulator class, which sets the accumulator's
     * current value to 0.0. It checks if the accumulator's value is correctly cleared after
     * being loaded from memory.
     */
    @Test
    public void testClear() {
        memory.setValue(123.45, 0);
        accumulator.load(memory, 0);
        accumulator.clear();
        assertEquals(0.0, accumulator.getCurrentValue(), 0.01);
    }
}
