/**
 * The JMP class implements the Instruction interface and represents an unconditional jump
 * instruction in a computer program. It directly sets the program counter to a specified
 * position, unconditionally altering the program's flow.
 */
public class JMP implements Instruction {

    /**
     * Executes the JMP (Jump) instruction, setting the program counter to a specified position,
     * unconditionally altering the program's flow.
     *
     * @param mem     The Memory object that holds the memory cells.
     * @param acc     The Accumulator object.
     * @param counter The ProgramCounter for tracking the program's progress.
     * @param pos     The position (cell index) to which the program counter will be set.
     */
    @Override
    public void execute(Memory mem, Accumulator acc, ProgramCounter counter, int pos) {
        // Set the program counter to the specified position (unconditional jump)
        counter.setCurrentStep(pos);
    }
}
