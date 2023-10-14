/**
 * The STA class implements the Instruction interface and represents an instruction
 * for storing the current value of the accumulator in memory in a computer program.
 */
public class STA implements Instruction {

    /**
     * Executes the STA (Store Accumulator) instruction, storing the current value of
     * the accumulator into a specified memory cell and leaving the program counter unchanged.
     *
     * @param mem     The Memory object that holds the memory cells.
     * @param acc     The Accumulator object containing the value to be stored.
     * @param counter The ProgramCounter for tracking the program's progress (unchanged).
     * @param pos     The position (cell index) of the memory cell where the value will be stored.
     */
    @Override
    public void execute(Memory mem, Accumulator acc, ProgramCounter counter, int pos) {
        // Store the current value of the accumulator in the specified memory cell
        mem.setValue(acc.getCurrentValue(), pos);
    }
}