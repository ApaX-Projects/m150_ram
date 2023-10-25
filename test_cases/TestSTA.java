package test_cases;

import m150_ram.Accumulator;
import m150_ram.Memory;
import m150_ram.ProgramCounter;
import m150_ram.STA;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestSTA {
    private STA staInstruction;
    private ProgramCounter programCounter;
    private Accumulator accumulator;
    private Memory memory;

    @Before
    public void setUp() {
        staInstruction = new STA();
        programCounter = new ProgramCounter();
        accumulator = new Accumulator();
        memory = new Memory();
    }

    @Test
    public void testExecute() {
        memory.initialize(1.0, 2.0);
        // Set the value in the accumulator and specify the memory cell index for storage
        accumulator.load(memory, 0); // Load a value into the accumulator (e.g., 5.0)
        staInstruction.pos = 1; // Specify the memory cell index for storage

        staInstruction.execute(memory, accumulator, programCounter);

        // After execution, the value in the accumulator should be stored in memory cell 1
        assertEquals(1.0, memory.getValue(1), 0.01);
        // The program counter should be incremented
        assertEquals(1, programCounter.getCurrentStep());
    }
}
