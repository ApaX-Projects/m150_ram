package test_cases;

import m150_ram.Memory;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMemory {
    private Memory memory;

    @Before
    public void setUp() {
        memory = new Memory();
    }

    @Test
    public void testInitialize() {
        memory.initialize(5.0, 10.0);
        assertEquals(5.0, memory.getValue(0), 0.01);
        assertEquals(10.0, memory.getValue(1), 0.01);
    }

    @Test
    public void testClear() {
        memory.initialize(5.0, 10.0);
        memory.clear();
        assertEquals(0, memory.getSize());
    }

    @Test
    public void testGetSize() {
        memory.initialize(1.0, 2.0);
        assertEquals(2, memory.getSize());
    }

    @Test
    public void testGetValue() {
        memory.initialize(2.5, 4.5);
        assertEquals(2.5, memory.getValue(0), 0.01);
        assertEquals(4.5, memory.getValue(1), 0.01);
    }

    @Test
    public void testSetValue() {
        memory.initialize(1.0, 2.0);
        memory.setValue(3.0, 1);
        assertEquals(3.0, memory.getValue(1), 0.01);
    }

    @Test
    public void testSetValueNewCell() {
        memory.initialize(1.0, 2.0);
        memory.setValue(4.0, 3);
        assertEquals(4.0, memory.getValue(3), 0.01);
    }
}
