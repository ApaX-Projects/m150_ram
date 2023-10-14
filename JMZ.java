/**
 * The JMZ class implements the Instruction interface and represents a conditional jump
 * instruction in a computer program. It checks the current value of the accumulator,
 * and if it is equal to zero, it sets the program counter to a specified position (jump).
 * Otherwise, it increments the program counter.
 */
public class JMZ implements Instruction {

    /**
     * Executes the JMZ (Jump if Zero) instruction, checking if the current value of the
     * accumulator is zero. If it is, the program counter is set to a specified position.
     * Otherwise, the program counter is incremented.
     *
     * @param mem     The Memory object that holds the memory cells.
     * @param acc     The Accumulator object containing the value to check.
     * @param counter The ProgramCounter for tracking the program's progress.
     * @param pos     The position (cell index) to jump to if the accumulator value is zero.
     */
    @Override
    public void execute(Memory mem, Accumulator acc, ProgramCounter counter, int pos) {
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
