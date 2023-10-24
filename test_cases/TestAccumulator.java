package test_cases;

import m150_ram.Accumulator;
import m150_ram.Memory;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestAccumulator {
    private Accumulator accumulator;
    private Memory memory;

    @Before
    public void setUp() {
        accumulator = new Accumulator();
        memory = new Memory();
    }

    @Test
    public void testLoad() {
        memory.setValue(42.0, 0);
        double loadedValue = accumulator.load(memory, 0);
        assertEquals(42.0, loadedValue, 0.01);
        assertEquals(42.0, accumulator.getCurrentValue(), 0.01);
    }

    @Test
    public void testStore() {
        accumulator.store(memory, 0, 17.5);
        assertEquals(17.5, memory.getValue(0), 0.01);
    }

    @Test
    public void testClear() {
        memory.setValue(123.45, 0);
        accumulator.load(memory, 0);
        accumulator.clear();
        assertEquals(0.0, accumulator.getCurrentValue(), 0.01);
    }
}
