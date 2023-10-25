package test_cases;

import m150_ram.ADD;
import m150_ram.Accumulator;
import m150_ram.Memory;
import m150_ram.ProgramCounter;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test cases for the m150_ram.ADD class, which represents an instruction
 * for performing addition in a computer program.
 */
public class TestADD {
    private ADD addInstruction;
    private Memory memory;
    private Accumulator accumulator;
    private ProgramCounter programCounter;

    /**
     * Set up the test environment by creating instances of m150_ram.ADD, m150_ram.Memory,
     * m150_ram.Accumulator, and m150_ram.ProgramCounter.
     */
    @Before
    public void setUp() {
        addInstruction = new ADD();
        memory = new Memory();
        accumulator = new Accumulator();
        programCounter = new ProgramCounter();
    }

    /**
     * Test the execute() method of the m150_ram.ADD class, which performs addition
     * by adding a value from memory to the accumulator and storing the result back in memory.
     * It checks if the result of the addition matches the expected value in memory cell 1
     * and if the program counter is incremented as expected.
     */
    @Test
    public void testExecute() {
        memory.initialize(5.0, 10.0); // Set values in memory
        accumulator.load(memory, 0); // Load 5.0 into the accumulator
        addInstruction.pos = 1; // Set the memory cell index for the ADD instruction

        addInstruction.execute(memory, accumulator, programCounter);

        // After execution, the result of 5.0 + 10.0 should be stored in memory cell 1
        assertEquals(15.0, memory.getValue(1), 0.01);
        // The program counter should be incremented from 0 to 1
        assertEquals(1, programCounter.getCurrentStep());
    }
}
