package test_cases;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import m150_ram.*;

/**
 * Test case for the LDA (Load Accumulator) instruction. This class tests the behavior of the LDA instruction,
 * which loads a value from memory into the accumulator and increments the program counter.
 *
 * @author [Your Name]
 * @version 1.0
 */
public class TestLDA {
    private LDA ldaInstruction;
    private ProgramCounter programCounter;
    private Accumulator accumulator;
    private Memory memory;

    @Before
    public void setUp() {
        ldaInstruction = new LDA();
        programCounter = new ProgramCounter();
        accumulator = new Accumulator();
        memory = new Memory();
    }

    /**
     * Test the execution of the LDA instruction. It sets a value in memory at a specific position,
     * specifies the memory cell to load from, and checks whether the value is correctly loaded into the accumulator.
     * It also verifies that the program counter is incremented.
     */
    @Test
    public void testExecute() {
        // Set a value in memory at position 2
        memory.initialize(0.0, 5.0);
        ldaInstruction.pos = 1; // Specify the memory cell index

        ldaInstruction.execute(memory, accumulator, programCounter);

        // After execution, the value at position 1 in memory (5.0) should be loaded into the accumulator
        assertEquals(5.0, accumulator.getCurrentValue(), 0.01);
        // The program counter should be incremented from 0 to 1 (Starts at index 0 and increments by 1
        assertEquals(1, programCounter.getCurrentStep());
    }
}
