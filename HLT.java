public class HLT implements Instruction
{

    /**
     * @param mem
     * @param acc
     * @param counter
     * @param pos
     */
    @Override
    public void execute(Memory mem, Accumulator acc, ProgramCounter counter, int pos)
    {
        mem.clear();
        acc.clear();
    }
}
