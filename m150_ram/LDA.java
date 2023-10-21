package m150_ram;

/**
 * The m150_ram.LDA class implements the m150_ram.Instruction interface and represents an instruction
 * for loading a value from memory into the accumulator in a computer program.
 */
public class LDA implements Instruction {

    int pos;

    /**
     * Executes the m150_ram.LDA instruction, loading a value from memory into the accumulator
     * and incrementing the program counter.
     *
     * @param mem     The m150_ram.Memory object that holds the memory cells.
     * @param acc     The m150_ram.Accumulator object for loading and storing values.
     * @param counter The m150_ram.ProgramCounter for tracking the program's progress.
     */
    @Override
    public void execute(Memory mem, Accumulator acc, ProgramCounter counter) {
        // Load a value from memory into the accumulator
        acc.load(mem, pos);

        // Increment the program counter
        counter.addCurrentStep();
    }
}
