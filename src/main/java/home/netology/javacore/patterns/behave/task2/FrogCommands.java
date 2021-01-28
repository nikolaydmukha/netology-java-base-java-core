package home.netology.javacore.patterns.behave.task2;

public class FrogCommands implements FrogCommand {

    private Frog frog;
    private int steps;

    public FrogCommands(Frog frog, int steps) {
        this.frog = frog;
        this.steps = steps;
    }

    private FrogCommand jump() {
        return new MoveFrogCommand(frog, steps);
    }

    @Override
    public boolean doAction() {
        return frog.jump(steps);
    }

    @Override
    public boolean undoAction() {
        return frog.jump(-1 * steps);
    }
}
