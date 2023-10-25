package test_cases;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import m150_ram.*;

public class TestLDI {
    private LDI ldiInstruction;
    private ProgramCounter programCounter;
    private Accumulator accumulator;
    private Memory memory;

    @Before
    public void setUp() {
        ldiInstruction = new LDI();
        programCounter = new ProgramCounter();
        accumulator = new Accumulator();
        memory = new Memory();
    }

    @Test
    public void testExecute() {
        // Set a value in memory at position 2
        memory.initialize(2.0, 0.0);
        ldiInstruction.pos = 1; // Specify the memory cell index

        ldiInstruction.execute(memory, accumulator, programCounter);

        // After execution, the indirect value at position 1 in memory should be loaded into the accumulator which is 2.0
        assertEquals(2.0, accumulator.getCurrentValue(), 0.01);
        // The program counter should be incremented
        assertEquals(1, programCounter.getCurrentStep());
    }
}
