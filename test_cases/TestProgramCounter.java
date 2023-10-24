package test_cases;

import m150_ram.ProgramCounter;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestProgramCounter {
    private ProgramCounter programCounter;

    @Before
    public void setUp() {
        programCounter = new ProgramCounter();
    }

    @Test
    public void testInitialize() {
        programCounter.initialize();
        assertEquals(1, programCounter.getCurrentStep());
    }

    @Test
    public void testSetCurrentStep() {
        programCounter.setCurrentStep(5);
        assertEquals(5, programCounter.getCurrentStep());
    }

    @Test
    public void testAddCurrentStep() {
        programCounter.addCurrentStep();
        assertEquals(2, programCounter.getCurrentStep());
    }

    @Test
    public void testGetCurrentStep() {
        programCounter.initialize();
        assertEquals(1, programCounter.getCurrentStep());
    }

    @Test
    public void testSetStepBeforeJMP() {
        programCounter.initialize();
        programCounter.setStepBeforeJMP(3);
        assertEquals(1, programCounter.getStepBeforeJMP());
    }
}
