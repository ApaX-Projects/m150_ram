package m150_ram;

/**
 * The ProgramCounter class represents a counter that tracks the current progress of a running program.
 * @author Seya
 * @version 1.0
 */
public class ProgramCounter {
    int currentStep; // The current step or program counter value.
    int stepBeforeJMP;

    /**
     * Initializes the program counter to a default value (1).
     */
    public void initialize() {
        currentStep = 1;
    }

    /**
     * Set the current step to a specified value.
     *
     * @param currentStep The value to set as the current step.
     */
    public void setCurrentStep(int currentStep) {
        this.currentStep = currentStep;
    }

    /**
     * Adds 1 to the current Program Count.
     */
    public void addCurrentStep()
    {
        this.currentStep++;
    }

    /**
     * Get the current step of the program.
     *
     * @return The current step or program counter value.
     */
    public int getCurrentStep() {
        return currentStep;
    }

    public void setStepBeforeJMP(int stepBeforeJMP) {
        this.stepBeforeJMP = getCurrentStep();
    }

    /**
     * Get the step before the jump of the program.
     *
     * @return The current step or program counter value.
     */
    public int getStepBeforeJMP() {
        return stepBeforeJMP;
    }
}
