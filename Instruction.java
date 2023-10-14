public interface Instruction
{
    public void execute(Memory mem,Accumulator acc, ProgramCounter counter, int pos);
}
