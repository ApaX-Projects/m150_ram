package m150_ram;
/**
 * The Main class serves as the entry point for a simulated program execution in a computer simulation.
 * It creates instances of memory, an accumulator, a program counter, and a command-line user interface.
 * It then initializes the memory, executes the program via the user interface, and handles program termination.
 *
 * This class demonstrates the basic structure and flow of the simulated program execution.
 *
 * @author Seya
 * @version 1.0
 */
public class Main
{
    /**
     * The main method is the entry point for the program. It creates instances of memory, an accumulator,
     * a program counter, and a command-line user interface. It initializes the memory, executes the program
     * via the user interface, and handles program termination.
     *
     * @param args The command-line arguments (not used in this program).
     * @throws InterruptedException If there is an issue with thread sleeping during program execution.
     */
    public static void main(String[] args) throws InterruptedException {

        Memory memory = new Memory();
        Accumulator acc = new Accumulator();
        ProgramCounter prgCount = new ProgramCounter();
        CommandLineUI cmdUI = new CommandLineUI();

        // Initialize memory with specific values
        memory.initialize(2.0, 3.0);

        // Initialize the command-line user interface for program interaction
        cmdUI.initialize(memory, acc, prgCount);
    }
}
