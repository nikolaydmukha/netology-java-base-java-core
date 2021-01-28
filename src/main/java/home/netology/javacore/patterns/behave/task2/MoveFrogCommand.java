package home.netology.javacore.patterns.behave.task2;

public class MoveFrogCommand implements FrogCommand {

    private Frog frog;
    private int steps;

    public MoveFrogCommand(Frog frog, int steps) {
        this.frog = frog;
        this.steps = steps;
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
