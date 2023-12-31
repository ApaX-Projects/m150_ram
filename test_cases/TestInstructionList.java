package test_cases;

import m150_ram.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test cases for the InstructionList class. This class is responsible for testing various methods
 * of the InstructionList class, which is used to manage a list of instructions for program execution.
 *
 * @author Seya
 * @version 1.0
 */
public class TestInstructionList {
    private InstructionList instructionList;
    private ProgramCounter programCounter;

    @Before
    public void setUp() {
        instructionList = new InstructionList();
        programCounter = new ProgramCounter();
    }

    /**
     * Test the addition of instructions to the instruction list.
     */
    @Test
    public void testAddList() {
        Instruction instruction = new ADD();
        instructionList.addList(instruction);
        assertEquals(1, instructionList.instructionList.size());
    }

    /**
     * Test retrieving the last instruction in the instruction list.
     */
    @Test
    public void testLastInstruction() {
        Instruction instruction1 = new ADD();
        Instruction instruction2 = new SUB();
        instructionList.addList(instruction1);
        instructionList.addList(instruction2);
        Instruction last = instructionList.lastInstruction();
        assertEquals(instruction2, last);
    }

    /**
     * Test retrieving instructions from the instruction list by index.
     */
    @Test
    public void testGetInstruction() {
        Instruction instruction1 = new ADD();
        Instruction instruction2 = new SUB();
        instructionList.addList(instruction1);
        instructionList.addList(instruction2);
        Instruction retrievedInstruction1 = instructionList.getInstruction(0);
        Instruction retrievedInstruction2 = instructionList.getInstruction(1);
        assertEquals(instruction1, retrievedInstruction1);
        assertEquals(instruction2, retrievedInstruction2);
    }

    /**
     * Test removing an instruction from the instruction list based on the current program step.
     */
    @Test
    public void testRemInstruction() {
        Instruction instruction1 = new ADD();
        Instruction instruction2 = new SUB();
        instructionList.addList(instruction1);
        instructionList.addList(instruction2);
        programCounter.setCurrentStep(0);
        instructionList.remInstruction(programCounter);
        assertEquals(1, instructionList.instructionList.size());
        assertEquals(instruction2, instructionList.instructionList.get(0));
    }
}
