package m150_ram;

public class HLT implements Instruction
{

    /**
     * @param mem
     * @param acc
     * @param counter
     */
    @Override
    public void execute(Memory mem, Accumulator acc, ProgramCounter counter)
    {
        mem.clear();
        acc.clear();
    }
}
