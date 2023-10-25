package m150_ram;

/**
 * The m150_ram.SUB class implements the m150_ram.Instruction interface and represents an instruction
 * for performing subtraction in a computer program. It subtracts one value stored
 * in the accumulator from a value in memory and updates the result in memory.
 * @author Seya
 * @version 1.0
 */
public class SUB implements Instruction {

    public int pos;
    /**
     * Executes the m150_ram.SUB instruction, subtracting a value from the accumulator from a value in memory
     * and storing the result back in memory.
     *
     * @param mem     The m150_ram.Memory object that holds the memory cells.
     * @param acc     The m150_ram.Accumulator object for loading and storing values.
     * @param counter The m150_ram.ProgramCounter for tracking the program's progress.
     */
    @Override
    public void execute(Memory mem, Accumulator acc, ProgramCounter counter) {
        // Get values from memory and the accumulator
        double x = mem.getValue(pos);
        double y = acc.getCurrentValue();

        // Perform subtraction and update the value in memory
        mem.setValue(x - y, pos);
        counter.addCurrentStep();
    }
}