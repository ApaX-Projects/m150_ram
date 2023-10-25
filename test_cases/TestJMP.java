package test_cases;

import m150_ram.JMP;
import m150_ram.ProgramCounter;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test case for the JMP (Jump) instruction. This class tests the behavior of the JMP instruction
 * by setting the current step, specifying the jump position, and checking if the program counter
 * is correctly updated after execution.
 *
 * @author Seya
 * @version 1.0
 */
public class TestJMP {
    private JMP jmpInstruction;
    private ProgramCounter programCounter;

    @Before
    public void setUp() {
        jmpInstruction = new JMP();
        programCounter = new ProgramCounter();
    }

    /**
     * Test the execution of the JMP instruction. It sets the current step to 3 and specifies the jump position as 5.
     * After execution, it checks whether the program counter is correctly updated to the specified position (5).
     * It also verifies that the step before the JMP is correctly set to the previous step (3).
     */
    @Test
    public void testExecute() {
        // Set the current step to 3 and specify the jump position as 5
        programCounter.setCurrentStep(3);
        jmpInstruction.pos = 5;

        jmpInstruction.execute(null, null, programCounter);

        // After execution, the program counter should be set to the specified position (5)
        assertEquals(5, programCounter.getCurrentStep());
        // The step before the JMP should be set to the previous step (3)
        assertEquals(3, programCounter.getStepBeforeJMP());
    }
}
