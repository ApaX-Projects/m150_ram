package m150_ram;

/**
 * The JMP class implements the Instruction interface and represents an unconditional jump
 * instruction in a computer program. It directly sets the program counter to a specified
 * position, unconditionally altering the program's flow.
 * @author Seya
 * @version 1.0
 */
public class JMP implements Instruction {

    public int pos;

    /**
     * Executes the JMP (Jump) instruction, setting the program counter to a specified position,
     * unconditionally altering the program's flow.
     *
     * @param mem     The Memory object that holds the memory cells.
     * @param acc     The Accumulator object.
     * @param counter The ProgramCounter for tracking the program's progress.
     */
    @Override
    public void execute(Memory mem, Accumulator acc, ProgramCounter counter) {
        // Set the program counter to the specified position (unconditional jump)
        counter.setStepBeforeJMP(counter.getCurrentStep());
        counter.setCurrentStep(pos);
    }

}
