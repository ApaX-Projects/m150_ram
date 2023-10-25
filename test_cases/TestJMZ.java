package test_cases;

import m150_ram.Accumulator;
import m150_ram.JMZ;
import m150_ram.Memory;
import m150_ram.ProgramCounter;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestJMZ {
    private JMZ jmzInstruction;
    private ProgramCounter programCounter;
    private Accumulator accumulator;
    private Memory memory;

    @Before
    public void setUp() {
        jmzInstruction = new JMZ();
        programCounter = new ProgramCounter();
        accumulator = new Accumulator();
        memory = new Memory();

    }

    @Test
    public void testExecuteWhenAccumulatorIsZero() {

        // Initialize the memory with 0.0 in the first cell (index 0)
        memory.initialize(0.0,2.0);

        // Set the current step to 3, specify the jump position as 5, and set the accumulator to zero
        programCounter.setCurrentStep(3);
        jmzInstruction.pos = 5;
        accumulator.load(memory, 0); // Load 0 into the accumulator

        jmzInstruction.execute(memory, accumulator, programCounter);

        // Since the accumulator is zero, the program counter should be set to the specified position (5)
        assertEquals(5, programCounter.getCurrentStep());
    }

    @Test
    public void testExecuteWhenAccumulatorIsNotZero() {

        // Initialize the memory with 1.0 in the first cell (index 0)
        memory.initialize(1.0,2.0);

        // Set the current step to 3, specify the jump position as 5, and set the accumulator to a non-zero value
        programCounter.setCurrentStep(3);
        jmzInstruction.pos = 5;
        accumulator.load(memory, 0); // Load a non-zero value into the accumulator

        jmzInstruction.execute(memory, accumulator, programCounter);

        // Since the accumulator is not zero, the program counter should be incremented
        assertEquals(4, programCounter.getCurrentStep());
    }
}
