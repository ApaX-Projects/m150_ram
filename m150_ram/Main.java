package m150_ram;

public class Main
{
    public static void main (String[] args) throws InterruptedException {
        /*
        Memory memory = new m150_ram.Memory();
        Accumulator acc = new m150_ram.Accumulator();
        ProgramCounter prgCount = new m150_ram.ProgramCounter();
        ProcessingUnit cpu = new m150_ram.ProcessingUnit();


        cpu.initializeProgram(50);
         */

        Memory memory = new Memory();
        Accumulator acc = new Accumulator();
        ProgramCounter prgCount = new ProgramCounter();
        CommandLineUI cmdUI = new CommandLineUI();

        memory.initialize(2.0, 3.0);
        cmdUI.initialize(memory, acc, prgCount);




        }
    }

