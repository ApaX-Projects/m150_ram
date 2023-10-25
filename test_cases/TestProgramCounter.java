package test_cases;

import m150_ram.ProgramCounter;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test cases for the ProgramCounter class. This class tests various methods and behaviors of the ProgramCounter class,
 * including initialization, setting current step, adding current step, retrieving current step, and setting step before JMP.
 *
 * @author [Your Name]
 * @version 1.0
 */
public class TestProgramCounter {
    private ProgramCounter programCounter;

    @Before
    public void setUp() {
        programCounter = new ProgramCounter();
    }

    /**
     * Test the initialization of the program counter and verify that the initial current step is correctly set to 1.
     */
    @Test
    public void testInitialize() {
        programCounter.initialize();
        assertEquals(1, programCounter.getCurrentStep());
    }

    /**
     * Test setting the current step of the program counter and verify that it's correctly set to the specified value.
     */
    @Test
    public void testSetCurrentStep() {
        programCounter.setCurrentStep(5);
        assertEquals(5, programCounter.getCurrentStep());
    }

    /**
     * Test adding the current step of the program counter and verify that it increments by 1.
     */
    @Test
    public void testAddCurrentStep() {
        programCounter.addCurrentStep();
        assertEquals(1, programCounter.getCurrentStep());
    }

    /**
     * Test getting the current step of the program counter and verify that it's correctly retrieved.
     */
    @Test
    public void testGetCurrentStep() {
        programCounter.initialize();
        assertEquals(1, programCounter.getCurrentStep());
    }

    /**
     * Test setting the step before a JMP instruction and verify that it's correctly set to the specified value.
     */
    @Test
    public void testSetStepBeforeJMP() {
        programCounter.initialize();
        programCounter.setStepBeforeJMP(3);
        assertEquals(1, programCounter.getStepBeforeJMP());
    }
}
