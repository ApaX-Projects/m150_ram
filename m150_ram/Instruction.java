package m150_ram;
/**
 * The Instruction interface represents an instruction that can be executed in a simulated machine.
 * Implementing classes are expected to define the behavior of the execute method for specific
 * instructions. These instructions typically interact with the machine's memory, accumulator, and program counter.
 *
 * Implementing classes must provide concrete implementations of the execute method to define the actions
 * associated with each specific instruction.
 *
 * @author Seya
 * @version 1.0
 */
public interface Instruction
{
    /**
     * Executes the specific behavior associated with this instruction, using the provided
     * memory, accumulator, and program counter.
     *
     * @param mem The memory used by the simulated machine.
     * @param acc The accumulator used by the simulated machine.
     * @param counter The program counter used to track program execution.
     */
    public void execute(Memory mem, Accumulator acc, ProgramCounter counter);
}
