import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Memory memory = new Memory();
        Accumulator acc = new Accumulator();
        ProgramCounter prgCount = new ProgramCounter();
        ProcessingUnit cpu = new ProcessingUnit();


        cpu.initializeProgram(50);



        }
    }

