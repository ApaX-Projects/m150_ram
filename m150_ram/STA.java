package m150_ram;

/**
 * The STA class implements the Instruction interface and represents an instruction
 * for storing the current value of the accumulator in memory in a computer program.
 * @author Seya
 * @version 1.0
 */
public class STA implements Instruction {

    int pos;
    /**
     * Executes the STA (Store in Accumulator) instruction, storing the current value of
     * the accumulator into a specified memory cell and leaving the program counter unchanged.
     *
     * @param mem     The Memory object that holds the memory cells.
     * @param acc     The Accumulator object containing the value to be stored.
     * @param counter The ProgramCounter for tracking the program's progress (unchanged).
     */
    @Override
    public void execute(Memory mem, Accumulator acc, ProgramCounter counter) {
        // Store the current value of the accumulator in the specified memory cell
        mem.setValue(acc.getCurrentValue(), pos);
    }
}