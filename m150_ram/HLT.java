package m150_ram;
/**
 * The HLT (Halt) class implements the Instruction interface and represents an instruction
 * for terminating the execution of a computer program. When executed, the HLT instruction
 * clears the memory and accumulator, effectively stopping program execution.
 *
 * The HLT instruction serves as a program termination point and is used to halt the program's execution.
 *
 * @author Seya
 * @version 1.0
 */
public class HLT implements Instruction
{
    /**
     * Executes the HLT instruction, clearing the memory and accumulator to halt the program.
     *
     * @param mem     The Memory object that holds the memory cells.
     * @param acc     The Accumulator object for loading and storing values.
     * @param counter The ProgramCounter for tracking the program's progress.
     */
    @Override
    public void execute(Memory mem, Accumulator acc, ProgramCounter counter)
    {
        // Clear the memory and accumulator, effectively halting program execution
        mem.clear();
        acc.clear();
    }
}
