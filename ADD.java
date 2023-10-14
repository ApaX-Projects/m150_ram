/**
 * The ADD class implements the Instruction interface and represents an instruction
 * for performing addition in a computer program. It adds two values stored in
 * memory and the accumulator and updates the result in memory.
 */
public class ADD implements Instruction {

    /**
     * Executes the ADD instruction, adding a value from memory to the accumulator
     * and storing the result back in memory.
     *
     * @param mem     The Memory object that holds the memory cells.
     * @param acc     The Accumulator object for loading and storing values.
     * @param counter The ProgramCounter for tracking the program's progress.
     * @param pos     The position (cell index) of the memory cell to perform the addition.
     */
    @Override
    public void execute(Memory mem, Accumulator acc, ProgramCounter counter, int pos) {
        // Get values from memory and the accumulator
        double x = mem.getValue(pos);
        double y = acc.load(mem, pos);

        // Perform addition and update the value in memory
        mem.setValue(x + y, pos);
        counter.addCurrentStep();
    }
}
