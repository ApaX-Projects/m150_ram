package test_cases;

import m150_ram.Accumulator;
import m150_ram.Memory;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestADD
{

    private Accumulator accumulator;
    private Memory memory;
    @Before
    public void setUp() {
        accumulator = new Accumulator();
        memory = new Memory();
    }

    @Test
    public void testExecute()
    {
        memory.setValue(42.0, 0);
        double loadedValue = accumulator.load(memory, 0);
        assertEquals(42.0, loadedValue, 0.01);
        assertEquals(42.0, accumulator.getCurrentValue(), 0.01);
    }

}
