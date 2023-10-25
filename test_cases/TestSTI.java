package test_cases;

import m150_ram.Accumulator;
import m150_ram.Memory;
import m150_ram.ProgramCounter;
import m150_ram.STI;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestSTI {
    private STI stiInstruction;
    private ProgramCounter programCounter;
    private Accumulator accumulator;
    private Memory memory;

    @Before
    public void setUp() {
        stiInstruction = new STI();
        programCounter = new ProgramCounter();
        accumulator = new Accumulator();
        memory = new Memory();
    }

    @Test
    public void testExecute() {
        // Set a value in memory at position 2
        memory.initialize(2.0, 0.0);
        memory.setValue(1.0, 2);
        accumulator.load(memory, 2);

        stiInstruction.pos = 1; // Specify the memory cell index

        stiInstruction.execute(memory, accumulator, programCounter);

        // After execution, the value in the accumulator should be stored in memory cell 1
        assertEquals(0.0, memory.getValue(1), 0.01);
        // The program counter should be incremented
        assertEquals(1, programCounter.getCurrentStep());
    }
}
