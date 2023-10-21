package m150_ram;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The CommandLineUI class provides a command-line user interface for interacting with a simulated
 * machine's memory and executing a list of instructions. It allows users to input instructions and
 * data, execute the program, and view program execution status.
 *
 * The class supports a set of predefined instructions, including LDA, STA, ADD, SUB, JMP, JMZ, and HLT,
 * which can be added to an instruction list and executed step by step.
 *
 * The user interacts with the program via the command-line interface, selecting options and providing
 * inputs as necessary.
 *
 * @author Seya
 * @version 1.0
 */
public class CommandLineUI {
    private Scanner scanner;

    /**
     * Constructs a CommandLineUI object and initializes a scanner for user input.
     */
    public CommandLineUI() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Initializes the command-line user interface, allowing the user to input instructions and data,
     * execute the program step by step, and view program execution status.
     *
     * @param mem The memory used by the simulated machine.
     * @param acc The accumulator used by the simulated machine.
     * @param counter The program counter used to track program execution.
     * @throws InterruptedException If there is an issue with thread sleeping during program execution.
     */
    public void initialize(Memory mem, Accumulator acc, ProgramCounter counter) throws InterruptedException {

        InstructionList list = new InstructionList();

        ADD add = new ADD();
        SUB sub = new SUB();
        LDA lda = new LDA();
        STA sta = new STA();
        JMP jmp = new JMP();
        JMZ jmz = new JMZ();
        HLT hlt = new HLT();

        int scannerState = 1;
        int instructionIndex = 0;
        int posMem = 0;



        while (scannerState == 1) {



            System.out.println("Memory: ");
            for (int i = 0; i < mem.getSize(); i++) {
                System.out.print("[" + mem.getValue(i) + "]");
            }
            System.out.println("---------------------------------");
            System.out.println("Command-Line User Interface");
            System.out.println("1. LDA X");
            System.out.println("2. STA X");
            System.out.println("3. ADD");
            System.out.println("4. SUB");
            System.out.println("5. JMP X");
            System.out.println("6. JMZ X");
            System.out.println("7. HLT");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");
            int choice = scanner.nextInt();

            if (choice <= 6)
            {
                System.out.print("Enter the desired Position of the Memory: ");
                posMem = scanner.nextInt();
            }

            switch (choice) {
                case 1:
                    // Perform action for Option 1
                    lda.pos = posMem;
                    list.addList(lda);
                    break;
                case 2:
                    // Perform action for Option 2
                    sta.pos = posMem;
                    list.addList(sta);
                    break;
                case 3:
                    // Perform action for Option 3
                    add.pos = posMem;
                    list.addList(add);
                    break;
                case 4:
                    // Perform action for Option 4
                    sub.pos = posMem;
                    list.addList(sub);
                    break;

                case 5:
                    // Perform action for Option 5
                    jmp.pos = posMem;
                    list.addList(jmp);
                    break;
                case 6:
                    // Perform action for Option 6
                    jmz.pos = posMem;
                    list.addList(jmz);
                    break;
                case 7:
                    // Perform action for Option 7
                    list.addList(hlt);
                    break;
                case 8:
                    // Perform action for Option 8
                    Instruction last = list.lastInstruction();
                    if (last != hlt) {
                        list.addList(hlt);
                    }

                    scannerState = 2;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-8).");
            }
        }

        while(scannerState == 2)
        {
            System.out.println("Memory: ");
            for (int i = 0; i < mem.getSize(); i++) {
                System.out.print("[" + mem.getValue(i) + "]");
            }

            System.out.println("\n---------------------------------");
            System.out.println("Instruction List: ");
            System.out.println("Current Instruction: " + list.getInstruction(counter.currentStep));
            System.out.println("Upcoming Instruction: " + list.getInstruction(counter.currentStep + 1));

            Instruction currentInstruction = list.getInstruction(counter.currentStep);
            currentInstruction.execute(mem, acc, counter);

            Thread.sleep(2000);
            if (counter.currentStep == list.instructionList.size() - 1)
            {
                scannerState = 3;
            }
        }

        while (scannerState == 3)
        {
            System.out.println("Finished Array:");
            for (int i = 0; i < mem.getSize(); i++) {
                System.out.print("[" + mem.getValue(i) + "]");
            }

            System.out.println();
            System.out.println("Program terminates in 10sec");
            Thread.sleep(10000);
            scanner.close();


            }
        }
    }
