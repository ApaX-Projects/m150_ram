package m150_ram;

public class STI implements Instruction
{
    public int pos;

    /**
     * Executes the specific behavior associated with this instruction, using the provided
     * memory, accumulator, and program counter.
     *
     * @param mem     The memory used by the simulated machine.
     * @param acc     The accumulator used by the simulated machine.
     * @param counter The program counter used to track program execution.
     */
    @Override
    public void execute(Memory mem, Accumulator acc, ProgramCounter counter) {

            int temp = (int)mem.getValue(pos);
            acc.load(mem, temp);
            mem.setValue(acc.getCurrentValue(), temp);
            counter.addCurrentStep();
    }
}
