package m150_ram;

/**
 * The m150_ram.JMZ class implements the m150_ram.Instruction interface and represents a conditional jump
 * instruction in a computer program. It checks the current value of the accumulator,
 * and if it is equal to zero, it sets the program counter to a specified position (jump).
 * Otherwise, it increments the program counter.
 */
public class JMZ implements Instruction {

    int pos;
    /**
     * Executes the m150_ram.JMZ (Jump if Zero) instruction, checking if the current value of the
     * accumulator is zero. If it is, the program counter is set to a specified position.
     * Otherwise, the program counter is incremented.
     *
     * @param mem     The m150_ram.Memory object that holds the memory cells.
     * @param acc     The m150_ram.Accumulator object containing the value to check.
     * @param counter The m150_ram.ProgramCounter for tracking the program's progress.
     */
    @Override
    public void execute(Memory mem, Accumulator acc, ProgramCounter counter) {
        // Check if the current value of the accumulator is zero
        if (acc.getCurrentValue() == 0) {
            // Set the program counter to the specified position (jump)
            counter.setCurrentStep(pos);
        } else {
            // Increment the program counter
            counter.addCurrentStep();
        }
    }
}
