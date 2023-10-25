package test_cases;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import m150_ram.*;

/**
 * JUnit test cases for the m150_ram.HLT class, which represents an instruction for terminating
 * the execution of a computer program by clearing the memory and accumulator.
 */
public class TestHLT {
    private HLT hltInstruction;
    private Memory memory;
    private Accumulator accumulator;
    private ProgramCounter programCounter;

    /**
     * Set up the test environment by creating instances of m150_ram.HLT, m150_ram.Memory,
     * m150_ram.Accumulator, and m150_ram.ProgramCounter.
     */
    @Before
    public void setUp() {
        hltInstruction = new HLT();
        memory = new Memory();
        accumulator = new Accumulator();
        programCounter = new ProgramCounter();
    }

    /**
     * Test the execute() method of the m150_ram.HLT class, which clears the memory and accumulator
     * to halt the program's execution. It checks if both the memory and accumulator are cleared
     * after the HLT instruction is executed.
     */
    @Test
    public void testExecute() {
        // Set some values in memory and the accumulator
        memory.initialize(5.0, 10.0);
        accumulator.load(memory, 0);

        hltInstruction.execute(memory, accumulator, programCounter);

        // After execution, the memory should be cleared (size = 0) and the accumulator's value should be 0.0
        assertEquals(0, memory.getSize());
        assertEquals(0.0, accumulator.getCurrentValue(), 0.01);
    }
}
