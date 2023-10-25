package test_cases;

import m150_ram.Memory;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test cases for the Memory class. This class tests various methods and behaviors of the Memory class,
 * including initialization, clearing, size determination, setting, and getting values in memory cells.
 *
 * @author [Your Name]
 * @version 1.0
 */
public class TestMemory {
    private Memory memory;

    @Before
    public void setUp() {
        memory = new Memory();
    }

    /**
     * Test the initialization of memory cells with specific values and verify that the values are correctly set.
     */
    @Test
    public void testInitialize() {
        memory.initialize(5.0, 10.0);
        assertEquals(5.0, memory.getValue(0), 0.01);
        assertEquals(10.0, memory.getValue(1), 0.01);
    }

    /**
     * Test the clearing of memory cells and verify that the memory size becomes zero.
     */
    @Test
    public void testClear() {
        memory.initialize(5.0, 10.0);
        memory.clear();
        assertEquals(0, memory.getSize());
    }

    /**
     * Test the determination of memory size and verify that it accurately reflects the number of memory cells.
     */
    @Test
    public void testGetSize() {
        memory.initialize(1.0, 2.0);
        assertEquals(2, memory.getSize());
    }

    /**
     * Test the retrieval of values from memory cells and verify that the correct values are obtained.
     */
    @Test
    public void testGetValue() {
        memory.initialize(2.5, 4.5);
        assertEquals(2.5, memory.getValue(0), 0.01);
        assertEquals(4.5, memory.getValue(1), 0.01);
    }

    /**
     * Test the setting of values in memory cells and verify that the specified values are correctly stored.
     */
    @Test
    public void testSetValue() {
        memory.initialize(1.0, 2.0);
        memory.setValue(3.0, 1);
        assertEquals(3.0, memory.getValue(1), 0.01);
    }

    /**
     * Test the setting of values in new memory cells and verify that the new cells are created and populated with the specified values.
     */
    @Test
    public void testSetValueNewCell() {
        memory.initialize(1.0, 2.0);
        memory.setValue(4.0, 3);
        assertEquals(4.0, memory.getValue(2), 0.01);
    }
}
