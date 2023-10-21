package m150_ram;

public interface Instruction
{
    public void execute(Memory mem, Accumulator acc, ProgramCounter counter);
}
