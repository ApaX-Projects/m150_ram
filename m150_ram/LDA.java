package m150_ram;

/**
 * The LDA class implements the Instruction interface and represents an instruction
 * for loading a value from memory into the accumulator in a computer program.
 *
 * @author Seya
 * @version 1.0
 */
public class LDA implements Instruction {

    public int pos;

    /**
     * Executes the LDA instruction, loading a value from memory into the accumulator
     * and incrementing the program counter.
     *
     * @param mem     The Memory object that holds the memory cells.
     * @param acc     The Accumulator object for loading and storing values.
     * @param counter The ProgramCounter for tracking the program's progress.
     */
    @Override
    public void execute(Memory mem, Accumulator acc, ProgramCounter counter) {
        // Load a value from memory into the accumulator
        acc.load(mem, pos);

        // Increment the program counter
        counter.addCurrentStep();
    }
}
