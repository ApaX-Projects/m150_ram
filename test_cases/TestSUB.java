package test_cases;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import m150_ram.*;

public class TestSUB {
    private SUB subInstruction;
    private ProgramCounter programCounter;
    private Accumulator accumulator;
    private Memory memory;

    @Before
    public void setUp() {
        subInstruction = new SUB();
        programCounter = new ProgramCounter();
        accumulator = new Accumulator();
        memory = new Memory();
    }

    @Test
    public void testExecute() {
        // Set values in memory and load one value into the accumulator
        memory.initialize(10.0, 5.0);
        accumulator.load(memory, 0); // Load 10.0 into the accumulator
        subInstruction.pos = 1; // Specify the memory cell index for subtraction

        subInstruction.execute(memory, accumulator, programCounter);

        // After execution, the result of 5.0 - 10.0 should be stored in memory cell 1
        assertEquals(-5.0, memory.getValue(1), 0.01);
        // The program counter should be incremented
        assertEquals(1, programCounter.getCurrentStep());
    }
}
