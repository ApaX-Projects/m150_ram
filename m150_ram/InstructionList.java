package m150_ram;

import java.util.ArrayList;

public class InstructionList
{
    ArrayList<Instruction> instructionList = new ArrayList<>();


    public void addList(Instruction instruction)
    {
        instructionList.add(instruction);
    }

    public Instruction lastInstruction()
    {
        return instructionList.get(instructionList.size() - 1);
    }

    public Instruction getInstruction(int index)
    {
        return instructionList.get(index);
    }
}
