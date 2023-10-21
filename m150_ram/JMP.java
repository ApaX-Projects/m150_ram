package m150_ram;

/**
 * The m150_ram.JMP class implements the m150_ram.Instruction interface and represents an unconditional jump
 * instruction in a computer program. It directly sets the program counter to a specified
 * position, unconditionally altering the program's flow.
 */
public class JMP implements Instruction {

    int pos;
    /**
     * Executes the m150_ram.JMP (Jump) instruction, setting the program counter to a specified position,
     * unconditionally altering the program's flow.
     *
     * @param mem     The m150_ram.Memory object that holds the memory cells.
     * @param acc     The m150_ram.Accumulator object.
     * @param counter The m150_ram.ProgramCounter for tracking the program's progress.
     */
    @Override
    public void execute(Memory mem, Accumulator acc, ProgramCounter counter) {
        // Set the program counter to the specified position (unconditional jump)
        counter.setCurrentStep(pos);
    }
}
