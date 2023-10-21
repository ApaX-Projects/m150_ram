package m150_ram;

/**
 * The m150_ram.STA class implements the m150_ram.Instruction interface and represents an instruction
 * for storing the current value of the accumulator in memory in a computer program.
 */
public class STA implements Instruction {

    int pos;
    /**
     * Executes the m150_ram.STA (Store m150_ram.Accumulator) instruction, storing the current value of
     * the accumulator into a specified memory cell and leaving the program counter unchanged.
     *
     * @param mem     The m150_ram.Memory object that holds the memory cells.
     * @param acc     The m150_ram.Accumulator object containing the value to be stored.
     * @param counter The m150_ram.ProgramCounter for tracking the program's progress (unchanged).
     */
    @Override
    public void execute(Memory mem, Accumulator acc, ProgramCounter counter) {
        // Store the current value of the accumulator in the specified memory cell
        mem.setValue(acc.getCurrentValue(), pos);
    }
}