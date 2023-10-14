/**
 * The LDA class implements the Instruction interface and represents an instruction
 * for loading a value from memory into the accumulator in a computer program.
 */
public class LDA implements Instruction {

    /**
     * Executes the LDA instruction, loading a value from memory into the accumulator
     * and incrementing the program counter.
     *
     * @param mem     The Memory object that holds the memory cells.
     * @param acc     The Accumulator object for loading and storing values.
     * @param counter The ProgramCounter for tracking the program's progress.
     * @param pos     The position (cell index) of the memory cell from which to load the value.
     */
    @Override
    public void execute(Memory mem, Accumulator acc, ProgramCounter counter, int pos) {
        // Load a value from memory into the accumulator
        acc.load(mem, pos);

        // Increment the program counter
        counter.addCurrentStep();
    }
}
