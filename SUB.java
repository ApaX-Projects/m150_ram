/**
 * The SUB class implements the Instruction interface and represents an instruction
 * for performing subtraction in a computer program. It subtracts one value stored
 * in the accumulator from a value in memory and updates the result in memory.
 */
public class SUB implements Instruction {

    /**
     * Executes the SUB instruction, subtracting a value from the accumulator from a value in memory
     * and storing the result back in memory.
     *
     * @param mem     The Memory object that holds the memory cells.
     * @param acc     The Accumulator object for loading and storing values.
     * @param counter The ProgramCounter for tracking the program's progress.
     * @param pos     The position (cell index) of the memory cell to perform the subtraction.
     */
    @Override
    public void execute(Memory mem, Accumulator acc, ProgramCounter counter, int pos) {
        // Get values from memory and the accumulator
        double x = mem.getValue(pos);
        double y = acc.getCurrentValue();

        // Perform subtraction and update the value in memory
        mem.setValue(x - y, pos);
        counter.addCurrentStep();
    }
}