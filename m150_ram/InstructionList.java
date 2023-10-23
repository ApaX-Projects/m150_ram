package m150_ram;

import java.util.ArrayList;

/**
 * The InstructionList class represents a list of instructions used in a simulated
 * machine's program. It provides methods to add instructions to the list, retrieve
 * the last instruction in the list, and access instructions by index.
 *
 * This class is a container for managing a sequence of instructions for program execution.
 *
 * @author Seya
 * @version 1.0
 */
public class InstructionList
{
    ArrayList<Instruction> instructionList = new ArrayList<>();

    /**
     * Adds the given instruction to the list of instructions.
     *
     * @param instruction The instruction to be added to the list.
     */
    public void addList(Instruction instruction)
    {
        instructionList.add(instruction);
    }

    /**
     * Retrieves the last instruction in the list.
     *
     * @return The last instruction in the list.
     */
    public Instruction lastInstruction()
    {
        return instructionList.get(instructionList.size() - 1);
    }

    /**
     * Retrieves an instruction from the list based on the provided index.
     *
     * @param index The index of the instruction to retrieve.
     * @return The instruction at the specified index.
     */
    public Instruction getInstruction(int index)
    {
        if (index > instructionList.size())
        {
            instructionList.add(new HLT());
        }
        return instructionList.get(index);
    }

    public void remInstruction(ProgramCounter counter)
    {
        instructionList.remove(counter.stepBeforeJMP);
    }
}
