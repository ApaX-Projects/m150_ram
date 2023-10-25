package m150_ram;
/**
 * The LDI (Load Immediate) class implements the Instruction interface and represents an instruction
 * for loading an immediate value from memory into the accumulator in a computer program.
 * When executed, the LDI instruction loads the immediate value from memory into the accumulator.
 *
 * The LDI instruction is used to load a specific value into the accumulator without any complex calculations.
 *
 * @author Seya
 * @version 1.0
 */
public class LDI implements Instruction
{
    public int pos;

    /**
     * Executes the LDI instruction, loading an indirect value from memory into the accumulator.
     *
     * @param mem     The Memory object that holds the memory cells.
     * @param acc     The Accumulator object for loading and storing values.
     * @param counter The ProgramCounter for tracking the program's progress.
     */
    @Override
    public void execute(Memory mem, Accumulator acc, ProgramCounter counter) {
        // Load an immediate value from memory into the accumulator
        int temp = (int) mem.getValue(pos);
        acc.load(mem, temp);
        counter.addCurrentStep();
    }
}
